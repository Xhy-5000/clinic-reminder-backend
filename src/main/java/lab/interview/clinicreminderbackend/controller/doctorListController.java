package lab.interview.clinicreminderbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import lab.interview.clinicreminderbackend.service.doctorListService;
@RestController
public class doctorListController {
    @Autowired
    doctorListService doctorListService;

    @ResponseBody
    @RequestMapping(value = "/doctor/list" , consumes = "application/json")
    public Object doctorList(@RequestParam("id") int id){
        return doctorListService.reminderList(id);
    }
}
