package lab.interview.clinicreminderbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import lab.interview.clinicreminderbackend.service.patientShowService;

@RestController
public class patientShowController {
    @Autowired
    patientShowService patientShowService;

    @ResponseBody
    @RequestMapping(value = "/patient/show" , consumes = "application/json")
    public Object patientShowReminder(@RequestParam int patientid){
        return patientShowService.showReminder(patientid);
    }
}
