package com.ramo.shengwu.Service;

import com.ramo.shengwu.Entity.Shebei;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShebeiService {

    public List<Shebei> findByShebei();

    public List<Shebei> findShebei( String pid);

    public List<Shebei> findShebeiById( Integer id);

    public void updateStatusById(Integer id,String time);

    public void updateName(@Param("name") String name,@Param("pid") String pid);

    public void addPidByID( Shebei shebei);
}
