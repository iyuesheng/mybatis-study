package org.dullnull.study.dao.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author iisheng
 * @date 2019/07/11 12:21:24
 */
@Data
@Builder
public class UserDO {

    private Long id;

    private String name;
}
