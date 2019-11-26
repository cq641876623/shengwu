package com.ramo.shengwu.Controller;


import com.ramo.shengwu.Entity.Cmdls;
import com.ramo.shengwu.Service.CmdlsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@Controller
@RequestMapping("/Cmdls")
public class CmdlsController {

@Resource
private CmdlsService cmdlsService;
    /**
     * 查询
     */
@RequestMapping("/findCmdls")
@ResponseBody
public Cmdls logicDel() {
    return cmdlsService.logicDel();
    }


    /**
     * 增加
     */
//@RequestMapping(value = "/addCmdls",method = RequestMethod.POST)
//@ResponseBody
//public  Boolean addCmdls(@RequestBody Cmdls cmdls){
//           try{
//               cmdlsService.insert(cmdls);
//               return true;
//
//           }catch (Exception e){
//               e.printStackTrace();
//               return false;
//           }
//  }

    /**
     * 更新
     */
    @GetMapping(value = "/updateCmdls")
    @ResponseBody
public boolean updateCmdls(@RequestParam("status") Integer status){
    try {
        cmdlsService.update(status);
        return true;

    }catch (Exception e){
        e.printStackTrace();
        return false;
    }
}

}
