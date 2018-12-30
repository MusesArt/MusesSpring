package muses.art.service.trade.impl;

import muses.art.model.trade.AddressModel;
import muses.art.service.trade.AddressService;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/META-INF/applicationContext.xml", "classpath:/META-INF/spring-mvc.xml"})
public class AddressServiceImplTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private AddressService addressService;

    @Autowired
    private SessionFactory sessionFactory;

    @Test
    public void addAddressTest(){
        AddressModel addressModel = new AddressModel();
        addressModel.setAddress("留和路318号");
        addressModel.setCity("杭州");
        addressModel.setProvince("浙江");
        addressModel.setSignerMobile("137");
        addressModel.setSignerName("刘");
        addressModel.setDistrict("小和山");
        addressService.addAddressService(addressModel,1);
    }
}
