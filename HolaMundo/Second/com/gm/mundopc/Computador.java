package com.gm.mundopc;

public class Computador {
	 private int idComputador;
	 private String nombre;
	 private Raton raton;
	 private Teclado teclado;
	 private Monitor monitor;
	 private static int contadorComputadoras;
	 
	private Computador() {
		 this.idComputador = ++Computador.contadorComputadoras;
		}

	public Computador(String nombre, Raton raton, Teclado teclado, Monitor monitor) {
		this();
		this.nombre = nombre;
		this.raton = raton;
		this.teclado = teclado;
		this.monitor = monitor;
	}

	public int getIdComputador() {
		return idComputador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Raton getRaton() {
		return raton;
	}

	public void setRaton(Raton raton) {
		this.raton = raton;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	@Override
	public String toString() {
		return "Computador [idComputador=" + idComputador + ", nombre=" + nombre + ", raton=" + raton + ", teclado="
				+ teclado + ", monitor=" + monitor + "]";
	}
	 
}
