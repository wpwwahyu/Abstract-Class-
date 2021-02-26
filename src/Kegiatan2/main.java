package Kegiatan2;

public class main {
    public static void main(String[] args) {
        bangunRuang br = new persegiKubus();
        System.out.println("Kubus : ");
        br.getLuas();
        br.getVolume();
        
        bangunRuang ba = new kotakBalok();
        System.out.println("Balok : ");
        ba.getLuas();
        ba.getVolume();
        
        bangunRuang bo = new lingkaranBola();
        System.out.println("Bola : ");
        bo.getLuas();
        bo.getVolume();
        
        bola bi = new lingkaranBola();
        System.out.println("Jari-Jari : ");
        bi.setJari2(11.0);
        System.out.println(bi.getJari2());
    }
}
