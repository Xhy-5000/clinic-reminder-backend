package lab.interview.clinicreminderbackend.mapper;

import lab.interview.clinicreminderbackend.entity.doctor;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface doctorMapper {
    doctor findByid(int id);
    Integer insert(doctor doctor);
}
