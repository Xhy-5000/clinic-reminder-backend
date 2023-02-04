package lab.interview.clinicreminderbackend.controller;

import lab.interview.clinicreminderbackend.service.patientDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class patientDetailController {
    @Autowired
    patientDetailService patientDetailService;

    @ResponseBody
    @RequestMapping(value = "/patient/detail" , consumes = "application/json")
    public Object reminderDetails(@RequestParam int reminderid){
        return patientDetailService.reminderDetail(reminderid);
    }

}
