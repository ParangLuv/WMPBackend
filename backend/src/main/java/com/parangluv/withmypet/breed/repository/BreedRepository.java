package com.parangluv.withmypet.breed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parangluv.withmypet.breed.domain.Breed;

public interface BreedRepository extends JpaRepository<Breed, Long>{

}
