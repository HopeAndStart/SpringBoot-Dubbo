package com.dubbo.zk.util;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * @author zsl
 * @version 1.0.0
 * @date: 2020/3/10 11:39
 **/
public class WriteConfigUtil {
    
    /**
     * 对某个配置进行修改
     *
     * @param configKey   需要修改配置的Key
     * @param configValue 需要修改配置的Value
     * @author zsl
     * @date 2020/3/10 11:43
     **/
    public static void writeConfigMethod (String configKey, String configValue) {
        File configFile = new File("E://11/test1.properties");
        try (
                RandomAccessFile raf = new RandomAccessFile(configFile, "rw");
        ) {
            String hbaseConfig = "";
            long lastPoint = 0;
            while ((hbaseConfig = raf.readLine()) != null) {
                final long ponit = raf.getFilePointer();
                // 修改文件内容
                if (hbaseConfig.contains(configKey)) {
                    String[] splitConfig = hbaseConfig.split("=");
                    String splitConfigKey = splitConfig[0];
                    hbaseConfig = splitConfigKey + "=" + configValue;
                    raf.seek(lastPoint);
                    raf.writeBytes(hbaseConfig);
                }
                lastPoint = ponit;
            }
        } catch (Exception e) {
        
        }
    }
    
    public static void main (String[] args) {
        writeConfigMethod("psw", "zsl");
    }
    
}
