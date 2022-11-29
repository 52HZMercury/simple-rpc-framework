package github.javaguide.remoting.transport.socket.socketstudy;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * @program: rpc-framework
 * @description:
 * @author: Mr.Like
 * @create: 2022-11-11 15:11
 **/

public class HelloServer {
    //输出日志的
    private static final Logger logger =  LoggerFactory.getLogger(HelloServer.class);
    public void start(int port){
        //1.创建ServerSocket 对象并且绑定一个端口
        try(ServerSocket server = new ServerSocket(port);){
            Socket socket;
            //2.通过accept方法监听客户端的请求
            while((socket = server.accept()) != null){
                logger.info("client connected");
                try(ObjectInputStream objectInputStream = new ObjectInputStream((socket.getInputStream()));
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream())){
                    //3.通过输出流读取客户端发送的请求
                    Message message = (Message) objectInputStream.readObject();
                    logger.info("server receive message:" + message.getContent());
                    message.setContent("new Content");
                    //4.通过输出流向客户端发送响应信息
                    objectOutputStream.writeObject(message);
                    objectOutputStream.flush();
                }catch (IOException | ClassNotFoundException e){
                    logger.info("occur IOException:"+e);
                }

            }
        }catch (IOException e){
            logger.info("occur IOException:"+e);
        }
    }

    public static void main(String[] args) {
        HelloServer helloServer = new HelloServer();
        helloServer.start(6666);
    }
}
