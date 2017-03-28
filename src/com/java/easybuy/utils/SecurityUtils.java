package com.java.easybuy.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 *加密工具包
 * Created by fsweb on 17-3-28.
 */
public class SecurityUtils {
    /**
     * md5加密
     */
    public String md5(String str){
        return DigestUtils.md5Hex(str);
    }

    /**
     * sha1加密
     * @param str 要加密的字符串
     * @return 加密后的字符串
     */
    public String sha1(String str){
        return DigestUtils.sha1Hex(str);
    }
}
