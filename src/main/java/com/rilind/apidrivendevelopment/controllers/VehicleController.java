package com.rilind.apidrivendevelopment.controllers;


import api.VehicleApi;
import models.VehicleDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VehicleController implements VehicleApi {
    private static final Logger LOGGER = LoggerFactory.getLogger(VehicleController.class);

    private List<VehicleDto> getVehicles() {
        VehicleDto tesla = new VehicleDto();
        tesla.setMake("Tesla");
        tesla.setModel("Model S");
        VehicleDto lambo = new VehicleDto();
        lambo.setMake("Lamborghini");
        lambo.setModel("Aventador");
        ArrayList<VehicleDto> list = new ArrayList<>();
        list.add(tesla);
        list.add(lambo);
        return list;
    }

    @Override
    public ResponseEntity<VehicleDto> createVehicle(VehicleDto body) {
        LOGGER.info("Creating a Vehicle - endpoint");
        return ResponseEntity.ok(body);
    }

    @Override
    public ResponseEntity<List<VehicleDto>> getAllVehicles() {
        LOGGER.info("Returning a a list with vehicles - endpoint");
        return ResponseEntity.ok(getVehicles());
    }

    @Override
    public ResponseEntity<VehicleDto> getSingleVehicle() {
        LOGGER.info("Returning a single vehicle - endpoint");
        return ResponseEntity.ok(getVehicles().get(0));
    }

    @Override
    public ResponseEntity<VehicleDto> updateVehicle(VehicleDto body) {
        LOGGER.info("Updating the vehicle - endpoint");
        return ResponseEntity.ok(getVehicles().get(0));
    }
}
