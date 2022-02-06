package com.gzw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 16271
 */
@MapperScan("package com.gzw.rit.mapper")
@SpringBootApplication
public class RitApplication {

    public static void main(String[] args) {
        SpringApplication.run(RitApplication.class, args);
    }

}
