package com.cbfacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ExerciseServer{

    public void listenConnection(){
      try (ServerSocket randomServer = new ServerSocket(4040)) {
        System.out.println("Server is listening to port 4040...");

        while (true) {
            try(Socket clienSocket = randomServer.accept(); // accept to the connection
            BufferedReader in = new BufferedReader(new InputStreamReader(clienSocket.getInputStream()));
            /*
             * Would be written as 
             * InputSreamReader rdmVar = new InputSreamReader(clienSocket.getInputStream());
             * BufferedReader in = new BufferedReader(rdmVar);
             */
            String message = in.readLine();
            System.out.println("Received message from client");
        
            ); 

        }
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
      



    }


}