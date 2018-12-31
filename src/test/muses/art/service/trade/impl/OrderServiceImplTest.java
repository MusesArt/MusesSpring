package muses.art.service.trade.impl;

import muses.art.model.trade.OrderModel;
import muses.art.service.trade.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/META-INF/applicationContext.xml", "classpath:/META-INF/spring-mvc.xml"})
public class OrderServiceImplTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private OrderService orderService;

    @Test
    public void addOrderOfNoPay(){
        OrderModel orderModel = new OrderModel();
        orderModel.setOrderAmount(Float.parseFloat("14.5"));
        orderModel.setOrderSN("123456");
        orderModel.setPostScript("等会支付");
        orderModel.setTradeNo("123456");
        orderService.addOrderOfNoPay(orderModel,1,1);
    }

    @Test
    public void addOrderOfPay(){
        OrderModel orderModel = new OrderModel();
        orderModel.setOrderAmount(Float.parseFloat("14.5"));
        orderModel.setOrderSN("123456");
        orderModel.setPostScript("支付成功");
        orderModel.setTradeNo("123456");
        orderService.addOrderOfPay(orderModel,1,1);
    }

    @Test
    public void updateStatus(){
        orderService.updateStatus(1);
    }

    @Test
    public void cancelOfUser(){
        orderService.cancelOfUser(1);
    }

    @Test
    public void update(){
        OrderModel orderModel = new OrderModel();
        orderModel.setPayStatus("支付成功");
        orderModel.setUserId(1);
        orderModel.setId(1);
        orderModel.setAddressId(1);
        orderModel.setOrderAmount(Float.parseFloat("14.5"));
        orderModel.setOrderSN("123456");
        orderModel.setPostScript("支付成功");
        orderModel.setTradeNo("123456");
        orderService.update(orderModel);
    }

    @Test
    public void getOrderById(){
        OrderModel orderModel = orderService.getOrderById(1);
        System.out.println(orderModel.getTradeNo());
    }

    @Test
    public void listOrder(){
        List<OrderModel> list = orderService.listOrder(1,1,3);
        for(OrderModel orderModel : list){
            System.out.println(orderModel.getTradeNo());
        }
    }
}
