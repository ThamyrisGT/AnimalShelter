package br.com.exercise.sr.reis.shelter;

import java.util.ArrayList;
import java.util.List;

import br.com.exercise.sr.reis.animal.Animal;
import br.com.exercise.sr.reis.utils.Address;
import br.com.exercise.sr.reis.volunteer.Volunteer;

public class Shelter {

	private List<Volunteer> volunteers = new ArrayList<>();
	private List<Animal> animals = new ArrayList<>();
	private Address address;
	private String CNPJ;

	public Shelter(List<Volunteer> volunteers, List<Animal> animals, Address address, String cNPJ) {
		super();
		this.volunteers = volunteers;
		this.animals = animals;
		this.address = address;
		CNPJ = cNPJ;
	}

	public List<Volunteer> getVolunteers() {
		return volunteers;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public Address getAddress() {
		return address;
	}

	public String getCNPJ() {
		return CNPJ;
	}

}
