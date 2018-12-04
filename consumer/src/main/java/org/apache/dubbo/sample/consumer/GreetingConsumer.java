package org.apache.dubbo.sample.consumer;


import org.apache.dubbo.rpc.service.EchoService;
import org.apache.dubbo.sample.GreetingService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingConsumer {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-sample-consumer.xml"});
        GreetingService greetingService=(GreetingService)context.getBean("greetingService");
        /*EchoService echoService = (EchoService) greetingService;
        String status = (String)echoService.$echo("OK");*/
        while(true) {
            System.out.println(greetingService.greet("user"));
        }
    }
}
