package br.com.exercise.sr.reis.adopter;

import br.com.exercise.sr.reis.utils.Address;
import br.com.exercise.sr.reis.utils.PersonalData;

public class Adopter {

	private PersonalData personalData;
	private Address address;

	public Adopter(PersonalData personalData, Address address) {
		super();
		this.personalData = personalData;
		this.address = address;
	}

	public PersonalData getPersonalData() {
		return personalData;
	}

	public Address getAddress() {
		return address;
	}

}
