package lab.interview.clinicreminderbackend.service;

import lab.interview.clinicreminderbackend.entity.result;
import lab.interview.clinicreminderbackend.mapper.reminderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class patientFinishService {
    @Autowired
    reminderMapper reminderMapper;

    public result finishReminder(int reminderid){
        result result = new result();
        reminderMapper.finishByid(reminderid);
        result.setCode(0);
        result.setMsg("success");
        return result;
    }
}
