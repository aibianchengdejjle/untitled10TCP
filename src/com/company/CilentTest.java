package com.company;

import javax.print.DocFlavor;
import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class CilentTest {
    public static void main(String[] args) throws IOException {
         //创建客户端Socket对象
        Socket s = new Socket("PC-202003251636",888);

        //获取用户名和密码  字符输入流里面要传进来字节流 System.in就是从键盘获取相应的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入用户名:");
        String username = br.readLine();
        System.out.println("请输入密码:");
        String password =br.readLine();
        //获取输出流对象
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        //写出数据
        out.println(username);
        out.println(password);

        //获取输入流对象
        BufferedReader serverBr = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //获取服务器返回的数据
        String result = serverBr.readLine();
        System.out.println(result);
        //释放资源
        s.close();
    }

}
