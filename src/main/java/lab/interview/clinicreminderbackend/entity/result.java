package lab.interview.clinicreminderbackend.entity;

import lombok.Data;

@Data
public class result {
    private int code;//-1:参数不足，-2:权限不足，0:正常应答
    private String msg;//提示信息
    //private List<?> list;
    private Object object;
    private int count;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}


