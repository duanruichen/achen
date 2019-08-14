package chen.zsgc;

import chen.zsgc.dao.UserDao;
import chen.zsgc.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * author:琛
 * date：2019/7/30 22:41
 * description:
 */
public class testDao {
    @Test
    public void testDAO() throws IOException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis_config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> users = mapper.queryAll();
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println(mapper.queryOne(1));
        mapper.insertUser(new User(null,"老姜头",true,new Date()));
        mapper.updateUser(new User(1,"老宋头",false,new Date()));
        mapper.deleteUser(2);
        sqlSession.commit();
        sqlSession.close();
    }
}
