package br.com.exercise.sr.reis.adoption;

import java.time.LocalDate;

import br.com.exercise.sr.reis.adopter.Adopter;
import br.com.exercise.sr.reis.animal.Animal;

public class Adoption {

	private Adopter adopter;
	private Animal animal;
	private String volunteerRegistration;
	private LocalDate date;

	public Adoption(Adopter adopter, Animal animal, String volunteerRegistration, LocalDate date) {
		super();
		this.adopter = adopter;
		this.animal = animal;
		this.volunteerRegistration = volunteerRegistration;
		this.date = date;
	}

	public Adopter getAdopter() {
		return adopter;
	}

	public Animal getAnimal() {
		return animal;
	}

	public String getVolunteerRegistration() {
		return volunteerRegistration;
	}

	public LocalDate getDate() {
		return date;
	}

}
