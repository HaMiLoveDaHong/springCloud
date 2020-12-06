package com.zhw.eurekaclient.service;

import com.zhw.eurekaclient.hami2dao.SysUser2Mapper;
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
public class SysUser2Service {

    @Autowired
    SysUser2Mapper sysUserMapper;


    public List<com.zhw.eurekaclient.hami2model.SysUser> findAll() {
        return sysUserMapper.findAll();
    }
}
