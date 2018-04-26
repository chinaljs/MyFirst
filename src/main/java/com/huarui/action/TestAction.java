package com.huarui.action;

import com.huarui.common1.MyTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/23.
 */
@RestController
public class TestAction {
    @Autowired
    private MyTool myTool;

    @RequestMapping("/sayhello/{name}")
    public String sayHello(@PathVariable("name") String name){
        myTool.test();
        return name +":hello";
    }
}
