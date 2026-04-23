package ar.edu.unahur.obj2.tdd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    
    void laCajaCierraConCodigoCorrecto(){
        CajaFuerte caja1 = new CajaFuerte(9723, false);
        caja1.cerrarCaja(9723);
        assertTrue(caja1.cajaBloqueada());
    }
    
    @Test

    void laCajaNoCierraConCodigoIncorrecto(){
        CajaFuerte caja2 = new CajaFuerte(9723, false);
        caja2.cerrarCaja(97233);
        assertFalse(caja2.cajaBloqueada());
    }

    @Test
    
    void laCajaAbreConCodigoCorrecto(){
        CajaFuerte caja3 = new CajaFuerte(9723, true);
        caja3.abrirCaja(9723);
        assertFalse(caja3.cajaBloqueada());
    }
    
    @Test

    void laCajaNoAbreConCodigoIncorrecto(){
        CajaFuerte caja4 = new CajaFuerte(9723, true);
        caja4.abrirCaja(97233);
        assertTrue(caja4.cajaBloqueada());
    }

    @Test

    void cajaCerrada() {
        CajaFuerte caja5= new CajaFuerte(3497, true);
        assertTrue(caja5.cajaBloqueada());
    }
    
    @Test

    void cajaAbierta() {
        CajaFuerte caja6= new CajaFuerte(3497,false);
        assertFalse(caja6.cajaBloqueada());
    }
}
