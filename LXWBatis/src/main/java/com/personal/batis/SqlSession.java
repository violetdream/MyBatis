package com.personal.batis;

/**
 * 2019/5/5/0005
 * Create by 刘仙伟
 */
public class SqlSession {
    private Configuration configuration;
    private Executor executor;

    public SqlSession(Configuration configuration, Executor executor) {
        this.configuration = configuration;
        this.executor = executor;
    }

    /**
     * 调用Executor执行单条查询
     * @param statementId
     * @param parameter
     * @param <T>
     * @return
     */
    public <T> T selectOne(String statementId,Object parameter){
        String sql=Configuration.sqlMappings.getString(statementId);
        if(null!=sql&&!"".equals(sql)){
            return executor.query(sql,parameter);
        }
        return null;
    }

    /**
     * 获取一个代理对象
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class clazz){
        return configuration.getMapper(clazz,this);
    }
}
