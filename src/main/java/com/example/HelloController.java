package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mg on 2016-01-04.
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "hello";
    }
}
