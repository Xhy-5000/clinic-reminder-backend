package lab.interview.clinicreminderbackend.service;

import lab.interview.clinicreminderbackend.entity.reminder;
import lab.interview.clinicreminderbackend.entity.result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lab.interview.clinicreminderbackend.mapper.reminderMapper;

@Service
public class patientDetailService {
    @Autowired
    reminderMapper reminderMapper;

    public result reminderDetail(int reminderid){
        result result = new result();
        reminder reminder = reminderMapper.findByid(reminderid);
        result.setCode(0);
        result.setMsg("success");
        result.setObj(reminder);
        return result;
    }
}
