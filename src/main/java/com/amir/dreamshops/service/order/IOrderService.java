package com.amir.dreamshops.service.order;

import com.amir.dreamshops.dto.OrderDto;
import com.amir.dreamshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
