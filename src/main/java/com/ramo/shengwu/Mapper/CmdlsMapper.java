package com.ramo.shengwu.Mapper;


import com.ramo.shengwu.Entity.Cmdls;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CmdlsMapper {
    @Select("select * from cmdls where id=1")
    public Cmdls logicDel();

    /**
     * @Insert("insert into cmdls(cmd,status) values (#{cmd},#{status})")
     *     public  void insert(Cmdls cmdls);
     * @param cmdls
     */


    @Update("update cmdls set status=#{status} where id=1")
    public void update(Integer status);
}

