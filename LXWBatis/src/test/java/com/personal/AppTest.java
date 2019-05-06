package com.personal;

import static org.junit.Assert.assertTrue;

import com.personal.batis.Configuration;
import com.personal.batis.Executor;
import com.personal.batis.SqlSession;
import com.personal.batis.UserMapper;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        SqlSession sqlSession=new SqlSession(new Configuration(),new Executor());
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        mapper.selectUserById("1322343546567");

        mapper.selectUserByCifSeq("13872");
//       user = EUser{cifSeq='14412', userSeq='32020', userId='1322343546567'}
    }
}
