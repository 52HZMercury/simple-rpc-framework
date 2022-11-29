package github.javaguide.compress;

import github.javaguide.extension.SPI;

/**
 * 压缩类的接口
 */

@SPI
public interface Compress {

    byte[] compress(byte[] bytes);


    byte[] decompress(byte[] bytes);
}
