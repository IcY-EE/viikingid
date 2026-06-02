package ee.maik.viikingid.service;

import ee.maik.viikingid.entity.ViikingiMang;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManguHaldur {
    private List<ViikingiMang> mangud;
    private int koguskoor;

    public ManguHaldur() {
        this.mangud = new ArrayList<>();
        this.koguskoor = 0;
        laadiMangud();
    }

    // Kusimuste andmebaas koodi sees malupohiselt (In-Memory)
    private void laadiMangud() {
        mangud.add(new ViikingiMang(
                "Kes oli viikingite mutoloogias peajumal, tarkuse ja sojahaldjas?",
                "Tal on ainult uks silm ja kaks ronka.",
                "Odin",
                100
        ));

        mangud.add(new ViikingiMang(
                "Mis nime kandis viikingite kangelaste teispoolsus ehk langenud sodurite saal?",
                "Seda valitseb Odin ja sinna viivad vaimud nimega valkuurid.",
                "Valhalla",
                150
        ));

        mangud.add(new ViikingiMang(
                "Millise nimega kutsuti viikingite kuulsaid pikki ja kiireid sojalaevu?",
                "Selle laeva ninas oli sageli nikerdatud lohepea.",
                "Drakkar",
                200
        ));
    }
    
    public void alustaMangu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("     TERE TULEMAST VIIKINGITE OPIMANGU   ");
        System.out.println("=========================================");
        System.out.println("Vasta kusimustele oigesti, et koguda punkte!");

        for (ViikingiMang mang : mangud) {
            mang.kuvaKusimus();
            System.out.print("Sinu vastus: ");
            String vastus = scanner.nextLine();

            if (mang.kontrolliVastust(vastus)) {
                System.out.println("OIGE! Juurde tekkis " + mang.getPunktiVaartus() + " punkti.");
                koguskoor += mang.getPunktiVaartus();
            } else {
                System.out.println("VALE! Oige vastus oleks olnud: " + mang.getOigeVastus());
            }
            System.out.println("Hetke koondsumma: " + koguskoor + " punkti.");
        }

        System.out.println("\n=========================================");
        System.out.println("MANG ON LABI!");
        System.out.println("Sinu viikingite loppskoor: " + koguskoor + " punkti.");
        System.out.println("=========================================");

        scanner.close();
    }
}