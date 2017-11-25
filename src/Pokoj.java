public class Pokoj {

    public static void main(String[] args) {

//        Monitor monitor1 = new Monitor();
//
//        monitor1.manufacturer = "LG";
//        monitor1.size = 23;
//        monitor1.proportions = "16:9";
//        monitor1.price = 499.99;
//
//        Monitor monitor2 = new Monitor();
//
//        monitor2.manufacturer = "BENQ";
//        monitor2.size = 17;
//        monitor2.proportions = "4:3";
//        monitor2.price = 100;

        Monitor monitor1 = new Monitor("LG",23,"16:9",499.99);
        Monitor monitor2 = new Monitor("BENQ",17,"4:3",100);


        System.out.printf("Producent: %s Rozmiar: %d Proporcje: %s Cena: %.2f \n", monitor1.manufacturer, monitor1.size, monitor1.proportions, monitor1.price);
        System.out.printf("Producent: %s Rozmiar: %d Proporcje: %s Cena: %.2f \n", monitor2.manufacturer, monitor2.size, monitor2.proportions, monitor2.price);

    }
}
