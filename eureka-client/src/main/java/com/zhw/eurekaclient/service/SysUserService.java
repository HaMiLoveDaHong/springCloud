package com.zhw.eurekaclient.service;

import com.zhw.eurekaclient.hamidao.SysUserMapper;
import com.zhw.eurekaclient.hamimodel.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @quthor haMi
 * @date2020/12/6
 */
@Service
@Slf4j
@Transactional
public class SysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }
}
