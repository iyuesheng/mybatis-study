package cn.iisheng.study.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author iisheng
 * @date 2019/07/11 10:45:37
 */
@SpringBootApplication(scanBasePackages = "cn.iisheng.study")
@MapperScan("cn.iisheng.study.dao")
@EnableCaching
public class StudyWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyWebApplication.class, args);
    }
}
