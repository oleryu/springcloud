package xyz.oleryu.springcloud.eurekafeignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EryController {

    @Autowired
    EryService eryService;

    @ResponseBody
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public Ery hi(){
        Ery ery = eryService.hi();
        return ery;
    }
}
