package cn.iisheng.study.biz.service;

import cn.iisheng.study.dao.entity.UserDO;

/**
 * @author iisheng
 * @date 2019/07/11 11:48:05
 */
public interface DemoService {

    UserDO get(Long id);

    boolean updateName(Long id);

}
