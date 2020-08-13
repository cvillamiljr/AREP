package edu.escuelaing.arem.ASE.app;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testDesviacion()
    {
        ListaEnlazada ans=new ListaEnlazada(new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14"});
        ListaEnlazada ans1=new ListaEnlazada(new String[]{"0.0000000005","0.0000005","0.000005","0.005"});
        Double res=ans.desviacion();
        Double res1= ans1.desviacion();
        assertEquals(res1,new Double(0.002499084261359561));
        assertEquals(res,new Double(4.183300132670378));
    }
    @Test
    public void testMedia(){
        ListaEnlazada ans=new ListaEnlazada(new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14"});
        ListaEnlazada ans1=new ListaEnlazada(new String[]{"0.0000000005","0.0000005","0.000005","0.005"});
        Double res=ans.media();
        Double res1= ans1.media();
        assertEquals(res,new Double(7.5));
        assertEquals(res1,new Double(0.001251375125));
    }


}
