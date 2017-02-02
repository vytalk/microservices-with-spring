package lt.vytalk.spring.microservices.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Lab1Controller {

    @RequestMapping("/")
    public String helloFromLab1() {
        return "hello";
    }

}
