package com.example.pet2.controller;

import com.example.pet2.pojo.Admins;
import com.example.pet2.service.AdminsService;
import com.example.pet2.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("admin")
public class AdminController {

    public static int ok=200;
    @Autowired
    private AdminsService adminsService;

    @RequestMapping("del_byid")
    public JsonResult<Void> delete_byid(Integer id){
        adminsService.deleteById(id);
        return new JsonResult<>(ok);
    }

    @RequestMapping("update_select/{id}")
    public JsonResult<Void> update(Admins admins){
        adminsService.updateSelective(admins);
        return new JsonResult<>(ok);
    }

    @RequestMapping("selectone_byid")
    public JsonResult<Admins> find_one(Integer id){
        Admins data = adminsService.selectOneById(id);
        return new JsonResult<>(ok,data);
    }

    @RequestMapping("selectall")
    public List<Admins> findall(String adminname){
        List<Admins> data = adminsService.selectAllByAdminname(adminname);
        return data;
    }

    @RequestMapping("selectall_adminInfo")
    public JsonResult<List<Admins>> findall_adminInfo(){
        List<Admins> list = adminsService.selectAllAdminInfo();
        return new JsonResult<>(ok,list);
    }

    @RequestMapping("selectone_by_realname")
    public JsonResult<List<Admins>> findone_by_realname(String realname){
        List<Admins> data = adminsService.selectAllByRealname(realname);
        return new JsonResult<>(ok,data);
    }

    @RequestMapping("insert_one")
    public JsonResult<Void> insert(Admins admins){
        int row = adminsService.insertSelective(admins);
        return new JsonResult<>(ok);
    }

    @RequestMapping("reg")
    public JsonResult<Void> registry(Admins admins){
        int row = adminsService.reg(admins);
        return  new JsonResult<>(ok);
    }

    @RequestMapping("login")
    public JsonResult<Void> login(String adminname, String adminpwd, HttpSession session){
        Admins data = adminsService.login(adminname, adminpwd);
        //session.setAttribute("adminname",data.getAdminname());
        //System.out.println(data.getAdminname());
        if(data!=null){
            //session.setAttribute("adminname",data.getAdminname());
            //System.out.println(session.getAttribute("adminname"));
            return new JsonResult<>(ok);
        }
        else {
            return new JsonResult<>(100);
        }
    }

}
