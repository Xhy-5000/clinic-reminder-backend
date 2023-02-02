package lab.interview.clinicreminderbackend.service;

import lab.interview.clinicreminderbackend.entity.doctor;
import lab.interview.clinicreminderbackend.entity.result;
import lab.interview.clinicreminderbackend.mapper.doctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class doctorLoginService {
    @Autowired
    private doctorMapper doctorMapper;

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
            result.setObject(doctor);
        }else
        {
            result.setCode(1);
            result.setMsg("failed");
        }
        return result;
    }

}
