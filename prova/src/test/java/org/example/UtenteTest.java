package org.example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UtenteTest {

    private Utente utente1;

    @Mock
    private Utente utente2;

    @BeforeClass
    public void prima(){
        System.out.println("Prima del test");
    }

    @AfterClass
    public void dopo(){
        System.out.println("Dopo del test");
    }

    @Test
    public void getNomeTest() throws Exception{
        prima();

        when(utente2.getNome()).thenReturn("Alice");

        String nome2 = utente2.getNome();

        assertEquals("Alice", nome2);

        dopo();
    }

    @Test
    public void getEtaTest() throws Exception{
        prima();

        when(utente2.getEta()).thenReturn(21);

        Integer eta2 = utente2.getEta();

        //assertEquals(21, eta2);
        //assertEquals(21, eta2, 1); //1 si intende il distacco che ci può essere tra 21 ed età affinchè il test abbia successo
        //assertTrue(eta2 == 21);
        //assertFalse(eta2 != 21);
        //assertNull(eta2);
        //assertNotNull(eta2);

        /*
        Utente utente3 = new Utente("Alice", 15);
        Utente utente4 = utente3;
        assertSame(utente3, utente4); //controlla se è lo stesso oggetto, non se è uguale
        */

        /*
        Utente utente5 = new Utente("Alice", 15);
        Utente utente6 = new Utente("Aldo", 40);
        assertNotSame(utente5, utente6);
        */

        /*
        int[] arrayA = {1, 2, 3, 4, 5};
        int[] arrayB = {1, 2, 3, 4, 5};
        assertArrayEquals(arrayA, arrayB);
        */


        dopo();
    }




}
