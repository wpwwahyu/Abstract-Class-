package modul4_pbo;

public class persegi extends shape{
    
    double sisi = 10;
    
    @Override
    public double getLuas(){
        double luas = sisi * sisi;
        System.out.println("Luas Persegi adalah : "+luas);
        return luas;
    }
    
    @Override
    public double getKeliling(){
        double kel= 4*sisi;
        System.out.println("Keliling Persgi adalah : "+kel);
        return kel;
    }
}
