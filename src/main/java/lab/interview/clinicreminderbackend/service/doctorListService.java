package lab.interview.clinicreminderbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lab.interview.clinicreminderbackend.mapper.reminderMapper;
import lab.interview.clinicreminderbackend.mapper.patientMapper;
import lab.interview.clinicreminderbackend.entity.reminder;
import lab.interview.clinicreminderbackend.entity.result;
import lab.interview.clinicreminderbackend.entity.patient;

import java.util.*;

@Service
public class doctorListService {
    @Autowired
    reminderMapper reminderMapper;
    @Autowired
    patientMapper patientMapper;

    private class listItem{
        int id;
        String name;
        int[] priority;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int[] getPriority() {
            return priority;
        }

        public void setPriority(int[] priority) {
            this.priority = priority;
        }
    }

    public result reminderList(int doctorid){
        //可以给patient加三个（高中低）属性来记录未完成reminder数量，每次新增或完成reminder进行修改
        //也可以增加一个表格patient-unifinished来记录
        patient[] patients = patientMapper.findByDoctorid(doctorid);
        String[] priorities = {"HIGH","MID","LOW"};
        List<listItem> obj = new ArrayList<>();
        for(patient patient:patients){
            int patientid = patient.getPatientid();
            int[] countPriority = new int[3];
            listItem listItem = new listItem();
            for(int i=0; i<3; i++){
                String prioriy = priorities[i];
                reminder[] reminders = reminderMapper.countByPriority(patientid,prioriy);
                countPriority[i] = reminders.length;
            }
            listItem.setId(patientid);
            listItem.setName(patient.getPatientname());
            listItem.setPriority(countPriority);
            obj.add(listItem);
        }
        Collections.sort(obj,(o1,o2)->{
            int[] p1 = o1.getPriority();
            int[] p2 = o2.getPriority();
            if(p1[0]!=p2[0]){
                return p2[0]-p1[0];
            }else if(p1[1]!=p2[1]){
                return p2[1]-p1[1];
            }else{
                return p2[2]-p1[2];
            }
        });
        result result = new result();
        result.setMsg("successfully get list");
        result.setObj(obj);
        result.setCode(0);
        return result;
    }
}
