package lab.interview.clinicreminderbackend.service;

import lab.interview.clinicreminderbackend.entity.doctor;
import lab.interview.clinicreminderbackend.entity.reminder;
import lab.interview.clinicreminderbackend.entity.result;
import lab.interview.clinicreminderbackend.mapper.doctorMapper;
import lab.interview.clinicreminderbackend.mapper.reminderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class doctorLoginService {
    @Autowired
    private doctorMapper doctorMapper;

    @Autowired
    private reminderMapper reminderMapper;

    public result login(int id, String password) {
//        doctor doctor = new doctor();
//        List<doctor> userList = new ArrayList<>();
        doctor doctor =  doctorMapper.findByid(id);
        result result = new result();
        if(doctor!=null && password.equals(doctor.getDoctorpassword())) {
            result.setCode(0);
            result.setMsg("successfully login");
            //myResult.setList(userList);
            System.out.println("success");
            result.setObj(doctor);
        }else
        {
            result.setCode(1);
            result.setMsg("failed");
        }
        return result;
    }

    public result historyReminder(int patientid){
        Timestamp now= new Timestamp(System.currentTimeMillis());
        Map<Integer, Integer> obj = new HashMap<>();
        for(int i=7; i>0; i--){
            Timestamp time = new Timestamp(0);
            time.setTime(now.getTime()-(7-i)*24*3600*1000);
//            System.out.println("i="+i);
//            System.out.println(time.toString());
            reminder[] reminders = reminderMapper.countByidTime(patientid, time);
            obj.put(i,reminders.length);
        }
        result result = new result();
        result.setCode(0);
        result.setMsg("successfully check history");
        result.setObj(obj);
        return result;
    }

}
