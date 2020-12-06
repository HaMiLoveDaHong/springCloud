package com.zhw.eurekaclient.controller;

import com.zhw.eurekaclient.hamimodel.SysUser;
import com.zhw.eurekaclient.service.SysUser2Service;
import com.zhw.eurekaclient.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysUser2Service sysUser2Service;
    
    @GetMapping(value="/findAll")
    public List<SysUser> findAll() {
        List<SysUser> result = null;
        try {
            result =  sysUserService.findAll();
        }catch (Exception e){
         log.error("异常:{}",e);
        }
        return result;
    }

    @GetMapping(value="/find2All")
    public List<com.zhw.eurekaclient.hami2model.SysUser> find2All() {
        List<com.zhw.eurekaclient.hami2model.SysUser> result = null;
        try {
            result =  sysUser2Service.findAll();
        }catch (Exception e){
            log.error("异常:{}",e);
        }
        return result;
    }
}