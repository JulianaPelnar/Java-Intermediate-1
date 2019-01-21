package Models;

import Enums.Estado;

public class Avion extends Vehiculo {

	//  FIELDS
	private String model;
	private String branch;
	private String engine;

	//  GETTERS
	public String getModel() {
		return this.model;
	}
	
	public String getBranch() {
		return this.branch;
	}
	
	public String getEngine() {
		return this.engine;
	}

	//  SETTERS
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	//  hashCode OVERRIDE
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
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
		Avion other = (Avion) obj;
		if (branch == null) {
			if (other.branch != null)
				return false;
		} else if (!branch.equals(other.branch))
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
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
		return "Model: " + model + " Branch: " + branch + " Engine: " + engine;
	}
	
	//  METHOD
	public void realizarAccion(Estado a) {
		this.toString();
		switch(a) {
		case ENCENDER:
			System.out.println("El avión se está encendiendo");
			break;
		case APAGAR:
			System.out.println("El avión se está apagando");
			break;
		case ACELERAR:
			System.out.println("El avión está acelerando");
			break;
		case FRENAR:
			System.out.println("El avión está frenando");
			break;
		default:
			System.out.println("El parámetro ingresado no es válido");
		}
	}
}
