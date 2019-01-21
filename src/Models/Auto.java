package Models;

import Enums.Estado;

public class Auto extends Vehiculo {
	
	//  FIELDS
	private String model;
	private String branch;
	private int doors;
	
	//  GETTERS
	public String getModel() {
		return this.model;
	}
	public String getBranch() {
		return this.branch;
	}
	public int getDoors() {
		return this.doors;
	}
	
	//  SETTERS
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	
	//  toString OVERRIDE
	@Override
	public String toString() {
		return "Model: " + model + " Branch: " + branch + " Doors: " + doors;
	}

	//  hashCode OVERRIDE
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		result = prime * result + doors;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}
	
	//  equals OVERRIDE
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (branch == null) {
			if (other.branch != null)
				return false;
		} else if (!branch.equals(other.branch))
			return false;
		if (doors != other.doors)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	//  METHOD
	public void realizarAccion(Estado a) {
		this.toString();
		switch(a) {
		case ENCENDER:
			System.out.println("El auto se está encendiendo");
			break;
		case APAGAR:
			System.out.println("El auto se está apagando");
			break;
		case ACELERAR:
			System.out.println("El auto está acelerando");
			break;
		case FRENAR:
			System.out.println("El auto está frenando");
			break;
		default:
			System.out.println("El parámetro ingresado no es válido");
		}
	}
	
}
