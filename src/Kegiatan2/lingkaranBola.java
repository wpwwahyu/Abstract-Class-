package Kegiatan2;

public class lingkaranBola implements bangunRuang, bola{
    double PHI = 3.14;
    double Jari2 = 10;
    
    @Override
    public double getVolume() {
        double r = getJari2();
        double Volume = 4/3 * PHI * r * r * r;
        System.out.println("Volume Bola = "+Volume+" cm kubik");
        return Volume;
    }

    @Override
    public double getLuas() {
        double r = getJari2();
        double Luas = PHI * r * r;
        System.out.println("Luas Bola = "+Luas+" cm persegi");
        return Luas;
    }

    @Override
    public double getJari2() {
       return Jari2;
    }

    @Override
    public void setJari2(double Jari2) {
        this.Jari2 = Jari2;
    }
    }
