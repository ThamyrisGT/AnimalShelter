package br.com.exercise.sr.reis.personalData;

public class PersonalData {

	private String name;
	private String phoneNumber;
	private String CPF;

	public PersonalData(String name, String phoneNumber, String CPF) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.CPF = CPF;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getCPF() {
		return CPF;
	}

}
