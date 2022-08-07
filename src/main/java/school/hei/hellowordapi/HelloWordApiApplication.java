package school.hei.hellowordapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan({"model"})
public class HelloWordApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWordApiApplication.class, args);
    }

}
