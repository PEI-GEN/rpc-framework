package github.javaguide.registry;

import github.javaguide.extension.SPI;
import github.javaguide.remoting.dto.RpcRequest;

import java.net.InetSocketAddress;

/**
 * service discovery
 *
 * @author PEIGEN
 * @createTime 2023年06月01日 15:16:00
 */
@SPI
public interface ServiceDiscovery {
    /**
     * 根据 rpcServiceName 获取远程服务地址
     *
     * @param rpcServiceName 完整的服务名称（class name+group+version）
     * @return 远程服务地址
     */
    InetSocketAddress lookupService(RpcRequest rpcRequest);
}
