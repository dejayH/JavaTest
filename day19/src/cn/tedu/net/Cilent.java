package cn.tedu.net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//客户端
public class Cilent {
    public static void main(String[] args) throws Exception {
        //1,指定要连接的服务器父对象
        Socket socket = new Socket("127.0.0.1", 500);
        System.out.println(" 已经和服务器连接成功了(=ﾟωﾟ)ﾉ");
        //2,让那个客户端给服务器发送hello - out
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        //获取写出流--写出hello
        System.out.println("请输入想输出的单词");
        String output = new Scanner(System.in).next();
        out.write(output.getBytes());
        out.flush();

        System.out.println("收到的讯息为:");
        for (int i = 0; i < 5; i++) {
            char read = (char) in.read();
            System.out.print(read);
        }

        socket.close();
    }
}
