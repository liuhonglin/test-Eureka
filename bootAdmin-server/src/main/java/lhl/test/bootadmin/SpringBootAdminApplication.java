package lhl.test.bootadmin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liuhonglin on 2018/2/2 11:33.
 */
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class SpringBootAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminApplication.class, args);
        //new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
