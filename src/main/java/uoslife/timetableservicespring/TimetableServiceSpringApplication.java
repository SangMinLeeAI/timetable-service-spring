package uoslife.timetableservicespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TimetableServiceSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimetableServiceSpringApplication.class, args);
    }

}
