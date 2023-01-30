package lab.interview.clinicreminderbackend.entity;
import lombok.Data;

import java.io.Serializable;
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
}
