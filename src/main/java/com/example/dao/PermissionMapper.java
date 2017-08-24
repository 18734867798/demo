package com.example.dao;

import com.example.po.Permission;

import java.util.List;

/**
 * Created by git on 2017/8/22.
 */
public interface PermissionMapper {
    public List<Permission> findAll();
    public List<Permission> findPermissonsByUserId(Integer userId);
}
