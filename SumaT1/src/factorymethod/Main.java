package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus rehtori = new Rehtori();
        AterioivaOtus oppilas = new Oppilas();
        
        oppilas.aterioi();
        System.out.println();
        opettaja.aterioi();
        System.out.println();
        rehtori.aterioi();
    }
}
