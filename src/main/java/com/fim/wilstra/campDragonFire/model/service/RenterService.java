package com.fim.wilstra.campDragonFire.model.service;

import com.fim.wilstra.campDragonFire.model.javaEntity.Renter;
import com.fim.wilstra.campDragonFire.model.repository.RenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RenterService {

    @Autowired
    private RenterRepository renterRepository;

    public List<Renter> listAll() {
        return (List<Renter>) renterRepository.findAll();
    }

    public void save(Renter renter) {
        renterRepository.save(renter);
    }

    public Renter get(Integer id) {
        return renterRepository.findById(id).get();
    }

    public void delete(Integer id) {
        renterRepository.deleteById(id);
    }
}
