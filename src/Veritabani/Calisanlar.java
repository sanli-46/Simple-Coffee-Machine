package Veritabani;

import Modeller.Calisanlar.Calisan;

import java.util.ArrayList;

public class Calisanlar {
    private static ArrayList<Calisan> calisanList = new ArrayList<>();

    public static ArrayList<Calisan> getCalisanList() {
        return calisanList;
    }

    public static void addACalisan(Calisan calisan) {
        calisanList.add(calisan);
    }

    public static void deleteACalisanWithId(String calisanId) {
        Calisan calisan = getCalisanById(calisanId);
        if (calisan != null) {
            calisanList.remove(calisan);
            System.out.println("Çalışan başarıyla silindi.");
        } else {
            System.out.println("Geçersiz çalışan ID'si.");
        }
    }

    public static void printDepartmandakiCalisanlar(String departmanKodu) {
        for (Calisan calisan : calisanList) {
            if (calisan.getDepartman().getDepartmanKodu().equals(departmanKodu)) {
                System.out.println(calisan.toString());
            }
        }
    }

    public static void printCalisanlar() {
        for (Calisan calisan : calisanList) {
            System.out.println(calisan.toString());
        }
    }

    public static int getCalisanSayisi() {
        return calisanList.size();
    }

    public static Calisan getCalisanById(String calisanId) {
        for (Calisan calisan : calisanList) {
            if (calisan.getCalisanId().equals(calisanId)) {
                return calisan;
            }
        }
        return null;
    }
}





