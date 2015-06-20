package org.zencv.springular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zen on 6/20/15.
 */
@Controller
@EnableAutoConfiguration
public class HelloWorldController {

    @RequestMapping("/hello")
    @ResponseBody
    public HelloWorld getHello() {
        return new HelloWorld();
    }


    class HelloWorld {
        String value = "Hello World!";

        public String getValue() {
            return value;
        }
    }
}
