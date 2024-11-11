package enumeracion;

public enum Continentes {
	AFRICA(53),  // puede crecer mas AFRICA(53, "1.2 billones") y se cambia el constructor en el String
	EUROPA(46),
	ASIA(44),
	AMERICA(34),
	OCEANIA(14); // SE USA ; CUANDO VAMOS A SEGUIR LA PROGRAMACION 
	
	private final int paises;
	// se define un constructor
	Continentes(int paises){
		this.paises = paises;
	}
	
	public int getPaises() {
		return this.paises;
	}
}
