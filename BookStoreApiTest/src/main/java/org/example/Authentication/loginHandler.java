package org.example.Authentication;

import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;

public class loginHandler {
    public void handle(HttpExchange t) throws IOException {

        String response = null;
        try{
            String Base64EncodedCredentials = t.getRequestHeaders().get("Authorization").get(0).split(" ")[1];
            JWTtoken tmp = new JWTtoken(Base64EncodedCredentials, 10);
            response = tmp.toString();
        } catch (Exception e) {
            System.out.println("JWT token creation error: " + e);
            throw new RuntimeException(e);
        }

        t.sendResponseHeaders(200, response.length());

        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();

        t.close();
    }
}
