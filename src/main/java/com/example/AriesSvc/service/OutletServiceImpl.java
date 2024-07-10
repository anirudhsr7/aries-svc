package com.example.AriesSvc.service;


import com.example.AriesSvc.model.Outlet;
import com.example.AriesSvc.repository.OutletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutletServiceImpl implements OutletService{

    @Autowired
    OutletRepository outletRepository;

    @Override
    public List<Outlet> getOutlets() throws Exception {
        try {
            return outletRepository.findAll();
        }catch (Exception ex){
            throw new Exception(ex);
        }

    }
}
