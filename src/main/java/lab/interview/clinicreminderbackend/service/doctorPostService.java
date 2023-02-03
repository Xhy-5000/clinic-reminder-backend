package lab.interview.clinicreminderbackend.service;

import lab.interview.clinicreminderbackend.entity.result;
import lab.interview.clinicreminderbackend.mapper.reminderMapper;
import lab.interview.clinicreminderbackend.mapper.patientMapper;
import lab.interview.clinicreminderbackend.entity.patient;
import lab.interview.clinicreminderbackend.entity.reminder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Timestamp;

@Service
public class doctorPostService {
    @Autowired
    patientMapper patientMapper;
    @Autowired
    reminderMapper reminderMapper;

    public result postReminder(int patientid, int doctorid, String detail, int existtime, String priority){
        Timestamp now= new Timestamp(System.currentTimeMillis());
        result result = new result();
        patient patient = patientMapper.findByid(patientid);
        reminder reminder = new reminder();
        reminder.setPatientid(patientid);
        reminder.setPatientname(patient.getPatientname());
        reminder.setDetail(detail);
        reminder.setDoctorid(doctorid);
        reminder.setPosttime(now);
        reminder.setExisttime(existtime);
        reminder.setIsfinished(0);
        reminder.setPriority(priority);
        reminderMapper.insert(reminder);
        result.setCode(0);
        result.setMsg("successfully insert");
        return result;
    }
}
