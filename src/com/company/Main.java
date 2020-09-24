package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) throws IOException {
        Socket s=new Socket(InetAddress.getByName("PC-202003251636"),888);
        OutputStream os=s.getOutputStream();
        String S="hello";
        os.write(S.getBytes());
        ServerSocket ss=new ServerSocket(999);
        Socket s1=ss.accept();//阻塞
        InputStream is=s1.getInputStream();
        InetAddress ia=s1.getInetAddress();
        System.out.println("send----"+ia.getCanonicalHostName());
        byte []b=new byte[1024];
        int len=is.read(b);
        System.out.println(new String(b,0,len));
        s1.close();
    }
}
