package lab.interview.clinicreminderbackend.mapper;

import lab.interview.clinicreminderbackend.entity.reminder;
import org.apache.ibatis.annotations.Mapper;
import java.sql.Timestamp;

@Mapper
public interface reminderMapper {
    Integer insert(reminder reminder);
    reminder[] findByPatientid(int patientid);
    reminder[] countByidTime(int patientid, Timestamp time);
}
