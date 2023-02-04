package lab.interview.clinicreminderbackend.controller;

import lab.interview.clinicreminderbackend.service.patientFinishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class patientFinishController {
    @Autowired
    patientFinishService patientFinishService;

    @ResponseBody
    @RequestMapping(value = "/patient/finish" , consumes = "application/json")
    public Object finishReminder(@RequestParam int reminderid){
        return patientFinishService.finishReminder(reminderid);
    }
}
