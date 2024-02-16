package sn.thiare.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRessource {

    @RequestMapping("/")
    public String hello() {
        return "Hello World";
    }
}
