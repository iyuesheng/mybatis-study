package cn.iisheng.study.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    private Integer age;

    private String desc;

    private String address;

    private Integer height;

}
