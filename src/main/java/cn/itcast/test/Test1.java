package cn.itcast.test;

import cn.itcast.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {


    @Test
    public void test(){
        ApplicationContext app = new ClassPathXmlApplicationContext("Applicationcontext.xml");

       UserDao userDao = (UserDao) app.getBean("userDao");
       userDao.save();

    }
}
