package com.personal.batis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 2019/5/5/0005
 * Create by 刘仙伟
 */
public class MapperProxy implements InvocationHandler {

    private  SqlSession sqlSession;

    public MapperProxy(SqlSession sqlSession){
        this.sqlSession=sqlSession;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String statementId=method.getDeclaringClass().getName()+"."+method.getName();

        return sqlSession.selectOne(statementId,args[0]);
    }
}
