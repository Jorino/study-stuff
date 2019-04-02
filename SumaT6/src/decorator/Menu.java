package decorator;

public class Menu implements MenuIF {
        
        public void printMenu() {
                char select;
                Opiskelijat s = new Opiskelijat();
                Opiskelija o;
                String nimi;
                int ika;
                int indeksi;
                do {

                        System.out.println("\n\t\t\t1. opiskelijan lisääminen.");
                        System.out.println("\t\t\t2. opiskelijan poistaminen.");
                        System.out.println("\t\t\t3. sisältö.");
                        System.out.println("\t\t\t4. lopetus");
                        System.out.print("\n\n"); // tehdään tyhjiä rivejä
                        select = Lue.merkki();
                        switch (select) {
                        case '1':
                            System.out.println("Anna opiskelijan nimi: ");
                            nimi = new String(Lue.rivi());
                            System.out.println("Anna opiskelijan ikä: ");
                            ika = new Integer(Lue.kluku());
                             o = new Opiskelija(nimi,ika);
                            s.addOpiskelija(o);
                            break;
                        case '2':
                        	System.out.println("Anna poistettavan opiskelijan indeksi: ");
                        	indeksi = new Integer(Lue.kluku());
                        	s.removeOpiskelija(indeksi);
                            break;
                        case '3':
                            s.printOpiskelijat();
                            break;
                        case '4':
                            break;
                       
                        }
                }
                while (select != '4');
        }
//printMenu loppuu ----------------------------------------------------------------
}