package com.reservation.RestaurantReservation.controller;

import com.reservation.RestaurantReservation.model.Guests;
import com.reservation.RestaurantReservation.service.ProjectService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/visitors")
@AllArgsConstructor
public class ProjectController {

    private ProjectService service;

    @GetMapping
    public List<Guests> findAllVisitors(){
        //todo
        return service.findAllVisitors();
    }
}