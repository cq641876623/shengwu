package com.ramo.shengwu.Service.Impl;

import com.ramo.shengwu.Entity.Recordstep;
import com.ramo.shengwu.Mapper.RecordstepMapper;
import com.ramo.shengwu.Service.RecordstepService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecordstepServiceImpl implements RecordstepService {
    @Resource
    private RecordstepMapper recordstepMapper;
    @Override
    public void delectAll() {
        recordstepMapper.delectAll();
    }

    @Override
    public void deleteOne(Recordstep recordstep) {
        recordstepMapper.deleteOne(recordstep);
    }

    @Override
    public void delectAllTypeOne(String pid, int typeid) {
        recordstepMapper.delectAllTypeOne(pid, typeid);
    }

    @Override
    public List<Recordstep> logicDel() {
        return recordstepMapper.logicDel();
    }

    @Override
    public void insert(Recordstep recordstep) {
        recordstepMapper.insert(recordstep);
    }


}
