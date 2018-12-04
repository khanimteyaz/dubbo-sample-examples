package org.apache.dubbo.sample.provider;


import org.apache.dubbo.sample.GreetingService;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet(String message) {
        return String.format("A warm welcome from dubbo to %s",message);
    }
}
