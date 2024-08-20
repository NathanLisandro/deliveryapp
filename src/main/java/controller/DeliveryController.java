package controller;

import DTO.SignRestaurant;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("delivery")
public class DeliveryController{

    @PostMapping
    public void createDeliveryApp(@RequestBody @Valid SignRestaurant restaurant){

    }
}
