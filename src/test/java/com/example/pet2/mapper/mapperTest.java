package com.example.pet2.mapper;

import com.example.pet2.pojo.Admins;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest//表示当前类是一个测试类，不会随同项目一起打包
/**
 * @RunWith表示启动这个单元测试类，(单元测试类是不能运行的，项目创建时自带的不用写这个类，自己写的测试类需要写这个注解)
 * 需要传递一个参数，这个参数必须是SpringRunner.class
 */
@RunWith(SpringRunner.class)
public class mapperTest {
    @Autowired
    private AdminsMapper adminsMapper;

    @Test
    public void test3(){
        Admins admins = new Admins();
        admins.setAdminname("asd");
        int i = adminsMapper.updateSelective(admins);
        System.err.println(i);
    }

    @Test
    public void test(){
        Admins admins = new Admins();
        admins.setRemark("asd");
        int row = adminsMapper.insertSelective(admins);
        System.err.println(row);
    }

    @Test
    public void test2(){
        Admins admins = adminsMapper.selectOneById(1);
        System.out.println(admins);
    }
}
