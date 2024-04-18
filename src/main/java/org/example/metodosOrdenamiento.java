package org.example;

public class metodosOrdenamiento {

    private int tamano;
    private Estudiantes vectorEstudiantes[];

    public metodosOrdenamiento() {
	tamano = 0;
	vectorEstudiantes = null;
    }

    public void crearVector() {
	vectorEstudiantes = new Estudiantes[tamano];
    }

    public void setTamano(int N) {
	tamano = N;
    }

    public int getTamano() {
	return tamano;
    }

    public void setVectorEstudiantes(int p, Estudiantes dato) {
	vectorEstudiantes[p] = dato;
    }

    public Estudiantes getVectorEstudiantes(int p) {
	return vectorEstudiantes[p];
    }

    public void cambiar(int p1, int p2) {
	Estudiantes temp = getVectorEstudiantes(p1);
	setVectorEstudiantes(p1, getVectorEstudiantes(p2));
	setVectorEstudiantes(p2, temp);
    }

    public void ordenarBurbuja() {
	for (int i = 0; i < getTamano(); i++) {
	    for (int j = 0; j < getTamano() - 1; j++) {
		if (getVectorEstudiantes(j).getNota() > getVectorEstudiantes(j + 1).getNota()) {
		    cambiar(j, j + 1);
		}
	    }
	}
    }

    public void ordenarIntercambio() {
	for (int i = 0; i < getTamano(); i++) {
	    for (int j = i + 1; j < getTamano() - 1; j++) {
		if (getVectorEstudiantes(i).getNota() > getVectorEstudiantes(j + 1).getNota()) {
		    cambiar(i, j);
		}
	    }
	}
    }

    public int posicionMenor(int inicio) {
	int posMenor = inicio;
	float menorElemento = getVectorEstudiantes(inicio).getNota();

	for (int i = inicio + 1; i < getTamano(); i++) {
	    if (getVectorEstudiantes(i).getNota() < menorElemento) {
		menorElemento = getVectorEstudiantes(i).getNota();
		posMenor = i;
	    }
	}
	return posMenor;
    }

    public void ordenarSeleccion() {
	for (int i = 0; i < getTamano(); i++) {
	    cambiar(i, posicionMenor(i));
	}
    }
}
