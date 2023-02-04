package lab.interview.clinicreminderbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import lab.interview.clinicreminderbackend.service.patientLoginService;

@RestController
public class patientLoginController {
    @Autowired
    patientLoginService patientLoginService;

    @ResponseBody
    @RequestMapping(value = "/patient/login" , consumes = "application/json")
    public Object patientLogin(@RequestParam int patientid, @RequestParam String patientpassword){
        return patientLoginService.login(patientid,patientpassword);
    }
}
