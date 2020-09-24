package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class receve {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(888);
        Socket S=ss.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(S.getInputStream()));
        String name= br.readLine();
        String password=br.readLine();
        boolean flag=false;
        List<User>u= userdb.getUsers();
        for (User a:u) {
            if(a.getName().equals(name)&&a.getWord().equals(password))
                flag=true;
        }
        PrintWriter pw=new PrintWriter(S.getOutputStream(),true);
        if (flag){
            pw.println("登陆成功");   //这里一定要写的是printlin才行
        }
        else
        {
            pw.println("失败");
        }
        S.close();
    }
}
