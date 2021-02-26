package modul4_pbo;

public class lingkaran extends shape{
    
    double PHI = 3.14;
    double r = 10;
    
    @Override
    public double getLuas(){
        double luas = PHI*r*r;
        System.out.println("Luas lingkaran adalah : "+luas);
        return luas;
    }
    
    @Override
    public double getKeliling(){
        double kel = 2 * PHI * r;
        System.out.println("Keliling lingkaran adalah : "+kel);
        return kel;
    }
}
