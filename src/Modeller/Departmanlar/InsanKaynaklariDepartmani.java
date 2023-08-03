package Modeller.Departmanlar;

public class InsanKaynaklariDepartmani implements Departman {

    final String departmanKodu = "IKD";
    final String departmanAdi = "İnsan Kaynakları Departmanı";
    final int zamOrani = 20;

    @Override
    public int getZamOrani() {
        return zamOrani;
    }

    @Override
    public String getDepartmanKodu() {
        return departmanKodu;
    }

    @Override
    public String getDepartmanAdi() {
        return departmanAdi;
    }
}
