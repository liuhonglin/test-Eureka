package lhl.test.springcoloud.eurekaClient.consumer.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by liuhonglin on 2017/10/27.
 */
@RestController
public class CustomerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("customer")
    public String customer() {
        String result = restTemplate.getForEntity("http://SAYHI/say", String.class, "test").getBody();
        return result;
    }
}
