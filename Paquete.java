package parcial_practico;

public class Paquete {
	private Integer L, A, H, M;
	private Integer cantidadPaquetes = 0;
	private Integer valorActual = 0;
	

	public Paquete(int L, int A, int H, int M) {
		this.L = L;
		this.A = A;
		this.H = H;
		this.M = M;
	}
	
	public void calcularValor(int x) {
		if(this.valorActual + x >= this.H) {
			this.valorActual = x;
			this.cantidadPaquetes += 1;  
		}else {
			if(this.cantidadPaquetes == 0 ) {
				this.cantidadPaquetes += 1;
			}
			this.valorActual += x;
		}
	}
	
	
	public Paquete() {
		
	}
	public int getL() {
		return L;
	}
	public void setL(int l) {
		this.L = l;
	}
	public int getA() {
		return A;
	}
	public void setA(int a) {
		this.A = a;
	}
	public int getH() {
		return H;
	}
	public void setH(int h) {
		this.H = h;
	}
	public int getM() {
		return M;
	}
	public void setM(int m) {
		this.M = m;
	}

	public Integer getCantidadPaquetes() {
		return cantidadPaquetes;
	}

	public void setCantidadPaquetes(Integer cantidadPaquetes) {
		this.cantidadPaquetes = cantidadPaquetes;
	}

	public Integer getValorActual() {
		return valorActual;
	}

	public void setValorActual(Integer valorActual) {
		this.valorActual = valorActual;
	}
	
}