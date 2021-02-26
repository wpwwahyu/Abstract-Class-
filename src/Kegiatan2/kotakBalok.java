package Kegiatan2;

public class kotakBalok implements bangunRuang {
    
    double p = 10;
    double l = 12;
    double t = 11;
    
    @Override
    public double getVolume(){
        double volume = p*l*t;
        System.out.println("Volume balok adalah : "+volume+"cm");
        return volume;
    }
    
    @Override
    public double getLuas(){
        double luas = p*l;
        System.out.println("Luas kotak adalah : "+luas+"cm");
        return luas;
    }
}
