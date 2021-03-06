package modell.palya;

import java.util.ArrayList;
import modell.jatekobj.JatekObj;
import modell.jatekobj.Robot;
import skeleton.Logger;

public class Cella {

    private int x;
    private int y;
    private ArrayList<JatekObj> o;
    private Palya palya;
    
   public Cella(Palya p,int x, int y) {
        Logger.printCall(this);
        
        this.x=x;
        this.y=y;
        o=new ArrayList<>();
        this.palya=p;
        
        Logger.printCallEnd();
    }
    /**
     * Kovetkezo cella lekerdezese,sebessegtol fuggoen
     * @param s Aktualis sebesseg
     * @return 
     */
    public Cella getKov(Sebesseg s) {
        Logger.printCall(this, s);
        Cella c = palya.cellaxy(x, y);
        Logger.printCallEnd();
        return c;
    }
    /**
     * Jatekobjektum hozzaadasa a cellahoz
     * @param j Lerakando jatekobjektum
     */
    public void add(JatekObj j) {
        Logger.printCall(this, j);
        
	    o.add(j);
        
        Logger.printCallEnd();
    }
    /**
     * Jatekobjektum eltavolitasa a cellarol
     * @param j Eltavolitando jatekobjektum
     */
    public void remove(JatekObj j) {
        Logger.printCall(this, j);
        o.remove(j);
        Logger.printCallEnd();
    }
    /**
     * Robot ralep a cellara
     * 
     */
    public void ralep(Robot r) {
        Logger.printCall(this, r);
        for (JatekObj obj : o) {
            obj.ralep(r);
        }
        Logger.printCallEnd();
    }
}
