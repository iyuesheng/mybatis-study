package org.dullnull.study.dao.mapper;

import org.dullnull.study.dao.entity.UserDO;

/**
 * @author iisheng
 * @date 2019/07/11 13:16:47
 */
public interface UserMapper {

    /**
     * 根据主键id获取用户信息
     * @param id
     * @return
     */
    UserDO selectById(long id);

}
