package com.reservation.RestaurantReservation.service;

import com.reservation.RestaurantReservation.model.Guests;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ProjectService {
    @GetMapping
    public List<Guests> findAllVisitors(){
        return List.of(
                Guests.builder().firstName("Aslan").lastName("lastName").number("7770777771").build(),
                Guests.builder().firstName("Yerlan").lastName("lastName").number("7770677772").build(),
                Guests.builder().firstName("Zhaslan").lastName("lastName").number("7770577773").build()
        );
    }
}