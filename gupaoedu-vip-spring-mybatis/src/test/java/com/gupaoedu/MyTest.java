package com.gupaoedu;

import com.gupaoedu.crud.bean.User;
import com.gupaoedu.crud.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 测试dao层
 *
 * <p>
 * 1、导入Spring  test模块
 * 2、ContextConfiguration 指定Spring配置文件的位置
 * 3、Autowired
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MyTest {

    @Autowired
    UserMapper userMapper;

    /**
     * 逻辑分页
     * @throws IOException
     */
    @Test
    public void testSelectByRowBounds() throws IOException {
        int start = 6; // offset
        int pageSize = 5; // limit
        RowBounds rb = new RowBounds(start, pageSize);
        List<User> list = userMapper.selectUserList(rb); // 使用逻辑分页
        for(User b :list){
            System.out.println(b);
        }
    }

}
