package com.parangluv.withmypet.breed.domain;

public enum Species {
	Feline("고양이과"),
	Canine("개과"),
	Muridae("쥐과"),
	Aves("조류");
	
	private String species;
	
	Species(String species) {
		this.species = species;
	}
	
}
