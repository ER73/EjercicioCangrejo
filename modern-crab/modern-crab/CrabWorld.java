import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{
    private Counter contGus;
    private Counter contV;
    private Crab cangrejo;
    private Lobster langosta;
    
    public CrabWorld()
    {    
        super(560, 560, 1); 
        contGus= new Counter("Gusanos: ");
        addObject(contGus, 64,20);
        contV= new Counter("Vidas: ");
        addObject(contV, 364,20);
        
        prepare();
    }
    
    public void act()
    {
        contGus.act();
        contV.act();
    }
    
    public void cangrejoAtrapado()
    {
            decVid();
            langosta.setLocation(20,30);
            cangrejo.setLocation(200,300);
            if(contV.getValue()==0)
            {
                Label etiquetaFin=new Label("Game Over", 25);
                addObject(etiquetaFin, 250, 250);
                Greenfoot.stop();
            }
    }
    
    public void comGus()
    {
        incrementaGus();
        if(contGus.getValue()==5)
        {
                Label etiquetaFin=new Label("Winner", 25);
                addObject(etiquetaFin, 250, 250);
                Greenfoot.stop();
        }
    }
    
    public void incrementaGus()
    {
        contGus.add(1);
    }
    
    public void decVid()
    {
        contV.add(-1);
    }
    
    public void reiniciaPosCangrejo()
    {
        //cangrjo.setLocaion();
    }
    
    private void prepare()
    {

        Worm worm = new Worm();
        addObject(worm,426,284);
        Worm worm2 = new Worm();
        addObject(worm2,410,228);
        Worm worm3 = new Worm();
        addObject(worm3,322,85);
        Worm worm4 = new Worm();
        addObject(worm4,264,119);
        Worm worm5 = new Worm();
        addObject(worm5,158,208);
        Worm worm6 = new Worm();
        addObject(worm6,202,234);
        Worm worm7 = new Worm();
        addObject(worm7,253,307);
        Worm worm8 = new Worm();
        addObject(worm8,334,416);
        Worm worm9 = new Worm();
        addObject(worm9,406,421);
        Worm worm10 = new Worm();
        addObject(worm10,476,387);
        Worm worm11 = new Worm();
        addObject(worm11,329,193);
        Worm worm12 = new Worm();
        addObject(worm12,329,193);
        Worm worm13 = new Worm();
        addObject(worm13,137,125);
        Worm worm14 = new Worm();
        addObject(worm14,91,407);
        Worm worm15 = new Worm();
        addObject(worm15,146,433);
        Worm worm16 = new Worm();
        addObject(worm16,220,397);
        Worm worm17 = new Worm();
        addObject(worm17,170,327);
        Worm worm18 = new Worm();
        addObject(worm18,96,313);
        Worm worm19 = new Worm();
        addObject(worm19,61,211);
        Worm worm20 = new Worm();
        addObject(worm20,231,176);
        Worm worm21 = new Worm();
        addObject(worm21,411,132);
        Worm worm22 = new Worm();
        addObject(worm22,506,186);
        Worm worm23 = new Worm();
        addObject(worm23,493,59);
        Worm worm24 = new Worm();
        addObject(worm24,429,59);
        cangrejo = new Crab();
        addObject(cangrejo,361,343);
        langosta = new Lobster();
        addObject(langosta,71,75);
    }
}
