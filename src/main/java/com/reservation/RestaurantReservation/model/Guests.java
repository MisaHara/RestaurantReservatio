package com.reservation.RestaurantReservation.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Guests {
    private String firstName;
    private String lastName;
    private LocalDate dateOfVisit;
    private String number;
}