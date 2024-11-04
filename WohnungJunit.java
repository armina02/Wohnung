

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WohnungJunit
{
    @Test 
    public void testTeuer()
    {
        Wohnung teuer;
        
        teuer = new Wohnung("Wien", true, 200001);
        
        assertEquals(teuer.getPreis(),200000);
        
    }
    
    @Test
    public void testOk()
    {
        Wohnung ok;
        
        ok = new Wohnung("Linz", false, 180000);
        
        assertEquals(ok.getPreis(),180000);
        
    }
    
    @Test
    public void testBillig()
    {
        Wohnung billig;
        
        billig = new Wohnung("Salzburg", true, 900);
        
        assertEquals(billig.getPreis(),200000);
        
    }
}
