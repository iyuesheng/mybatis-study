package cn.iisheng.study.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author iisheng
 * @date 2019/07/11 10:45:37
 */
@SpringBootApplication(scanBasePackages = "org.dullnull.study")
@MapperScan("org.dullnull.study.dao")
public class StudyWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyWebApplication.class, args);
    }
}
