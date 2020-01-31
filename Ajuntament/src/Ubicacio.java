public class Ubicacio {
	
	private String calle;
	private int numero;
	private boolean cruze;	
	private int numContenedores;
	private static int max_contenedores;
	private ContenidorBrossa[] contenedores;
	private ContenidorBrossa contenedor;
	
	private Ubicacio(int max_contenedores, String calle, int numero, boolean cruze) {
		Ubicacio.max_contenedores = max_contenedores;
		this.calle = calle;
		this.calle = calle;
		this.numero = numero;
		this.cruze = cruze;
	}
	
	private void setup() {
		numContenedores = 0;
		contenedores = new ContenidorBrossa[max_contenedores];
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isCruze() {
		return cruze;
	}

	public void setCruze(boolean cruze) {
		this.cruze = cruze;
	}

	public ContenidorBrossa getContenedores(int contenedor) {
		for (int i = contenedor; i < this.numContenedores; i++) {
			if (this.contenedores[i] != null) {
				return this.contenedores[i];
			}
			else {
				return null;
			}
		}
		return null;
	}

	public boolean setContenedores(ContenidorBrossa contenedor) {
		for (int i = 0; i < max_contenedores; i++) {
			if (this.contenedores[i] == null && !this.contenedor.getCodi().equalsIgnoreCase(contenedor.getCodi())) {
				this.contenedores[i] = contenedor;
				numContenedores++;
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteContenedores(ContenidorBrossa contenedor) {
		for (int i = 0; i < max_contenedores; i++) {
			if (this.contenedores[i].getCodi().equalsIgnoreCase(contenedor.getCodi())) {
				this.contenedores[i] = null;
				numContenedores--;
				return true;
			}
		}
		return false;
	}
	
	public String getContenidors() {
		String codis = " ";
		
		for (int i = 0; i < this.contenedores.length; i++) {
			if (this.contenedores[i] != null) {
				codis = this.contenedores[i].getCodi();
			}
			if (this.contenedores[i+1] != null) {
				codis = codis + "-";
			}
		}		
		return codis;
	}
}