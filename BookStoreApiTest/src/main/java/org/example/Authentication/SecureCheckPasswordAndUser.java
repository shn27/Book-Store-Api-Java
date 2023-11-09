package org.example.Authentication;


import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SecureCheckPasswordAndUser  {
    public static void main(String[] args) {
        HttpServer server = null;
        try {
            server = HttpServer.create(new InetSocketAddress(8000), 0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //HttpContext _books = server.createContext("/bookstore/books", new bookHandler());
        HttpContext _login = server.createContext("/bookstore/login", (HttpHandler) new loginHandler());

    }
}
