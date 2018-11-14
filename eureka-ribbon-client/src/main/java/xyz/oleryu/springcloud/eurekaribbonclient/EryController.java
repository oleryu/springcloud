package xyz.oleryu.springcloud.eurekaribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EryController {

    @Autowired
    RestTemplate restTemplate;



    /**
     * Rest服务端使用RestTemplate发起http请求,
     * @return
     */
    @GetMapping(value = "/ery")
    @ResponseBody
    public Ery ery(){
        Ery ery = restTemplate.getForObject("http://EryPeer/hi",Ery.class);

        return ery;
    }

}
