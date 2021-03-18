package com.fim.wilstra.campDragonFire.model.service;

import com.fim.wilstra.campDragonFire.model.javaEntity.CampingSpot;
import com.fim.wilstra.campDragonFire.model.repository.CampingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampingSpotService {
    @Autowired
    private CampingSpotRepository campingSpotRepository;

    public List<CampingSpot> listAll() {
        return (List<CampingSpot>) campingSpotRepository.findAll();
    }

    public void save(CampingSpot campingSpot) {
        campingSpotRepository.save(campingSpot);
    }

    public CampingSpot get(Integer id) {
        return campingSpotRepository.findById(id).get();
    }

    public void delete(Integer id) {
        campingSpotRepository.deleteById(id);
    }
}
