package com.ramo.shengwu.Mapper;


import com.ramo.shengwu.Entity.Recordstep;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RecordstepMapper {


//    查询 页面上
    @Select("select * from recordstep ")
    public List<Recordstep> logicDel();


//    增加
    @Insert("insert into recordstep(pid,step,x,y,angle,typeid,gox,goy) values (#{pid},#{step},#{x},#{y},#{angle},#{typeid} ,#{gox},#{goy})")
    public void insert(Recordstep recordstep);

    @Delete("delete from recordstep where id=#{id}")
    public void delete(Integer id);

//    清空
    @Delete("delete from recordstep")
    public void delectAll();

//    全删
    @Delete("delete  from recordstep where pid = #{pid} and typeid = #{typeid}")
    public void delectAllTypeOne(@Param("pid") String pid,@Param("typeid") int  typeid);

//    删除
    @Delete("delete  from recordstep where pid = #{pid} and typeid = #{typeid} and x = #{x} and y = #{y} and angle = #{angle}  ")
    public void deleteOne(Recordstep recordstep);

}
