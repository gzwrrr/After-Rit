package com.gzw.rit.service.Impl;

import com.gzw.rit.service.IndexService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
public class IndexServiceImplTests {
    @Autowired
    IndexService indexService;

    @Test
    public void getInfo() {
        Map<String, Object> info = indexService.getUserInfo("admin");
        System.out.println(info);
    }
}
