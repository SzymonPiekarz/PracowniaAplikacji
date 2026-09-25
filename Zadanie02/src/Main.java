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

    System.out.print("Podaj rok: ");
    int rok = sc.nextInt();
    if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
        System.out.println("Podany rok jest przestepny");
    } else {
        System.out.println("Podany rok nie jest przestepny");
    }

    System.out.print("Podaj swoja wage w kg: ");
    double waga = sc.nextDouble();
    System.out.print("Podaj swoj wzrost w metrach: ");
    double wzrost = sc.nextDouble();
    double bmi = waga / (wzrost * wzrost);
    System.out.println("Twoje BMI wynosi: " + bmi);
    if (bmi < 18.5) {
        System.out.println("Niedowaga");
    } else if (bmi <= 24.9) {
        System.out.println("Waga prawidlowa");
    } else {
        System.out.println("Nadwaga");
    }

    double cena;
    int raty;
    while (true) {
        System.out.print("Podaj cene towaru (100 - 10000 zl): ");
        cena = sc.nextDouble();

        if (cena >= 100 && cena <= 10000) {
            break;
        }
        System.out.println("Bledna cena! Podaj ponownie.");
    }
    while (true) {
        System.out.print("Podaj liczbe rat (6 - 48): ");
        raty = sc.nextInt();
        if (raty >= 6 && raty <= 48) {
            break;
        }
        System.out.println("Bledna liczba rat! Podaj ponownie.");
    }
    double oprocentowanie;
    if (raty >= 6 && raty <= 12) {
        oprocentowanie = 0.025;
    } else if (raty >= 13 && raty <= 24) {
        oprocentowanie = 0.05;
    } else {
        oprocentowanie = 0.10;
    }
    double kwotaZOdsetkami = cena + (cena * oprocentowanie);
    double rata = kwotaZOdsetkami / raty;
    System.out.println("Miesieczna rata wynosi: " + rata + " zl");


    System.out.println("Prosty kalkulator");
    System.out.print("Podaj pierwsza liczbe: ");
    double liczba11 = sc.nextDouble();
    System.out.print("Podaj symbol operacji (+, -, *, /): ");
    char operacja = sc.next().charAt(0);
    System.out.print("Podaj druga liczbe: ");
    double liczba22 = sc.nextDouble();
    switch (operacja) {
        case '+':
            System.out.println("Wynik: " + (liczba1 + liczba2));
            break;
        case '-':
            System.out.println("Wynik: " + (liczba1 - liczba2));
            break;
        case '*':
            System.out.println("Wynik: " + (liczba1 * liczba2));
            break;
        case '/':
            if (liczba2 == 0) {
                System.out.println("Nie mozna dzielic przez zero");
            } else {
                System.out.println("Wynik: " + (liczba1 / liczba2));
            }
            break;
        default:
            System.out.println("Bledny symbol operacji");
    }
}
