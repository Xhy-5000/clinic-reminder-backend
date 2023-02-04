package lab.interview.clinicreminderbackend.service;

import lab.interview.clinicreminderbackend.entity.patient;
import lab.interview.clinicreminderbackend.entity.result;
import lab.interview.clinicreminderbackend.mapper.patientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class patientLoginService {
    @Autowired
    private patientMapper patientMapper;

    public result login(int id, String password) {
        patient patient = patientMapper.findByid(id);
        result result = new result();
        if(patient!=null && password.equals(patient.getPatientpassword())) {
            result.setCode(0);
            result.setMsg("successfully login");
            System.out.println("success");
            result.setObj(patient);
        }else
        {
            result.setCode(1);
            result.setMsg("failed");
        }
        return result;
    }
}
