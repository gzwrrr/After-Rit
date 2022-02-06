package com.gzw.rit.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.gzw.rit.domain.Permission;
import com.gzw.rit.service.PermissionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PermissionServiceImplTests {

    @Autowired
    PermissionService permissionService;

    @Test
    public void test() {
        List<JSONObject> menu = permissionService.selectPermissionByUserId("2");
        System.out.println(menu);
    }

    @Test
    public void queryAllMenu() {
        List<Permission> menu = permissionService.queryAllMenu();
        for (Permission it : menu) {
            System.out.println(it);
        }
    }
}
