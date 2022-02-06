//package com.gzw.rit.config.shiro;
//
//import com.gzw.rit.domain.User;
//import com.gzw.rit.service.UserService;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.*;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.authz.SimpleAuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.subject.PrincipalCollection;
//import org.apache.shiro.subject.Subject;
//import org.springframework.beans.factory.annotation.Autowired;
//
///**
// * @author 16271
// */
//public class UserRealm extends AuthorizingRealm {
//
//    @Autowired
//    UserService userService;
//
//    /**
//     * 授权
//     *
//     * @param principalCollection
//     * @return
//     */
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        Subject subject = SecurityUtils.getSubject();
//        info.addStringPermission((String)subject.getPrincipal());
//        return info;
//    }
//
//    /**
//     * 认证
//     *
//     * @param authenticationToken
//     * @return
//     * @throws AuthenticationException
//     */
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
//        User user = userService.getUserByName(token.getUsername());
//        if (user == null) {
//            return null;
//        }
//        return new SimpleAuthenticationInfo(user.getPerms(), user.getPassword(), "");
//    }
//}
