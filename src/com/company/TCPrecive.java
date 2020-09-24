package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPrecive {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(888);
        Socket s =ss.accept();
        byte[]b=new byte[1024];
        InputStream is=s.getInputStream();
        int len=is.read(b);
        String str=new String(b,0,len);
        String s1=str.toUpperCase();
        Socket S1=new Socket(InetAddress.getByName("PC-202003251636"),999);
        OutputStream os=S1.getOutputStream();
        os.write(s1.getBytes());
        S1.close();
    }
}
