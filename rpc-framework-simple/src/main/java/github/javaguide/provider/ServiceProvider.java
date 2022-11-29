package github.javaguide.provider;

import github.javaguide.config.RpcServiceConfig;

/**
 * store and provide service object.
 * 提供服务的接口
 * */
public interface ServiceProvider {

    /**
     * @param rpcServiceConfig rpc 服务相关的属性
     *
     */
    void addService(RpcServiceConfig rpcServiceConfig);

    /**
     * @param rpcServiceName rpc 服务的名字
     * @return service object
     */
    Object getService(String rpcServiceName);

    /**
     * @param rpcServiceConfig rpc 服务相关的属性
     */
    void publishService(RpcServiceConfig rpcServiceConfig);

}
