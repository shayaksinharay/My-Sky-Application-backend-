package com.shayak.skyapp.controller;

import com.shayak.skyapp.model.ConstellationLine;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class ConstellationController {

    @GetMapping("/constellations")
    public List<ConstellationLine> getConstellations() {
        return Arrays.asList(
            new ConstellationLine("Sirius", "Vega")
        );
    }
}
