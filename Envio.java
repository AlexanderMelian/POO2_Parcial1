package parcial_practico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Envio {
	public int Enviar(Plancha pla, Paquete paq) {
		paq.calcularValor(pla.getH());
		if(paq.getA() < pla.getA() || paq.getL() < pla.getL()) {
			return 1;
		}
		return 0;
	}
	public void LeerDatos() {
		Integer i = 0;
		Integer count = 0; 
		Paquete Principal = new Paquete();
		try {
		      File myObj = new File("paquetes.in");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String array[] = data.split(" ");
		        if(i != 0) {
		        	count += new Envio().Enviar(new Plancha(Integer.parseInt(array[0]),Integer.parseInt(array[1]),Integer.parseInt(array[2])), Principal);
		        }
		        
		        else {
		        	Principal.setL(Integer.parseInt(array[0]));
		        	Principal.setA(Integer.parseInt(array[1]));
		        	Principal.setH(Integer.parseInt(array[2]));
		        	Principal.setM(Integer.parseInt(array[3]));
		        }
		        i++;
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		String rta = count + "\n" +  Principal.getCantidadPaquetes();
		new GenerarArchivo().Generador(rta);
	}
}