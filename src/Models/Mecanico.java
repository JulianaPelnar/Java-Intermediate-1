package Models;

public class Mecanico {
	private static Mecanico mec = null;
	
	private Mecanico() {}
	
	public static Mecanico getMecanico() {
		if(mec == null) {
			mec = new Mecanico();
		}
		return mec;
	}
	
	public static String reparar(Vehiculo h) {
		return h.toString() + "// Está siendo reparado";
	}

}
