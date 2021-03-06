package com.zhw.eurekaclient.hami2dao;

import com.zhw.eurekaclient.hami2model.SysUser;

import java.util.List;

public interface SysUser2Mapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
    
    /**
     * 查询全部
     * @return
     */
    List<SysUser> findAll();
}