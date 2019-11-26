package com.ramo.shengwu.Service;

import com.ramo.shengwu.Entity.Recordstep;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecordstepService {
    public void delectAll();
    public void deleteOne(Recordstep recordstep);
    public void delectAllTypeOne(String pid,  int  typeid);
    public List<Recordstep> logicDel();
    public void insert(Recordstep recordstep);
}
