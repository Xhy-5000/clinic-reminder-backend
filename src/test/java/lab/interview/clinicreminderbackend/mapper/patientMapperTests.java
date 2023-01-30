package lab.interview.clinicreminderbackend.mapper;

import lab.interview.clinicreminderbackend.entity.patient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)

public class patientMapperTests {

    @Autowired
    private patientMapper patientMapper;

    @Test
    public void findByid(){
        patient patient = patientMapper.findByid(1);
        System.out.println(patient);
    }
}
