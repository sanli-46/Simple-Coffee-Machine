package Modeller.Departmanlar;

public class YonetimDepartmani implements Departman {

    final String departmanKodu = "YD";
    final String departmanAdi = "Yönetim Departmanı";
    final int zamOrani = 0;

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
