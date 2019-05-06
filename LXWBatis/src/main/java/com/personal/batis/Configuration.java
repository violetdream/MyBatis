package com.personal.batis;

import java.lang.reflect.Proxy;
import java.util.ResourceBundle;

/**
 * 2019/5/5/0005
 * Create by 刘仙伟
 */
public class Configuration {

    public final static ResourceBundle sqlMappings;
    static{
        sqlMappings=ResourceBundle.getBundle("mesql");
    }

    /**
     * 返回接口的代理类对象
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class clazz,SqlSession sqlSession) {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(),new Class[]{clazz},new MapperProxy(sqlSession));
    }
}
