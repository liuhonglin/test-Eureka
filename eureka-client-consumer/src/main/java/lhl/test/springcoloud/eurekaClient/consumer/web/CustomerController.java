package lhl.test.springcoloud.eurekaClient.consumer.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by liuhonglin on 2017/10/27.
 */
@RestController
public class CustomerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

    private final String server_name = "SAYHI";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/customer")
    public String customer() {

        List<ServiceInstance> serviceInstances = discoveryClient.getInstances(server_name);
        String serviceUri = serviceInstances.get(0).getUri().toString();

        String result = restTemplate.getForEntity("http://" + server_name + "/say", String.class).getBody();

        return result;
    }
}
