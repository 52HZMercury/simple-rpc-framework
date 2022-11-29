package github.javaguide.registry;

import github.javaguide.extension.SPI;

import java.net.InetSocketAddress;

/**
 * service registration
 *
 */
@SPI
public interface ServiceRegistry {
    /**
     * register service
     *
     * @param rpcServiceName    rpc 服务名字
     * @param inetSocketAddress service 地址
     */
    void registerService(String rpcServiceName, InetSocketAddress inetSocketAddress);

}
