package cn.iisheng.study.dao.entity;

import lombok.*;

import java.io.Serializable;

/**
 * @author iisheng
 * @date 2019/07/11 12:21:24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDO implements Serializable {

    private static final long serialVersionUID = -2498092843745253320L;

    private Long id;

    private String name;

}
