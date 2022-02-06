//package com.gzw.rit.config.shiro;
//
//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
///**
// * @author 16271
// */
//@Configuration
//public class ShiroConfig {
//
//    @Bean
//    public ShiroFilterFactoryBean shiroFilterFactoryBean(@Qualifier("defaultWebSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager) {
//        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
//
//        // 设置安全管理器
//        shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager);
//
//        // 添加过滤器
//        Map<String, String> filterMap = new LinkedHashMap<>();
//        filterMap.put("/user/add", "perms[user:add]");
//        filterMap.put("/user/update", "perms[user:update]");
//        filterMap.put("/user/*", "authc");
//        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
//
//        shiroFilterFactoryBean.setLoginUrl("/toLogin");
//        return shiroFilterFactoryBean;
//    }
//
//    @Bean
//    public DefaultWebSecurityManager defaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm) {
//        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
//        // 关联 Realm
//        securityManager.setRealm(userRealm);
//        return securityManager;
//    }
//
//    @Bean
//    public UserRealm userRealm() {
//        return new UserRealm();
//    }
//}
