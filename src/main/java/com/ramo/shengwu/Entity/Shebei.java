package com.ramo.shengwu.Entity;

public class Shebei {
private Integer id;
private String name;
private Integer status;
private String pid;
private String time;
private Integer firstdone;
private Integer secdone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getFirstdone() {
        return firstdone;
    }

    public void setFirstdone(Integer firstdone) {
        this.firstdone = firstdone;
    }

    public Integer getSecdone() {
        return secdone;
    }

    public void setSecdone(Integer secdone) {
        this.secdone = secdone;
    }

    @Override
    public String toString() {
        return "Shebei{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", pid='" + pid + '\'' +
                ", time='" + time + '\'' +
                ", firstdone=" + firstdone +
                ", secdone=" + secdone +
                '}';
    }
}
