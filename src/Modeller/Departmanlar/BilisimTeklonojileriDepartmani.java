package Modeller.Departmanlar;

import Modeller.Departmanlar.Departman;

public class BilisimTeklonojileriDepartmani implements Departman {

    final String departmanKodu = "BTD";
    final String departmanAdi = "Bilişim Teknolojileri Departmanı";
    final int zamOrani = 25;

    @Override
    public int getZamOrani() {
        return zamOrani;
    }

    @Override
    public String getDepartmanKodu() {
        return String.valueOf(departmanKodu.compareToIgnoreCase("BTD"));    }

    @Override
    public String getDepartmanAdi() {
        return departmanAdi;
    }
}
