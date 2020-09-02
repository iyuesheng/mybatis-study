package cn.iisheng.study.web.controller;

import cn.iisheng.annotation.DistributedLock;
import cn.iisheng.study.biz.service.DemoService;
import cn.iisheng.study.dao.entity.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author iisheng
 * @date 2019/07/11 10:48:22
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping("/test")
    @DistributedLock(bizNo = "demo", millisecond = 100)
    public String test() {
        UserDO userDO = demoService.get(1L);
        return userDO.toString();
    }

    @GetMapping("/update")
    public void update() {
        demoService.updateName(1L);
    }

}
