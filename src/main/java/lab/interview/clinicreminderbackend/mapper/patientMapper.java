package lab.interview.clinicreminderbackend.mapper;

import lab.interview.clinicreminderbackend.entity.patient;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface patientMapper {
    patient findByid(int id);
    patient[] findByDoctorid(int doctorid);
    Integer insert(patient patient);
}
