package com.emin.controller;

import com.emin.repository.entity.Ogrenci;
import com.emin.service.OgrenciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/ogrenci")
public class OgrenciController {
    @Autowired
    private OgrenciService service;

    /**
     * http://localhost:9090/ogrenci/save
     */
    @PostMapping("/save")
    public void save(String ad, String soyad){

    }
@GetMapping("/findall")
    public List<Ogrenci> findall(String token){
    Ogrenci ogrenci = new Ogrenci("ahmet","bay");
    service.save(ogrenci);

    }

}
