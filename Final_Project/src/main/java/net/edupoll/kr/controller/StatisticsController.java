package net.edupoll.kr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.edupoll.kr.service.CharService;

@Controller
@RequestMapping("/statistics")
public class StatisticsController {

    @Autowired
    CharService charService;


    @ResponseBody
    @RequestMapping("/message/data")
    public List<Object[]> messageDataHandle()
    {
        List<Object[]> rst =  charService.visulChar();

        return rst;
    }

    @RequestMapping("/messages")
    public String messageHandle()
    {
        return "statistics/char";
    }
}
