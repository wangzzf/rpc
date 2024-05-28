package com.wangzz.example.provider;

import com.wangzz.example.HttpServer;
import com.wangzz.example.VertxHttpServer;

public class EasyProviderExample {
    public static void main(String[] args) {
        // 启动web服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
