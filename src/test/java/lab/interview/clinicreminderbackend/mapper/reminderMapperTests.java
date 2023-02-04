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

    @Test
    public void countByidTime(){
        Timestamp now= new Timestamp(System.currentTimeMillis());
        reminder[] reminders = reminderMapper.countByidTime(1,now);
        for(reminder reminder:reminders){
            System.out.println(reminder);
        }
    }

    @Test
    public void countByPriority(){
        reminder[] reminders = reminderMapper.countByPriority(2,"LOW");
        for(reminder reminder:reminders){
            System.out.println(reminder);
        }
    }

    @Test
    public void mockDataInsert(){
//        Timestamp now= new Timestamp(System.currentTimeMillis());
        long now = System.currentTimeMillis();
        String[] priority = {"HIGH","MID","LOW"};
        for(int day=0; day<15; day++){
            Timestamp time = new Timestamp(now-day*24*3600*1000);
            for(int i=40;i<80;i++){
                for(int j=1;j<=15;j++){
                    reminder reminder = new reminder();
                    reminder.setDoctorid(2);
                    reminder.setDetail("mock reminder");
                    reminder.setPatientid(i);
                    reminder.setPatientname("patient"+i);
                    reminder.setExisttime(j);
                    reminder.setPosttime(time);
                    reminder.setIsfinished(0);
                    reminder.setPriority(priority[j%3]);
                    reminderMapper.insert(reminder);
                }
            }
        }
    }
}
