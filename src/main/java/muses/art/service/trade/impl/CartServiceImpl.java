package muses.art.service.trade.impl;

import muses.art.dao.trade.CartDao;
import muses.art.service.trade.CartService;
import org.springframework.beans.factory.annotation.Autowired;

public class CartServiceImpl implements CartService {

    @Autowired
    private CartDao cartDao;
}
