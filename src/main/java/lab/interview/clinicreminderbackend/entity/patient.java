package lab.interview.clinicreminderbackend.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class patient implements Serializable{
    private Integer patientid;
    private String patientname;
    private String patientpassword;
    private Integer doctorid;

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getPatientpassword() {
        return patientpassword;
    }

    public void setPatientpassword(String patientpassword) {
        this.patientpassword = patientpassword;
    }

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }
}
