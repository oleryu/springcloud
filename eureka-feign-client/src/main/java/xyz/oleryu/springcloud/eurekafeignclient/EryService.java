package xyz.oleryu.springcloud.eurekafeignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="EryPeer" , fallback=EryServiceHystrix.class)
public interface EryService {

    @RequestMapping("/hi")
    public Ery hi();

}
