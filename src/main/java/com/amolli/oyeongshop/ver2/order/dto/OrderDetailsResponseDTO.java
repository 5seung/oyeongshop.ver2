package com.amolli.oyeongshop.ver2.order.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class OrderDetailsResponseDTO {

    private List<OrderDetailResponseDTO> orderDetailItems;
}
