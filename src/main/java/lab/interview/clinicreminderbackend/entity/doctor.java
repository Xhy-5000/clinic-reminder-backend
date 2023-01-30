package lab.interview.clinicreminderbackend.entity;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class doctor implements Serializable{
    private Integer doctorid;
    private String doctorname;
    private String doctorpassword;

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getDoctorpassword() {
        return doctorpassword;
    }

    public void setDoctorpassword(String doctorpassword) {
        this.doctorpassword = doctorpassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof doctor doctor)) return false;
        return Objects.equals(getDoctorid(), doctor.getDoctorid()) && Objects.equals(getDoctorname(), doctor.getDoctorname()) && Objects.equals(getDoctorpassword(), doctor.getDoctorpassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDoctorid(), getDoctorname(), getDoctorpassword());
    }
}
