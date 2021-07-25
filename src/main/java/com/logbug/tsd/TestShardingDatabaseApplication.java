package com.logbug.tsd;

import com.logbug.dao.TOrderDao;
import com.logbug.model.TOrder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@MapperScan("com.logbug.dao")
@SpringBootApplication
public class TestShardingDatabaseApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TestShardingDatabaseApplication.class, args);
        TOrderDao dao = context.getBean(TOrderDao.class);
        List<TOrder> list = dao.selectList(null);
        System.out.println("list = " + list.size());
    }

}
