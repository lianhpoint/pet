package com.example.pet2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pet2.service.AdminsService;
import com.example.pet2.pojo.Admins;
import com.example.pet2.mapper.AdminsMapper;
import com.example.pet2.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lenovo
 * @description 针对表【admins】的数据库操作Service实现
 * @createDate 2022-10-14 19:36:11
 */
@Service
public class AdminsServiceImpl extends ServiceImpl<AdminsMapper, Admins>
        implements AdminsService {
    @Autowired
    private AdminsMapper adminsMapper;

    @Override
    public List<Admins> selectAllByAdminname(String adminname) {
        List<Admins> data = adminsMapper.selectAllByAdminname(adminname);
        return data;
    }

    @Override
    public List<Admins> selectAllAdminInfo() {
        List<Admins> data = adminsMapper.selectAll();
        return data;
    }

    @Override
    public List<Admins> selectAllByRealname(String realname) {
        List<Admins> data = adminsMapper.selectAllByRealname(realname);
        return data;
    }

    @Override
    public int insertSelective(Admins admins) {
        int row = adminsMapper.insertSelective(admins);
        return row;
    }

    @Override
    public int reg(Admins admins) {
        int row = adminsMapper.insertAll(admins);
        return row;
    }

    @Override
    public Admins login(String adminname, String adminpwd) {
        Admins data = adminsMapper.login(adminname, adminpwd);
        return data;
    }

    @Override
    public Admins selectOneById(Integer id) {
        Admins admins = adminsMapper.selectOneById(id);
        return admins;
    }

    @Override
    public void updateSelective(Admins admins) {
       adminsMapper.updateSelective(admins);
    }

    @Override
    public void deleteById(Integer id) {
        adminsMapper.deleteById(id);
    }
}




