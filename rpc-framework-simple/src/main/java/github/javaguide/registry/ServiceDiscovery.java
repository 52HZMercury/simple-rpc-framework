package github.javaguide.registry;

import github.javaguide.extension.SPI;
import github.javaguide.remoting.dto.RpcRequest;

import java.net.InetSocketAddress;

/**
 * 服务发现接口
 *
 */
@SPI
public interface ServiceDiscovery {
    /**
     * 根据rpcRequest获取远程服务地址
     *
     * @param rpcRequest rpc service pojo 完整的服务名称(class+name+version)
     * @return 远程服务地址
     */
    InetSocketAddress lookupService(RpcRequest rpcRequest);
}
