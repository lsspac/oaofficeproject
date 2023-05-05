package com.atguigu.auth.service;

import com.atguigu.auth.mapper.SysRoleMapper;
import com.atguigu.model.system.SysRole;
import com.atguigu.vo.system.AssginRoleVo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;


public interface SysRoleService extends IService<SysRole> {

    //根据用户获取角色数据
    Map<String, Object> findRoleByAdminId(Long userId);
    //分配角色
    void doAssign(AssginRoleVo assginRoleVo);
}
