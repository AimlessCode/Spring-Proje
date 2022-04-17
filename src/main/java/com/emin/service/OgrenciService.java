package com.emin.service;

import com.emin.repository.OgrenciRepository;
import com.emin.repository.entity.Ogrenci;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OgrenciService {


    @Autowired
    OgrenciRepository repository;

    public void save(Ogrenci ogrenci) {
        repository.save(ogrenci);
    }

    public void update(Ogrenci ogrenci) {
        repository.save(ogrenci);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }

    public List<Ogrenci> findall() {
        return repository.findAll();
    }


}
