package altaEnElCielo;

import java.util.ArrayList;

public class Bandera {
	private int longitud;
	private int cortes;
	private int longitudInicial;
	private ArrayList<Integer> tama�osParciales;
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getCortes() {
		return cortes;
	}

	public void setCortes(int cortes) {
		this.cortes = cortes;
	}

	public int getLongitudInicial() {
		return longitudInicial;
	}

	public void setLongitudInicial(int longitudInicial) {
		this.longitudInicial = longitudInicial;
	}
	
	public ArrayList<Integer> getTama�osParciales() {
		return tama�osParciales;
	}

	public void setTama�osParciales(ArrayList<Integer> tama�osParciales) {
		this.tama�osParciales = tama�osParciales;
	}


	public Bandera(int longitudInicial){
		this.longitud=0;
		this.cortes=0;
		this.longitudInicial=longitudInicial;
		tama�osParciales = new ArrayList<Integer>();
	}
	
	public void aumentarCortes(){
		cortes++;
	}
	
	public void aumentarLongitud(){
		longitud+=longitudInicial;
		aumentarCortes();
		tama�osParciales.add(longitudInicial);
		aumentarLongitudInicial();
	}

	private void aumentarLongitudInicial() {
		String longitudNueva = String.valueOf(longitudInicial);
		for(int i=0;i<longitudNueva.length();i++){
			longitudInicial+= Character.getNumericValue(longitudNueva.charAt(i));
		}
	}
}
