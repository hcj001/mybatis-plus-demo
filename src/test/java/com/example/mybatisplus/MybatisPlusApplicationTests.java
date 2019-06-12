package com.example.mybatisplus;

import com.example.mybatisplus.entity.Hr;
import com.example.mybatisplus.mapper.HrMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusApplicationTests {

    @Resource
    private HrMapper hrMapper;
    @Test
    public void contextLoads() {
        System.out.println(hrMapper.selectById(3));
    }
    @Test
    public void insert() {
        Hr hr = new Hr();
        hr.setAddress("成都武侯区");
        hr.setName("张某某");
        hr.setRemark("xxx");
        hr.setPhone("10086");
        hr.setUsername("呵呵");
        int result = hrMapper.insert(hr);
        System.out.println(result);
    }
    @Test
    public void delete() {
        hrMapper.deleteById(13);
    }

}
