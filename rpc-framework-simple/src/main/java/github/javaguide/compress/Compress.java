package github.javaguide.compress;

import github.javaguide.extension.SPI;

/**
 * @author PEIGEN .
 * @createTime on 2020/10/3
 */

@SPI
public interface Compress {

    byte[] compress(byte[] bytes);


    byte[] decompress(byte[] bytes);
}
