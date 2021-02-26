package Kegiatan2;

public class persegiKubus implements bangunRuang{
    
    double sisi = 5;
    
    @Override
    public double getVolume() {
        double volume = sisi*sisi*sisi;
        System.out.println("Volume kubus adalah : "+volume+"cm");
        return volume;
    }

    @Override
    public double getLuas() {
        double luas = sisi*sisi;
        System.out.println("Luas persegi adalah : "+luas+"cm");
        return luas;
    }
}
