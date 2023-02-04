package lab.interview.clinicreminderbackend.mapper;

import lab.interview.clinicreminderbackend.entity.doctor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)

public class doctorMapperTests {
    @Autowired
    private doctorMapper doctorMapper;

    @Test
    public void findByid(){
        doctor doctor = doctorMapper.findByid(1);
        System.out.println(doctor);
    }

    @Test
    public void insert(){
        for(int i=4; i<=500;i++){
            doctor doctor = new doctor();
            doctor.setDoctorname("doctor"+i);
            doctor.setDoctorpassword("123456");
            doctorMapper.insert(doctor);
//            System.out.println(doctor);
        }

    }
}
