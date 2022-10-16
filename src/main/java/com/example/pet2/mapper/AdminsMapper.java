package com.example.pet2.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.example.pet2.pojo.Admins;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Lenovo
* @description 针对表【admins】的数据库操作Mapper
* @createDate 2022-10-14 19:36:11
* @Entity mapper.pojo.Admins
*/
public interface AdminsMapper extends BaseMapper<Admins> {

    List<Admins> selectAllByAdminname(@Param("adminname") String adminname);

    List<Admins> selectAll();

    List<Admins> selectAllByRealname(@Param("realname") String realname);

    int insertSelective(Admins admins);

    int insertAll(Admins admins);

    Admins login(@Param("adminname") String adminname, @Param("adminpwd") String adminpwd);

    Admins selectOneById(@Param("id") Integer id);

    int updateSelective(Admins admins);

    int deleteById(@Param("id") Integer id);
}




