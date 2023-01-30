package lab.interview.clinicreminderbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("lab.interview.clinicreminderbackend.mapper")
public class ClinicReminderBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClinicReminderBackendApplication.class, args);
    }

}
