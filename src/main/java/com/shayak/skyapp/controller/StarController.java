package com.shayak.skyapp.controller;

import com.shayak.skyapp.model.Star;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class StarController {

    @GetMapping("/stars")
    public List<Star> getStars() {
        return Arrays.asList(
            new Star("Sirius", 6.75, -16.72, -1.46),
            new Star("Vega", 18.62, 38.78, 0.03)
        );
    }

    @GetMapping("/planets")
    public List<Star> getPlanets() {
        return Arrays.asList(
            new Star("Mars", 12.0, -5.0, -2.0),
            new Star("Jupiter", 14.0, 10.0, -2.5)
        );
    }
}
