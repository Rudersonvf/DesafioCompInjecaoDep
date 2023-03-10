package com.rudersonvf.services;

import org.springframework.stereotype.Service;

import com.rudersonvf.entities.Order;

@Service
public class ShippingService {

    private final double minBasic= 100.0;
    private final double midBasic = 200.0;

    public double shipment(Order order) {
        if(order.getBasic() < minBasic) {
            return 20.0;
        }
        else if (order.getBasic() < midBasic) {
            return 12.0;
        }
        else {
            return 0.0;
        }
    }
}