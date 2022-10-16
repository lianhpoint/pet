package com.example.pet2.service;

import com.example.pet2.pojo.Admins;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Lenovo
* @description 针对表【admins】的数据库操作Service
* @createDate 2022-10-14 19:36:11
*/
public interface AdminsService extends IService<Admins> {

    List<Admins> selectAllByAdminname(@Param("adminname") String adminname);

    List<Admins> selectAllAdminInfo();

    List<Admins> selectAllByRealname(@Param("realname") String realname);

    int insertSelective(Admins admins);

    int reg(Admins admins);

    Admins login(String adminname,String adminpwd);

    Admins selectOneById(@Param("id") Integer id);

    void updateSelective(Admins admins);

    void deleteById(@Param("id") Integer id);
}
