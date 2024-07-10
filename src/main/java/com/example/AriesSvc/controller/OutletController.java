package com.example.AriesSvc.controller;


import com.example.AriesSvc.model.Outlet;
import com.example.AriesSvc.service.OutletService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v1/api")
@CrossOrigin(origins = {
        "http://localhost:3000"
})
public class OutletController {

    @Autowired
    OutletService outletService;

    @GetMapping("/outlets")
    public ResponseEntity<List<Outlet>> getOutlets() throws Exception {
        List<Outlet> outlets = outletService.getOutlets();
        if(outlets.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(outlets, HttpStatus.OK);
        }
    }

}
