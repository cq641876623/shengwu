package com.ramo.shengwu.Service.Impl;

import com.ramo.shengwu.Entity.Cmdls;
import com.ramo.shengwu.Mapper.CmdlsMapper;
import com.ramo.shengwu.Service.CmdlsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CmdlsServiceImpl implements CmdlsService {
    @Resource
    private CmdlsMapper cmdlsMapper;

    @Override
    public Cmdls logicDel() {
        return cmdlsMapper.logicDel();
    }



//    @Override
//    public Cmdls insert(Cmdls cmdls) {
//        cmdlsMapper.insert(cmdls);
//        return cmdls;
//    }
@Override
public   void update(Integer status) {
    cmdlsMapper.update(status);
}

}
