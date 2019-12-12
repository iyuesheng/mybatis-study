package cn.iisheng.study.biz.service.impl;

import cn.iisheng.study.biz.service.DemoService;
import cn.iisheng.study.dao.entity.UserDO;
import cn.iisheng.study.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author iisheng
 * @date 2019/07/11 11:47:45
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DemoServiceImpl demoServiceImpl;

    @Override
    @Cacheable(value = "UserDO", key = "'UserDO:'.concat(#id)")
    public UserDO get(Long id) {
        UserDO userDO = userMapper.selectById(id);
        return userDO;
    }

    @Override
    public boolean updateName(Long id) {
        demoServiceImpl.update(id);
        return true;
    }

    @CacheEvict(cacheNames = "UserDO", key = "'UserDO:'.concat(#id)", beforeInvocation = true)
    public void update(Long id) {
        userMapper.updateNameById(1L, "33333");
    }


}
