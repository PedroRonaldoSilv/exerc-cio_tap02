/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativida1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author samsung
 */
public class calcularsalariodefuncionarioTest {

    public calcularsalariodefuncionarioTest() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testcalcular() {
        calcularsalariodefuncionario pe = new calcularsalariodefuncionario();

        assertEquals((2400), pe.calcular("desenvolvedor", 3000));
        assertEquals((1500), pe.calcular("DBA", 2000));
        assertEquals((3500), pe.calcular("gerente", 5000));
        assertEquals((1500), pe.calcular("testador", 2000));

    }

}
