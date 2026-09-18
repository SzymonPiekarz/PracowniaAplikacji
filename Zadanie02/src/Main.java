//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Podaj liczbę: ");
    int liczba1 = sc.nextInt();
    if (liczba1 % 3 == 0) {
        System.out.println("Liczba " + liczba1 + " jest podzielna przez 3");
    } else {
        System.out.println("Liczba " + liczba1 + " nie jest podziela przez 3");
    }
    System.out.println("Podaj drógą liczbę: ");
    int liczba2 = sc.nextInt();
    if (liczba2 % 3 == 0) {
        System.out.println("Liczba " + liczba2 + " jest podzielna przez 3");
    } else {
        System.out.println("Liczba " + liczba2 + " nie jest podziela przez 3");
    }
    System.out.println("Podaj trzecią liczbę: ");
    int liczba3 = sc.nextInt();
    if (liczba3 % 3 == 0) {
        System.out.println("Liczba " + liczba3 + " jest podzielna przez 3");
    } else {
        System.out.println("Liczba " + liczba3 + " nie jest podziela przez 3");
    }
    System.out.println("Podaj bok trójkąta:");
    int bok1 = sc.nextInt();
    System.out.println("Podaj drugi bok trójkąta:");
    int bok2 = sc.nextInt();
    System.out.println("Podaj trzeci bok trójkąta:");
    int bok3 = sc.nextInt();
    if (bok1 + bok2 > bok3) {
        if (bok1 + bok3 > bok2) {
            if (bok2 + bok3 > bok1) {
                System.out.println("Z podanych bloków można zbudować trójkąta");
            } else {
                System.out.println("Z podanych bloków nie można zbudować trójkąta");
            }
        }
    }
    System.out.println("Program wypisuje większą liczbe z dwóch podanych");
    System.out.println("Podaj pierwszą liczbe: ");
    int podaj1 = sc.nextInt();
    System.out.println("Ppdja drugą liczbe: ");
    int podaj2 = sc.nextInt();
    if (podaj1 > podaj2) {
        System.out.println("Liczba " + podaj1 + " jest większa");
    } else {
        System.out.println("Liczba " + podaj2 + " jest większa");
    }
    System.out.println("Program wypisuje największą liczbe z trzech podanych");
    System.out.println("Podaj pierwszą liczbe: ");
    int podaj3 = sc.nextInt();
    System.out.println("Podaj drugą liczbe: ");
    int podaj4 = sc.nextInt();
    System.out.println("Podaj trzecią liczbe: ");
    int podaj5 = sc.nextInt();
    if (podaj3 > podaj4 && podaj3 > podaj5) {
        System.out.println("Liczba " + podaj3 + " jest większa");
    } else if (podaj4 > podaj3 && podaj4 > podaj5) {
        System.out.println("Liczba " + podaj4 + " jest większa");
    } else {
        System.out.println("Liczba " + podaj5 + " jest większa");
    }
    System.out.println("Program o miesiącach");
    System.out.println("Podaj liczbe");
    int miesiace = sc.nextInt();
    String nazwa = switch (miesiace) {
        case 1 -> "Styczen";
        case 2 -> "Luty";
        case 3 -> "Marzec";
        case 4 -> "Kwiecien";
        case 5 -> "Maj";
        case 6 -> "Czerwiec";
        case 7 -> "Lipiec";
        case 8 -> "Sierpien";
        case 9 -> "Wrzesien";
        case 10 -> "Pazdziernik";
        case 11 -> "Listopad";
        case 12 -> "Grudzien";
        default -> "Nieprawidlowy numer miesiaca";
    };
    System.out.println(nazwa);


    System.out.print("Podaj imie: ");
    String imie1 = sc.next();
    String imie = "Szymon";
    if (imie.equalsIgnoreCase(imie)) {
        System.out.println("Mamy takie samo imie yay!!!!");
    } else {
        System.out.println("Nie mamy takiego samego imienia :(");
    }

    System.out.print("Podaj swoj wiek: ");
    int wiek = sc.nextInt();
    boolean pelnoletni = wiek >= 18 ? true : false;
    System.out.println("Czy jestes pelnoletni? " + pelnoletni);
}
