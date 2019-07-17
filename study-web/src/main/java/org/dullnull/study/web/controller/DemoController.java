package org.dullnull.study.web.controller;

import org.dullnull.study.biz.service.DemoService;
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
    public String test() {
        return demoService.test();
    }

}
