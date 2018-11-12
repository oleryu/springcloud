package com.oleryu.springcloud.erypeerc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EryController {

    @ResponseBody
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public Ery hi(){
        Ery ery = new Ery();
        ery.setMsg("HI FROM C!");
        return ery;
    }
}
