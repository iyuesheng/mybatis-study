package cn.iisheng.study.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author iisheng
 * @date 2019/07/11 12:21:24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDO {

    private Long id;

    private String name;
}
