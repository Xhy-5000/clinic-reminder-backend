package lab.interview.clinicreminderbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import lab.interview.clinicreminderbackend.service.doctorLoginService;

@RestController
public class doctorHistoryController {
    @Autowired
    private doctorLoginService doctorService;
    @ResponseBody
    @RequestMapping(value = "/doctor/history" , consumes = "application/json")
    public Object doctorHistory(@RequestParam("patientid") int patientid) {
        return doctorService.historyReminder(patientid);
    }
}
