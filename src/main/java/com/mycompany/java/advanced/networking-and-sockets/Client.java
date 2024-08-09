package com.mycompany.java.advanced.networkingandsockets;

import java.net.*;
import java.io.*;

public class Client {
    // initialize socket and input output streams

    private Socket socket = null;
    //private DataInputStream input = null;
    BufferedReader input = null;
    private DataOutputStream out = null;

    // constructor to put IP address and port
    public Client(String address, int port) {
        // establish a connection
        try {
            socket = new Socket(address, port);
            System.out.println("Connected");

            // takes input from terminal
            //input = new DataInputStream(System.in);
            input = new BufferedReader(new InputStreamReader(System.in));

            // sends output to the socket
            out = new DataOutputStream(socket.getOutputStream());
        } catch (UnknownHostException u) {
            System.out.println(u);
        } catch (IOException i) {
            System.out.println(i);
        }

        // String to read message form input tab
        String line = "";

        // keep reading until "Over" from input tab
        while (!line.equals("Over")) {
            try {
                line = input.readLine();
                out.writeUTF(line);
            } catch (IOException i) {
                System.out.println(i);
            }
        }
    }

    public static void main(String args[]) {
        Client client = new Client("127.0.0.1", 5000);
    }
}
