package Models;

import Enums.Estado;

public class Helicoptero extends Vehiculo {

	//  FIELDS
	private String model;
	private String branch;
	private double capacity;

	//  GETTERS
	public String getModel() {
		return this.model;
	}
	
	public String getBranch() {
		return this.branch;
	}
	
	public double getCapacity() {
		return this.capacity;
	}

	//  SETTERS
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	//  hashCode OVERRIDE
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		long temp;
		temp = Double.doubleToLongBits(capacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Helicoptero other = (Helicoptero) obj;
		if (branch == null) {
			if (other.branch != null)
				return false;
		} else if (!branch.equals(other.branch))
			return false;
		if (Double.doubleToLongBits(capacity) != Double.doubleToLongBits(other.capacity))
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
		return "Model: " + model + " Branch: " + branch + " Capacity: " + capacity;
	}
	
	//  METHOD
	public void realizarAccion(Estado a) {
		this.toString();
		switch(a) {
		case ENCENDER:
			System.out.println("El helicóptero se está encendiendo");
			break;
		case APAGAR:
			System.out.println("El helicóptero se está apagando");
			break;
		case ACELERAR:
			System.out.println("El helicóptero está acelerando");
			break;
		case FRENAR:
			System.out.println("El helicóptero está frenando");
			break;
		default:
			System.out.println("El parámetro ingresado no es válido");
		}
	}
}
