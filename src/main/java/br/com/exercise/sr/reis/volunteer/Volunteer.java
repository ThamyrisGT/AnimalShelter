package br.com.exercise.sr.reis.volunteer;

public class Volunteer {

	private Volunteer volunteer;
	private String registration;

	public Volunteer(Volunteer volunteer, String registration) {
		super();
		this.volunteer = volunteer;
		this.registration = registration;
	}

	public Volunteer getVolunteer() {
		return volunteer;
	}

	public String getRegistration() {
		return registration;
	}

}
