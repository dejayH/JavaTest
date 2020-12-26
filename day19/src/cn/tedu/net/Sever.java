package cn.tedu.net;
//服务器端

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Sever {
    public static void main(String[] args) throws Exception {
        //1,开启服务器 -- 并指定端口号
        ServerSocket server = new ServerSocket(500);
        System.out.println("服务器已启动<- ->");

        //2,接收客户端发来的连接请求
        Socket accept = server.accept();
        System.out.println(" 服务器收到一个客户端的连接请求( ˘▽˘)っ");

        //3,读取客户端发来的"hello"
        InputStream in = accept.getInputStream();
        BufferedInputStream bu = new BufferedInputStream(in);
        OutputStream out = accept.getOutputStream();
        BufferedOutputStream bufO = new BufferedOutputStream(out);

        System.out.println("收到的讯息为:");
        //字符的长度要保持一直,长了会输出/u000,短了无法完全输出
        for (int i = 0; i < 5 ; i++) {
            char read = (char) bu.read();
            System.out.print(read);
        }
        System.out.println();

        System.out.println("请输入想输出的单词");
        String output = new Scanner(System.in).next();
        bufO.write(output.getBytes());
        bufO.flush();

        accept.close();
        server.close();
    }
}
