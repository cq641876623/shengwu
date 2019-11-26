package com.ramo.shengwu.Entity;

public class Recordstep {
    private Integer id;
    private String pid;
    private Integer step;
    private Integer x;
    private Integer y;
    private Integer angle;
    private Integer typeid;
    private Integer gox;
    private Integer goy;
    private  Integer goangle;

    @Override
    public String toString() {
        return "Recordstep{" +
                "id=" + id +
                ", pid='" + pid + '\'' +
                ", step=" + step +
                ", x=" + x +
                ", y=" + y +
                ", angle=" + angle +
                ", typeid=" + typeid +
                ", gox=" + gox +
                ", goy=" + goy +
                ", goangle=" + goangle +
                '}';
    }

    public Integer getGoangle() {
        return goangle;
    }

    public void setGoangle(Integer goangle) {
        this.goangle = goangle;
    }

    public Integer getGox() {
        return gox;
    }

    public void setGox(Integer gox) {
        this.gox = gox;
    }

    public Integer getGoy() {
        return goy;
    }

    public void setGoy(Integer goy) {
        this.goy = goy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getAngle() {
        return angle;
    }

    public void setAngle(Integer angle) {
        this.angle = angle;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }
}
