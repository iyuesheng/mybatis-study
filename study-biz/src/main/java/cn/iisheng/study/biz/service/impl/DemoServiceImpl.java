package cn.iisheng.study.biz.service.impl;

import cn.iisheng.study.biz.service.DemoService;
import cn.iisheng.study.dao.entity.UserDO;
import cn.iisheng.study.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author iisheng
 * @date 2019/07/11 11:47:45
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String test() {
        UserDO userDO = userMapper.selectById(1);
        return userDO.toString();
    }
}
