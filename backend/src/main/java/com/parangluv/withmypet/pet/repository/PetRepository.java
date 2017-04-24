package com.parangluv.withmypet.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parangluv.withmypet.pet.domain.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {

}
