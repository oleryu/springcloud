package com.oleryu.springcloud.erypeera;

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
        ery.setMsg("HI FROM A!");
        return ery;
    }
}
