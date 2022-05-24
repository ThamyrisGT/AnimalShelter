package br.com.exercise.sr.reis.utils;

public class Address {

	private String street;
	private String city;
	private String state;
	private String district;
	private Integer number;
	private String CEP;

	public Address(String street, String city, String state, String district, Integer number, String CEP) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.district = district;
		this.number = number;
		this.CEP = CEP;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getDistrict() {
		return district;
	}

	public Integer getNumber() {
		return number;
	}

	public String getCEP() {
		return CEP;
	}

}
