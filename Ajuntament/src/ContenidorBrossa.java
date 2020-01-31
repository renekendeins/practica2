public class ContenidorBrossa {
	private String codi;
	private int color;
	Ubicacio ubicacio;
	private int anyColocacio;
	private int anyRetirada;
	
	
	public ContenidorBrossa(String codi, int color, Ubicacio ubicacio, int anyColocacio) {
		
	}
	
	public String getTipusBrossa() {
		// retornar el tipus segons el color del 
		
		return "";
	}
	
	public boolean  retirarViaPublica() {
		// 1. treureContenidor(ContenidorBrossa) de la classe Ubicacio
		
		return false;
	}
	
	public String  getUbicacio() {
		return "";
	}
	
	public boolean canviarUbicacio (Ubicacio novaUbicacio) {
		return true;
	}

	public String getCodi() {
		return codi;
	}

	public void setCodi(String codi) {
		this.codi = codi;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public void setUbicacio(Ubicacio ubicacio) {
		this.ubicacio = ubicacio;
	}
	
	public String getEstat() {
		return "";
	}
}