package atividades;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MetodoListaTest {

	@Test
	void testAddNumero() {
		ArrayList<ListaTelefonica> lista = new ArrayList<>();
		
		ListaTelefonica a = new ListaTelefonica();
		a.setNome("Rogerinho");
		a.setNumero(40028922);	
		
		lista.add(a);
		assertEquals(a, lista.get(0));
		
	}

	@Test
	void testRemoverNumero() {
		ArrayList<ListaTelefonica> lista = new ArrayList<>();
		
		ListaTelefonica a = new ListaTelefonica();
		a.setNome("Rogerinho");
		a.setNumero(40028922);	
		
		lista.add(a);
		lista.remove(a);
		assertEquals(0, lista.size());
		}
	}
			

