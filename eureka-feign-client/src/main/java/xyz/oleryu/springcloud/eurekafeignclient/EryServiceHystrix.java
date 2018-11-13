package xyz.oleryu.springcloud.eurekafeignclient;

import org.springframework.stereotype.Component;

@Component
public class EryServiceHystrix implements  EryService{

    public Ery hi() {
        Ery  ery = new Ery();
        ery.setMsg("异常了");
        return ery;
    }
}
