package com.serket.cloud.test;

import com.serket.cloud.bean.Drugstore;
import com.serket.cloud.service.DrugstoreService;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by WangYa on 2015/5/11.
 */
public class DrugstoreTest {
    ApplicationContext context=new ClassPathXmlApplicationContext("applicationConext.xml");
    DrugstoreService service= context.getBean(DrugstoreService.class);
    @org.junit.Test
    public void testaddDrugstroe() {

        Drugstore d= new Drugstore();
        d.setName("admin");
        d.setPassword("123456");
        d.setAppid("199999999999999999999");
        service.addDrugstore(d);
    }

    @org.junit.Test
    public void testLogin(){
         //String sttr=   service.login("admin2", "123456", ip);
      //  System.out.println(sttr);
    }

}
