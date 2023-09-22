package com.imooc.maven;

import net.sourceforge.pinyin4j.PinyinHelper;

/**
 * ClassName: PinYin
 * Package: IntelliJ IDEA
 * Description:
 *
 * @Author ka kai
 * @Create 2023/09/22 14:35
 * @Version 1.0
 */
public class PinYin {
    public static void main(String[] args) {
        char c = '重';
        String[] arr = PinyinHelper.toHanyuPinyinStringArray(c);
        for(String py:arr){
            System.out.println(py);
        }
    }
}
