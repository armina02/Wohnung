
public class TestWohnung
{
    public void testTeuer()
    {
        Wohnung teuer;
        
        teuer = new Wohnung("Wien", true, 200001);
        
        System.out.println(teuer.getPreis());
        //200000
    }
    
    public void testOk()
    {
        Wohnung ok;
        
        ok = new Wohnung("Linz", false, 180000);
        
        System.out.println(ok.getPreis());
        //180000
    }
    
    public void testBillig()
    {
        Wohnung billig;
        
        billig = new Wohnung("Salzburg", true, 900);
        
        System.out.println(billig.getPreis());
        //200000
    }
}
