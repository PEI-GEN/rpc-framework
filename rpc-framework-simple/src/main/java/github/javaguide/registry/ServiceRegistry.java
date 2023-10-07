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
     * 注册服务到注册中心
     *
     * @param rpcServiceName    完整的服务名称（class name+group+version）
     * @param inetSocketAddress 远程服务地址
     */
    void registerService(String rpcServiceName, InetSocketAddress inetSocketAddress);

}
