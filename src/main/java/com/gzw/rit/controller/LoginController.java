//package com.gzw.rit.controller;
//
//import com.gzw.rit.common.exception.MyException;
//import com.gzw.rit.common.resultUtil.ResultCode;
//import com.gzw.rit.common.resultUtil.Result;
//import com.gzw.rit.domain.User;
//import com.gzw.rit.service.UserService;
//import io.swagger.annotations.ApiModelProperty;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.IncorrectCredentialsException;
//import org.apache.shiro.authc.UnknownAccountException;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.subject.Subject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.io.IOException;
//
///**
// * @author 16271
// */
//@RestController
//@RequestMapping("/dev-api/user")
//@CrossOrigin
//public class LoginController {
//
//    @Autowired
//    UserService userService;
//
//    /**
//     * 登录请求
//     *
//     * @return
//     */
//    @RequestMapping("/login")
//    public Result login(@RequestBody User user) {
//        String token = userService.login(user);
//        return Result.build("token", token);
//    }
//
//    /**
//     * 获取信息
//     *
//     * @return
//     */
//    @GetMapping("/info")
//    public Result info(String token) {
//        return Result.build("token", token);
//    }
//
//    /**
//     * 注销
//     *
//     * @return
//     */
//    @PostMapping("/logout")
//    public Result logout() {
//        return Result.build("data", "success");
//    }
//
//    //@RequestMapping("/record")
//    //public String record() {
//    //    return "record";
//    //}
//    //
//    //@RequestMapping({"/", "/index"})
//    //public String toLogin(Model model) {
//    //    return "index";
//    //}
//    //
//    //@RequestMapping("/user/add")
//    //public String add() {
//    //    return "user/add";
//    //}
//    //
//    //@RequestMapping("/user/update")
//    //public String update() {
//    //    return "user/update";
//    //}
//    //
//    //@RequestMapping("/toLogin")
//    //public String toLogin() {
//    //    return "login";
//    //}
//
//    //@RequestMapping("/login")
//    //public String login(String username, String password, Model model) {
//    //    Subject subject = SecurityUtils.getSubject();
//    //    UsernamePasswordToken token = new UsernamePasswordToken(username, password);
//    //
//    //    try {
//    //        subject.login(token);
//    //        return "index";
//    //    } catch (UnknownAccountException e) {
//    //        model.addAttribute("msg", "用户名错误！");
//    //        return "login";
//    //    } catch (IncorrectCredentialsException e) {
//    //        model.addAttribute("msg", "密码错误！");
//    //        return "login";
//    //    }
//    //}
//
//}
