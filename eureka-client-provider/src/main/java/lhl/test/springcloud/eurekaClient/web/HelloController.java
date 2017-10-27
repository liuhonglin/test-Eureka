package lhl.test.springcloud.eurekaClient.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuhonglin on 2017/10/27.
 */
@RestController
public class HelloController {

    @RequestMapping("/say")
    public String sayHello(@RequestParam String name) {
        return "hello " + name;
    }
}
