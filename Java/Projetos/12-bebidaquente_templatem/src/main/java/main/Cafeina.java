package main;

public abstract class Cafeina {

	public abstract void ferveAgua();

	public abstract void colocaCafenoCoador();

	public abstract void adicionaAguaFervidaAoCoador();

	public abstract boolean finalizaBebida();

	public final void fazerBebida() {
		ferveAgua();
		colocaCafenoCoador();
		adicionaAguaFervidaAoCoador();
		finalizaBebida();

	}

}