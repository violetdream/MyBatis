package com.personal.batis;

import java.util.List;

/**
 * 2019/5/5/0005
 * Create by 刘仙伟
 */
public interface UserMapper {
    public Object selectUserById(String userId);

    public List<Object> selectUserByCifSeq(String cifseq);
}
