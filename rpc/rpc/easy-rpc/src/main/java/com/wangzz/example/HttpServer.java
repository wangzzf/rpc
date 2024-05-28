package com.wangzz.example;

/**
 * 定义统一的启动服务器方法，为了实现多种不同的web服务器
 */
public interface HttpServer {
    /**
     * 启动服务器
     */
    void doStart(int port);
}
