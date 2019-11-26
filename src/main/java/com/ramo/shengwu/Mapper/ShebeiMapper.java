package com.ramo.shengwu.Mapper;


import com.ramo.shengwu.Entity.Shebei;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ShebeiMapper {
@Select("select * from shebei where status=1  ")
    public List<Shebei> findByShebei();

@Select("select * from shebei")
public List<Shebei> findByTime();

@Select("select * from shebei where pid=#{pid}")
    public List<Shebei> findShebei( String pid);

    @Select("select * from shebei where id=#{id}")
    public List<Shebei> findShebeiById( Integer id);

@Update("update shebei    set    status =1,  time=     #{time}   where id=#{id}")
    public int updateStatusById(@Param("id") Integer id,@Param("time") String time);

@Update("update shebei   set    status =0 where id=#{id}")
    public int updateStatus(@Param("id")Integer id);

@Update("update shebei set name=#{name} where pid=#{pid}")
    public int updateName(@Param("name") String name,@Param("pid") String pid);

@Insert("insert into shebei(pid,status,time) values (#{pid},#{status},#{time}) ")
    public void addPidByID(Shebei shebei);
}
