package lab.interview.clinicreminderbackend.service;

import lab.interview.clinicreminderbackend.mapper.patientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lab.interview.clinicreminderbackend.mapper.reminderMapper;
import lab.interview.clinicreminderbackend.entity.result;
import lab.interview.clinicreminderbackend.entity.reminder;

@Service
public class patientShowService {
    @Autowired
    private reminderMapper reminderMapper;

    public result showReminder(int id){
        reminder[] reminders = reminderMapper.findByPatientid(id);
        result result = new result();
        result.setCode(0);
        result.setMsg("Successfully get reminders for patient");
        result.setObj(reminders);
        return result;
    }
}
