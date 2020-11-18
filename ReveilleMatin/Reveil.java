package com.company.ReveilleMatin;

public class Reveil implements Observateur{

    private int nombreReveil = 2;
    private int[] heureReveil = new int[nombreReveil];
    private int[] minuteReveil = new int[nombreReveil];
    private boolean reveil;
    private SonReveil son;
    private ModeReveil mode = ReveilEteint.getInstance();

    public void setReveil(boolean b) { reveil = b; }

    public void setSonReveil(SonReveil choix) { son = choix; }

    public void regleReveil(int h, int m, int choixHeureReveil) {
        if(choixHeureReveil >= 0 && choixHeureReveil < nombreReveil) {
            heureReveil[choixHeureReveil] = h;
            minuteReveil[choixHeureReveil] = m;
        }
    }

    public void basculeReveil(){
        mode = mode.next(this);
    }

    public void sonOff() { son.off(); }

    public void sonOn() { son.on(); }

    public void miseAJour(HorlogeReveil h) {
        for(int i = 0; i< nombreReveil; i++) {
            if (reveil && h.getHeures() == heureReveil[i] && h.getMinutes() == minuteReveil[i] && h.getSecondes() == 0) {
                son.on();
            }
        }
    }

}
