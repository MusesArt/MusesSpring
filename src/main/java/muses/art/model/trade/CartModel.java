package muses.art.model.trade;

import muses.art.entity.commodity.Commodity;
import muses.art.entity.user.User;
import muses.art.model.commodity.CommodityListModel;

import java.io.Serializable;
import java.util.Date;

public class CartModel implements Serializable {
    private Integer id;
    private Integer number;
    private Integer userId;
    private CommodityListModel commodity;
    private Integer commodityId;
    private String detail;
    private String parameter;

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public CommodityListModel getCommodity() {
        return commodity;
    }

    public void setCommodity(CommodityListModel commodity) {
        this.commodity = commodity;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

}
