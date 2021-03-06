package Models;

import Enums.Estado;

public class Moto extends Vehiculo {
	
	//  FIELDS
	private String model;
	private String branch;
	private int cylinders;
	
    //  GETTERS
	public String getModel() {
		return this.model;
	}
	
	public String getBranch() {
		return this.branch;
	}
	
	public int getCylinders() {
		return this.cylinders;
	}
	
	//  SETTERS
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	//  hashCode OVERRIDE
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		result = prime * result + cylinders;
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
		Moto other = (Moto) obj;
		if (branch == null) {
			if (other.branch != null)
				return false;
		} else if (!branch.equals(other.branch))
			return false;
		if (cylinders != other.cylinders)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	//  toString OVERRIDE
	@Override
	public String toString() {
		return "Model: " + model + " Branch: " + branch + " Cylinders: " + cylinders;
	}
	
	//  METHOD
	public void realizarAccion(Estado a) {
		this.toString();
		switch(a) {
		case ENCENDER:
			System.out.println("La moto se est� encendiendo");
			break;
		case APAGAR:
			System.out.println("La moto se est� apagando");
			break;
		case ACELERAR:
			System.out.println("La moto est� acelerando");
			break;
		case FRENAR:
			System.out.println("La moto est� frenando");
			break;
		default:
			System.out.println("El par�metro ingresado no es v�lido");
		}
	}
}
