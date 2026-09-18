
import java.util.ArrayList;


class Produkt {
    protected String nazwa;
    protected double cenaBazowa;

    public Produkt(String nazwa, double cenaBazowa){
        this.nazwa = nazwa;
        this.cenaBazowa = cenaBazowa;
    }

    public void wyswietlInformacje(){
        System.out.println("Produkt: " + nazwa + " Cena: " + cenaBazowa);
    }
}

class Elektronika extends Produkt {
    private String model;
    private int gwarancjaWMiesiacach;

    public Elektronika(String nazwa, double cenaBazowa, String model, int gwarancjaWMiesiacach){
        super(nazwa, cenaBazowa);
        this.gwarancjaWMiesiacach = gwarancjaWMiesiacach;
        this.model = model;
    }

    @Override
    public void wyswietlInformacje(){
        super.wyswietlInformacje();
        System.out.println("Model: " + model + " Gwarancja: " + gwarancjaWMiesiacach);
    }
}

class Odziez extends Produkt {
    private String marka;
    private String rozmiar;

    public Odziez(String nazwa, double cenaBazowa, String marka, String rozmiar){
        super(nazwa, cenaBazowa);
        this.marka = marka;
        this.rozmiar = rozmiar;
    }

    @Override
    public void wyswietlInformacje(){
        super.wyswietlInformacje();
        System.out.println("Marka: " + marka + " Rozmiar: " + rozmiar);
    }
}

public class pracadomowa {
    public static void main(String[] args) {
        Elektronika telefon = new Elektronika(
            "Telefon",
            3500.00,
            "Iphone",
            24
        );
        Odziez koszulka = new Odziez(
            "Koszulka",
            150.00,
            "Adidas",
            "M"
        );
        Odziez spodnie = new Odziez(
            "Spodnie",
            75.00,
            "Nike",
            "L"
        );

        ArrayList<Produkt> koszyk = new ArrayList<Produkt>();

        koszyk.add(telefon);
        koszyk.add(koszulka);
        koszyk.add(spodnie);

        for (Produkt produkt : koszyk) {
            produkt.wyswietlInformacje();
        }
    }
}