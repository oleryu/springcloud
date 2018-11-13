package xyz.oleryu.springcloud.eurekaclusterclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EryController {
    /**
     * 实例化RestTemplate
     * @return
     */
    @LoadBalanced
    @Bean
    public RestTemplate rest() {
        return new RestTemplate();
    }


    @Autowired
    RestTemplate restTemplate;

    /**
     * Rest服务端使用RestTemplate发起http请求,
     * @return
     */
    @GetMapping(value = "/ery")
    @ResponseBody
    public Ery ery(){
//        Ery ery = new Ery();
//        ery.setMsg("[CLIENT]Hi!");
        Ery ery = restTemplate.getForObject("http://EryPeer/hi",Ery.class);

        return ery;
    }

}
