package br.com.exercise.sr.reis.animal;

public class Animal {

	private Double weight;
	private String name;
	private Integer age;
	private String code;
	private String size;
	private String type;

	public Animal(Double weight, String name, Integer age, String code, String size, String type) {
		super();
		this.weight = weight;
		this.name = name;
		this.age = age;
		this.code = code;
		this.size = size;
		this.type = type;
	}

	public Double getWeight() {
		return weight;
	}


	public String getName() {
		return name;
	}


	public Integer getAge() {
		return age;
	}


	public String getCode() {
		return code;
	}


	public String getSize() {
		return size;
	}


	public String getType() {
		return type;
	}

}
