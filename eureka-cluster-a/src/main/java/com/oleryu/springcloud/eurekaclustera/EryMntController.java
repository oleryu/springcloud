package com.oleryu.springcloud.eurekaclustera;

import com.netflix.discovery.DiscoveryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mnt")
public class EryMntController {

    @Autowired
    private DiscoveryClient client;

    @ResponseBody
    @RequestMapping(value = "/offline",method = RequestMethod.GET)

    public Ery shutdownComponent(){

        DiscoveryManager.getInstance().shutdownComponent();

        Ery ery = new Ery();
        ery.setMsg("HI FROM A!");
        return ery;
    }
}
