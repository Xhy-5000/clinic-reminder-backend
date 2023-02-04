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

    @Test
    public void findByDoctorid(){
        patient[] patients = patientMapper.findByDoctorid(1);
        for (patient patient:patients){
            System.out.println(patient);
        }
    }

    @Test
    public void insert(){
        for(int i=5; i<=20000;i++){
            patient patient = new patient();
            patient.setDoctorid(i/40+1);
            patient.setPatientname("patient"+i);
            patient.setPatientpassword("123456");
            patientMapper.insert(patient);
            //        System.out.println(patient);
        }

    }
}
