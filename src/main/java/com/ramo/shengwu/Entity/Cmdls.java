package com.ramo.shengwu.Entity;

public class Cmdls {
    private Integer id;
    private Integer cmd;
    private  Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCmd() {
        return cmd;
    }

    public void setCmd(Integer cmd) {
        this.cmd = cmd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Cmdls{" +
                "id=" + id +
                ", cmd=" + cmd +
                ", status=" + status +
                '}';
    }
}
