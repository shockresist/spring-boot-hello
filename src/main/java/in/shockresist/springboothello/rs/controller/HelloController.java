package in.shockresist.springboothello.rs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 26.07.2017.
 */

@RestController
public class HelloController {
    @RequestMapping("/")
    String home() {
        return "Hello World!azaza";
    }
}
