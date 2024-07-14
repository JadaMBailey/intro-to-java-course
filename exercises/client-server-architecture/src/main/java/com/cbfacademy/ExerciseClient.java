package com.cbfacademy;

import java.io.PrintWriter;
import java.net.Socket;

class ExerciseClient {

    public static void main(String[] args) {
        try (Socket socket = new Socket("local host", 4040)); {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true)
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}