package com.ramo.shengwu.Service.Impl;

import com.ramo.shengwu.Entity.Shebei;
import com.ramo.shengwu.Mapper.ShebeiMapper;
import com.ramo.shengwu.Service.ShebeiService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ShebeiServiceImpl implements ShebeiService {
    @Resource
    private ShebeiMapper shebeiMapper;
    @Override
    public List<Shebei> findByShebei() {
        return shebeiMapper.findByShebei();
    }
    @Override
    public List<Shebei> findShebei( String pid){
        return  shebeiMapper.findShebei(pid);
    }

    @Override
    public List<Shebei> findShebeiById(Integer id) {
        return shebeiMapper.findShebeiById(id);
    }

    @Override
    public void updateStatusById(Integer id,String time){
        shebeiMapper.updateStatusById(id,time);
    }

    @Override
    public void updateName(String name, String pid) { shebeiMapper.updateName(name,pid); }


    @Override
    public void addPidByID(Shebei shebei) {
        shebeiMapper.addPidByID(shebei);
    }

}
