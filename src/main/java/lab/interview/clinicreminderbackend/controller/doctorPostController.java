package lab.interview.clinicreminderbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import lab.interview.clinicreminderbackend.service.doctorPostService;

@RestController
public class doctorPostController {
    @Autowired
    doctorPostService doctorPostService;

    @ResponseBody
    @RequestMapping(value = "/doctor/post" , consumes = "application/json")
    public Object doctorPost(@RequestParam("patientid") int patientid, @RequestParam("doctorid") int doctorid,
                             @RequestParam("detail") String detail, @RequestParam("existtime") int existtime,
                             @RequestParam("priority") String priority){
        return doctorPostService.postReminder(patientid, doctorid, detail, existtime, priority);
    }
}
