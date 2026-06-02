package ee.maik.viikingid.entity;

public class ViikingiMang {
    private String kusimus;
    private String vihje;
    private String oigeVastus;
    private int punktiVaartus;

    public ViikingiMang(String kusimus, String vihje, String oigeVastus, int punktiVaartus) {
        this.kusimus = kusimus;
        this.vihje = vihje;
        this.oigeVastus = oigeVastus;
        this.punktiVaartus = punktiVaartus;
    }

    public void kuvaKusimus() {
        System.out.println("\n--- VIIKINGITE KUSIMUS ---");
        System.out.println(kusimus);
        System.out.println("Vihje: " + vihje);
    }

    public boolean kontrolliVastust(String mangijaVastus) {
        if (mangijaVastus == null) return false;
        return oigeVastus.equalsIgnoreCase(mangijaVastus.trim());
    }

    public int getPunktiVaartus() {
        return punktiVaartus;
    }

    public String getOigeVastus() {
        return oigeVastus;
    }
}