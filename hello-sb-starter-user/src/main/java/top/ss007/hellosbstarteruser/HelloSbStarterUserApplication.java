package top.ss007.hellosbstarteruser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.ss007.hellospringbootautoconfigure.library.ShuSheng007;


@SpringBootApplication
public class HelloSbStarterUserApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(HelloSbStarterUserApplication.class, args);
    }

    @Autowired
    private ShuSheng007 shuSheng007;

    @Override
    public void run(String... args) throws Exception {
        shuSheng007.say();
    }
}
