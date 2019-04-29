package com.gupaoedu.crud.dao;

import com.gupaoedu.crud.bean.User;
import org.apache.ibatis.session.RowBounds;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {

    List<User> selectUserList(RowBounds rowBounds);
}