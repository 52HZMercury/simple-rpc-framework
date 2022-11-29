package github.javaguide.remoting.transport.socket.socketstudy;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: rpc-framework
 * @description:
 * @author: Mr.Like
 * @create: 2022-11-11 15:47
 **/
@Data
@AllArgsConstructor
public class Message implements Serializable {
    private String content;
}
