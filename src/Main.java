import Models.Auto;
import Models.Moto;
import Models.Avion;
import Models.Helicoptero;
import Models.Mecanico;
import Enums.Estado;

public class Main {

	public static void main(String[] args) {
		
		Auto asd1 = new Auto();
		asd1.setBranch("TVH");
		asd1.setModel("sfhskfh");
		asd1.setDoors(4);
		Auto as1 = new Auto();
		as1.setBranch("Dfd");
		as1.setModel("Hola");
		
		Moto asd2 = new Moto();
		asd2.setBranch("sdfgsf");
		asd2.setCylinders(400);
		asd2.setModel("sfk");
		Moto as2 = new Moto();
		as2.setBranch("sdfgsf");
		as2.setCylinders(400);
		as2.setModel("sfk");
		
		Avion asd3 = new Avion();
		
		Helicoptero asd4 = new Helicoptero();
		
		System.out.println(Mecanico.reparar(asd1));
		System.out.println(Mecanico.reparar(asd2));
		System.out.println(Mecanico.reparar(asd3));
		System.out.println(Mecanico.reparar(asd4));
		
		
		
		asd1.realizarAccion(Estado.ACELERAR);
		asd2.realizarAccion(Estado.ENCENDER);
		asd3.realizarAccion(Estado.APAGAR);
		asd4.realizarAccion(Estado.FRENAR);

	}

}
