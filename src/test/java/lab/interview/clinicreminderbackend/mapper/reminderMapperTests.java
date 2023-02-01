package lab.interview.clinicreminderbackend.mapper;

import lab.interview.clinicreminderbackend.entity.patient;
import lab.interview.clinicreminderbackend.entity.reminder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Time;
import java.sql.Timestamp;

@SpringBootTest
@RunWith(SpringRunner.class)
public class reminderMapperTests {
    @Autowired
    private reminderMapper reminderMapper;
    private patientMapper patientMapper;

    @Test
    public void insert(){
        reminder reminder = new reminder();
        reminder.setDetail("eat A");
        reminder.setDoctorid(1);
        reminder.setPatientid(1);
        reminder.setPatientname("Andy Xia");
        Timestamp now= new Timestamp(System.currentTimeMillis());
        reminder.setPosttime(now);
        reminder.setExisttime(1);
        reminder.setIsfinished(0);
        reminder.setPriority("MID");
        Integer rows = reminderMapper.insert(reminder);
        System.out.println(rows);
    }

    @Test
    public void findByPatientid(){
        reminder[] reminders = reminderMapper.findByPatientid(2);
        for(reminder reminder:reminders){
            System.out.println(reminder);
        }

    }
}
