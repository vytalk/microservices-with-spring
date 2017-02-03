package lt.vytalk.spring.microservices;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Value("${lucky.world.whatever}")
    String myProperty;

    @RequestMapping("/is-it")
    public String myProperties() {
        return "OMG : " + myProperty;
    }

}
