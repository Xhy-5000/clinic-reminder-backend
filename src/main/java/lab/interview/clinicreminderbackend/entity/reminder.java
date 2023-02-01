package lab.interview.clinicreminderbackend.entity;
import lombok.Data;
import java.sql.Timestamp;
import java.io.Serializable;
@Data
public class reminder implements Serializable{
    private Integer doctorid;
    private Integer patientid;
    private String patientname;
    private String detail;
    private Integer isfinished;
    private Timestamp posttime;
    private Integer existtime;
    private String priority;

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getIsfinished() {
        return isfinished;
    }

    public void setIsfinished(Integer isfinished) {
        this.isfinished = isfinished;
    }

    public Timestamp getPosttime() {
        return posttime;
    }

    public void setPosttime(Timestamp posttime) {
        this.posttime = posttime;
    }

    public Integer getExisttime() {
        return existtime;
    }

    public void setExisttime(Integer existtime) {
        this.existtime = existtime;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
