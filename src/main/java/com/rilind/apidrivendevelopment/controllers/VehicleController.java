package com.rilind.apidrivendevelopment.controllers;


import com.rilind.apidrivendevelopment.api.VehicleApi;
import com.rilind.apidrivendevelopment.models.Vehicle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VehicleController implements VehicleApi {
    private static final Logger LOGGER = LoggerFactory.getLogger(VehicleController.class);

    private List<Vehicle> getVehicles() {
        Vehicle tesla = new Vehicle();
        tesla.setMake("Tesla");
        tesla.setModel("Model S");
        Vehicle lambo = new Vehicle();
        lambo.setMake("Lamborghini");
        lambo.setModel("Aventador");
        ArrayList<Vehicle> list = new ArrayList<>();
        list.add(tesla);
        list.add(lambo);
        return list;
    }

    @Override
    public ResponseEntity<Vehicle> createVehicle(Vehicle body) {
        LOGGER.info("Creating a Vehicle - endpoint");
        return ResponseEntity.ok(body);
    }

    @Override
    public ResponseEntity<List<Vehicle>> getAllVehicles() {
        LOGGER.info("Returning a a list with vehicles - endpoint");
        return ResponseEntity.ok(getVehicles());
    }

    @Override
    public ResponseEntity<Vehicle> getSingleVehicle() {
        LOGGER.info("Returning a single vehicle - endpoint");
        return ResponseEntity.ok(getVehicles().get(0));
    }
}
