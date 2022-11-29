package github.javaguide.loadbalance;

import github.javaguide.remoting.dto.RpcRequest;
import github.javaguide.utils.CollectionUtil;

import java.util.List;

/**
 * Abstract class for a load balancing policy
 * 随机负载均衡的抽象类
 */
public abstract class AbstractLoadBalance implements LoadBalance {
    @Override
    public String selectServiceAddress(List<String> serviceAddresses, RpcRequest rpcRequest) {
        if (CollectionUtil.isEmpty(serviceAddresses)) {
            return null;
        }
        if (serviceAddresses.size() == 1) {
            return serviceAddresses.get(0);
        }
        return doSelect(serviceAddresses, rpcRequest);
    }

    protected abstract String doSelect(List<String> serviceAddresses, RpcRequest rpcRequest);

}
