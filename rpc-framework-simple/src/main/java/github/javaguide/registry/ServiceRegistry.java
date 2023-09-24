package github.javaguide.registry;

import github.javaguide.extension.SPI;

import java.net.InetSocketAddress;

/**
 * service registration
 *
 * @author PEIGEN
 * @createTime 2023年05月13日 08:39:00
 */
@SPI
public interface ServiceRegistry {
    /**
     * register service
     *
     * @param rpcServiceName    rpc service name
     * @param inetSocketAddress service address
     */
    void registerService(String rpcServiceName, InetSocketAddress inetSocketAddress);

}
