package com.gupaoedu.crud.interceptor;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;

/**
 * 2019/4/29/0029
 * Create by 刘仙伟
 */
@Intercepts(
    {
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}),
    }
)
public class LogInteceptor implements Interceptor {


    public Object intercept(Invocation invocation) throws Throwable {
            Object[] args=invocation.getArgs();
            MappedStatement ms= (MappedStatement) args[0];
            Object parameter = args[1];
            BoundSql boundSql=ms.getBoundSql(parameter);
            System.out.println("执行语句："+boundSql.getSql());
            System.out.println("执行参数："+boundSql.getParameterObject());
            long startTime=System.currentTimeMillis();
            invocation.proceed();
            System.out.println("执行时间："+(System.currentTimeMillis()-startTime)+" ms");
            return null;
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target,this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
