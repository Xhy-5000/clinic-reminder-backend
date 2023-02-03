package lab.interview.clinicreminderbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lab.interview.clinicreminderbackend.mapper.reminderMapper;
import lab.interview.clinicreminderbackend.mapper.patientMapper;
import lab.interview.clinicreminderbackend.entity.reminder;
import lab.interview.clinicreminderbackend.entity.result;
import lab.interview.clinicreminderbackend.entity.patient;

import java.util.HashMap;
import java.util.Map;

@Service
public class doctorListService {
    @Autowired
    reminderMapper reminderMapper;
    @Autowired
    patientMapper patientMapper;

    public result reminderList(int doctorid){
        //可以给patient加三个（高中低）属性来记录未完成reminder数量，每次新增或完成reminder进行修改
        //也可以增加一个表格patient-unifinished来记录
        patient[] patients = patientMapper.findByDoctorid(doctorid);
        String[] priorities = {"HIGH","MID","LOW"};
        Map<Integer, Map<String, int[]>> obj = new HashMap<>();
        for(patient patient:patients){
            int patientid = patient.getPatientid();
            Map<String, int[]> sub = new HashMap<>();
            int[] countPriority = new int[3];
            for(int i=0; i<3; i++){
                String prioriy = priorities[i];
                reminder[] reminders = reminderMapper.countByPriority(patientid,prioriy);
                countPriority[i] = reminders.length;
            }
            sub.put(patient.getPatientname(),countPriority);
            obj.put(patientid, sub);
        }
        result result = new result();
        result.setMsg("successfully get list");
        result.setObj(obj);
        result.setCode(0);
        return result;
    }
}
