package net.edupoll.kr.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.edupoll.kr.entity.TimeCountVo;
import net.edupoll.kr.repository.TimeCountDao;

@Service
public class CharService {
    
    @Autowired
    TimeCountDao dao;

    public List<Object[]> visulChar()
    {
        List<Object[]> ret = new ArrayList<Object[]>();
        List<TimeCountVo> vo = dao.visualCharTimeOut();

        ret.add(new Object[] {"hour", "count"});

        for (TimeCountVo timeCountVo : vo) {
            ret.add(new Object[] {timeCountVo.getHour(), timeCountVo.getCnt()} );
        }
        return ret;
    }

}
