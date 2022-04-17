package com.emin.repository;

import com.emin.repository.entity.Ogrenci;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OgrenciRepository extends JpaRepository<Ogrenci, Long> {


}