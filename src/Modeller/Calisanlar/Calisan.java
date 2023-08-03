package Modeller.Calisanlar;

import Modeller.Departmanlar.Departman;
import Veritabani.Calisanlar;
import Veritabani.Departmanlar;

public class Calisan {

    private String calisanId;
    private String adSoyad;
    private int maas;
    private Departman departman;
    private String isimKodu = "";

    public Calisan(String adSoyad, int maas, String departmanKodu) {
        this.adSoyad = adSoyad;
        this.maas = maas;
        setDepartman(departmanKodu);
        this.setCalisanId();
        Calisanlar.addACalisan(this);
    }

    private void setDepartman(String departmanKodu) {
        Departman departman = Departmanlar.getByKod(departmanKodu);
        if (departman != null) {
            this.departman = departman;
        } else {
            System.out.println("Geçersiz departman kodu.");
        }
    }


    private void setCalisanId() {
        String departmanKodu = departman.getDepartmanKodu();
        int calisanSayisi = Calisanlar.getCalisanSayisi();
        String isimKodu = getCalisanIsimKodu();
        this.calisanId = departmanKodu + (calisanSayisi + 1) + isimKodu;
    }

    private String getCalisanIsimKodu() {
        String[] isimSoyad = adSoyad.split(" ");
        String isimKodu = "";
        for (String isim : isimSoyad) {
            isimKodu += isim.charAt(0);
        }
        return isimKodu;
    }

    public String getCalisanId() {
        return this.calisanId;
    }

    public Departman getDepartman() {
        return this.departman;
    }

    public String getDepartmanAdi() {
        if (departman.getDepartmanKodu().equals("YD")) {
            return "Yönetim Departmanı";
        }
        return departman.getDepartmanAdi();
    }

    public static void zamYap(String calisanId) {
        Calisan calisan = Calisanlar.getCalisanById(calisanId);
        if (calisan != null) {
            double zamOrani = calisan.getDepartman().getZamOrani();
            double zamMiktari = calisan.getMaas() * zamOrani / 100;
            calisan.setMaas((int) (calisan.getMaas() + zamMiktari));
            System.out.println("Çalışana zam yapıldı. Yeni maaş: " + calisan.getMaas());
        } else {
            System.out.println("Geçersiz çalışan ID'si.");
        }
    }

    public int getMaas() {
        return this.maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        return "Çalışan ID: '" + calisanId + "', İsim Soyisim: '" + adSoyad + "', Maaş: '" + maas +
                "', Departman: '" + getDepartmanAdi() + "'";
    }
}

