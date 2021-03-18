package com.fim.wilstra.campDragonFire.model.service;

import com.fim.wilstra.campDragonFire.model.javaEntity.RentedSpot;
import com.fim.wilstra.campDragonFire.model.repository.RentedSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentedSpotService {
    @Autowired
    private RentedSpotRepository rentedSpotRepository;

    public List<RentedSpot> listAll() {
        return (List<RentedSpot>) rentedSpotRepository.findAll();
    }

    public void save(RentedSpot rentedSpot) {
        rentedSpotRepository.save(rentedSpot);
    }

    public RentedSpot get(Integer id) {
        return rentedSpotRepository.findById(id).get();
    }

    public void delete(Integer id) {
        rentedSpotRepository.deleteById(id);
    }
}
