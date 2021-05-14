package parcial_practico;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class GenerarArchivo {
	public void Generador(String x) {
		try {
	            String ruta = "paquetes.out";
	            File file = new File(ruta);
	            if (!file.exists()) {
	                file.createNewFile();
	            }
	            FileWriter fw = new FileWriter(file);
	            BufferedWriter bw = new BufferedWriter(fw);
	            bw.write(x);
	        
	            bw.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
}