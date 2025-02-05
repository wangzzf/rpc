package com.wangzz.example;

import io.vertx.core.Vertx;

public class VertxHttpServer implements HttpServer {


    public void doStart(int port) {
        // 创建vert.x的实例
        Vertx vertx = Vertx.vertx();

        // 创建http服务器
        io.vertx.core.http.HttpServer server = vertx.createHttpServer();

        // 监听端口并处理请求
        server.requestHandler(request -> {
            // 处理http请求
            System.out.println("Received request:" + request.method() + "" + request.uri());

            // 发送http响应
            request.response()
                    .putHeader("content-type", "text/plain")
                    .end("Hello from Vert.x Http server!");
        });

        // 启动Http服务器并监听指定端口
        server.listen(port, result -> {
            if (result.succeeded()){
                System.out.println("HTTP server started on port " + port);
            }else{
                System.err.println("Failed to start HTTP server:" + result.cause());
            }
        });
    }
}
