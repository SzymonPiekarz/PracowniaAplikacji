//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//    boolean warunek = true;

//    System.out.println(warunek);
//
//    if (!warunek){
//        System.out.println("Warunek prawdziwy");
//    } else {
//        System.out.println("Warunek nieprawdziwy");
//    }
//    int liczba1 = 5;
//    int liczba2 = 10;
//
//    if (liczba2> liczba1){
//        System.out.println(liczba2+" jest większa niż "+liczba1);
//    } else if (liczba1 == liczba2) {
//        System.out.println("Licby są równe");
//    } else {
//        System.out.println(liczba1+" jest większa niż "+liczba2);
//    }
//
//    if (liczba1 != liczba2){
//        System.out.println("Liczby są równe");
//    }
//
//
//
//    String napis1 = "napis";
//    String napis2 = "napis";
//
//    if (napis1.equals(napis2)){
//        System.out.println("Napisy są takie same");
//    }
//
//    Scanner sc = new Scanner(System.in);
//
//    System.out.println("Podaj liczbę: ");
//    int liczba = sc.nextInt();
//
//
//    switch (liczba){
//        case 0:
//            System.out.println("");
//        }
//}
//    boolean wyrazenie1 = true && true;
//    boolean wyrazenie2 = true || false;
//    System.out.println(wyrazenie1);
//
//    String login, haslo;
//    login = "user";
//    haslo = "psswd";
//
//    String loginpodany, haslopodane;
//    Scanner sc = new Scanner(System.in);
//
//    System.out.println("Podaj login:");
//    loginpodany = sc.nextLine();
//    System.out.println("Podaj hasło:");
//    haslopodane = sc.nextLine():
//
//    if (haslopodane.equals(haslo) && loginpodany.equals(login)){
//        System.out.println("Zalogowałeś się!!!");
//    } else if (!haslopodane.equals(haslo) && loginpodany.equals(login)) {
//        System.out.println("Złe haslo!");
//    } else {

    String poraroku = "lato";
    String tłumaczenie = switch (poraroku){
        case "wiosna":
            yield "spring";
        case "lato":
            yield "summer";
        case "jesień":
            yield "autumn";
        case "zima":
            yield "winter";
        default:
            yield "Słowo nieznane";
    };
    System.out.println(tłumaczenie);

    String temperatura  = switch (poraroku) {
        case "Wiosna", "lato" -> "ciepło";
        case "jesień", "zima" -> "zimno";
        default -> "wartość nieznana";
    };
    System.out.println(temperatura);
    int liczba = 10;
    String wynik = (liczba >0) ? "Dodatnia" : "Ujemna lub zero";
    System.out.println(wynik);
}