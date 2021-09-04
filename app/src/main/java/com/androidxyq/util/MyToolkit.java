package com.androidxyq.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by IntelliJ IDEA.
 * User: gongdewei
 * Date: 12-3-17
 * Time: 下午6:25
 * To change this template use File | Settings | File Templates.
 */
public class MyToolkit {

    public static InputStream getInputStream(String filename) {
        InputStream is = MyToolkit.class.getResourceAsStream(filename);
        if (is == null) {
            try {
                if (filename.charAt(0) == '/') {
                    filename = filename.substring(1);
                }
                File file = new File(filename);
                if (file.exists()) {
                    is = new FileInputStream(filename);
                    //}else {
                    //    is = CacheManager.getInstance().getResourceAsStream(filename);
                }
            } catch (FileNotFoundException e) {
                System.out.println("找不到文件: " + filename);
                e.printStackTrace();
            }
        }
        return is;
    }

}
