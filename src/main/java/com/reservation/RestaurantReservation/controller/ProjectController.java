package com.reservation.RestaurantReservation.controller;

import com.reservation.RestaurantReservation.model.Guests;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/visitors")
public class ProjectController {

    @GetMapping
    public List<Guests> findAllVisitors(){
        return List.of(
                Guests.builder().firstName("Aslan").lastName("lastName").number("7770777771").build(),
                Guests.builder().firstName("Yerlan").lastName("lastName").number("7770677772").build(),
                Guests.builder().firstName("Zhaslan").lastName("lastName").number("7770577773").build()
        );
    }
}