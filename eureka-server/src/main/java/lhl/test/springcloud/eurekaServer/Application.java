package lhl.test.springcloud.eurekaServer;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by HL.L on 2017/10/26.
 */
@SpringBootApplication
@EnableEurekaServer
//@EnableAdminServer // 启用 SpringBoot Admin
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
