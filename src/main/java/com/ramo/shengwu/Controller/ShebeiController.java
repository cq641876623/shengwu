package com.ramo.shengwu.Controller;


import com.ramo.shengwu.Entity.Cmdls;
import com.ramo.shengwu.Entity.Recordstep;
import com.ramo.shengwu.Entity.Shebei;
import com.ramo.shengwu.Service.CmdlsService;
import com.ramo.shengwu.Service.RecordstepService;
import com.ramo.shengwu.Service.ShebeiService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.naming.Name;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

@RestController
@RequestMapping("/app")
public class ShebeiController {
    @Resource
    private ShebeiService shebeiService;
    @Resource
    private RecordstepService recordstepService;

        @GetMapping("/allonlineshebei")
    public List<Shebei> findByShebei(){
        return shebeiService.findByShebei();
    }

    @GetMapping("/login")
    public Boolean UpdateAndInsert(@RequestParam("pid") String pid){
        List<Shebei> list= shebeiService.findShebei( pid);
        Date date=new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(date);
        if (list.size()!=0){
           shebeiService.updateStatusById(list.get(0).getId(),format);

        }else {
            Shebei shebei=new Shebei();
            shebei.setPid(pid);
            shebei.setTime(format);
            shebei.setStatus(1);
            shebeiService.addPidByID(shebei);

        }
        return  true;


    }
    @GetMapping("/changName")
    public Boolean UpdateName(@RequestParam("pid")String pid,@RequestParam("name")String name,@RequestParam("pwd") String pwd){
        System.out.println("==============================================================");
        if (pwd.equals("950727")) {
            shebeiService.updateName(name,pid);
            return true;
        }else {
            return false;
        }

    }
//Cmdls表
    @Resource
    private CmdlsService cmdlsService;
    /**
     * 查询
     */
    @RequestMapping("/findCmdls")

    public Cmdls logicDel() {
        return cmdlsService.logicDel();
    }

    /**
     * 更新
     */
    @RequestMapping(value = "/updateCmdls",method = RequestMethod.GET)
    public boolean updateCmdls(@RequestParam("status") Integer status){
        try {
            cmdlsService.update(status);
            return true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @GetMapping("/deletesetp")
    public Boolean deletesetp(){
        try {
            recordstepService.delectAll();
            return true;
        }catch (Exception e){
            return false;
        }
    }



    @PostMapping("/deleteone")
    public Boolean deleteOne(Recordstep recordstep){
        recordstepService.deleteOne(recordstep);
        return true;
    }
    @GetMapping("/delectalltypeone")
    public Boolean delectAllTypeOne(@RequestParam("pid") String pid,  @RequestParam("typeid") int  typeid){
        recordstepService.delectAllTypeOne(pid, typeid);
        return true;
    }

    @GetMapping("/allsetp")
    public List<Recordstep> allsetp(){
     return  recordstepService.logicDel();
    }
    @PostMapping("/insertstep")
    public Boolean insertstep(@RequestBody Recordstep recordstep){
        recordstepService.insert(recordstep);
        return true;
    }



}
