package org.apache.dubbo.sample.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-sample-provider.xml"});
        context.start();
        System.in.read(); // press any key to exit
    }
}
