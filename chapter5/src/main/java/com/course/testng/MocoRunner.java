package com.course.testng;

import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName: MocoRunner
 * @Description: 模拟http请求响应
 * @Author Jason
 * @Date 2020/6/29 17:08
 */
public class MocoRunner {
    @Test
    public void test01(){
        //获取文件路径
        String jarFile = this.getClass().getClassLoader().getResource("moco-runner-1.1.0-standalone.jar").getPath();
        String port = "8881";
        String jasonFile = this.getClass().getClassLoader().getResource("startup1.json").getPath();
        String cmd = "java -jar "+jarFile.substring(1)+" http -p "+port+" -c "+jasonFile.substring(1);
        try {
            System.out.println(cmd);
            Process proc = Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test02(){
        //获取文件路径
        String jarFile = this.getClass().getClassLoader().getResource("moco-runner-1.1.0-standalone.jar").getPath();
        String port = "8883";
        String jasonFile = this.getClass().getClassLoader().getResource("startup1.json").getPath();
        String cmd = "java -jar "+jarFile.substring(1)+" http -p "+port+" -c "+jasonFile.substring(1);
        try {
            System.out.println(cmd);
            Process proc = Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
