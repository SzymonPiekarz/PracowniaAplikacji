//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Ania");
    System.out.println("Bartek");
    System.out.println("Kasia");

    String imie = "Szymon";
    int wiek = 2007;
    double liczba= 0.66;

    System.out.println("Mam na imię "+imie+", mam "+(2026 - wiek)+" lat i będę pisać maturę za "+liczba+" roku.");

    System.out.println("Podaj temperature: ");
    Scanner sc = new  Scanner(System.in);
    double temperatura = sc.nextInt();
    double Fahrenheit = 1.8 * temperatura+32;
    System.out.println("Stpnie Celcjusza: "+temperatura+", stopnie Farehita: "+Fahrenheit+".");


    System.out.println("Podaj bok trojkata: ");
    double bok1 = sc.nextInt();
    System.out.println("Podaj drugi bok trojkata: ");
    double bok2 = sc.nextInt();
    System.out.println("Podaj trzeci bok trojkata: ");
    double bok3 = sc.nextInt();
    System.out.println("Obwód podanego trójkąta to: "+(bok1+bok2+bok3)+"");


    System.out.println("Podaj pierwsze słowo: ");
    sc.nextLine();
    String slowo1 = sc.nextLine();
    System.out.println("Podaj drugie słowo: ");
    String slowo2 = sc.nextLine();
    System.out.println("Podaj trzecie słowo: ");
    String slowo3 = sc.nextLine();
    System.out.println("Twoje zdanie:"+slowo3+","+slowo2+","+slowo1+"");


    System.out.println("Podaj słowo: ");
    String slowo100 = sc.nextLine();
    int liczba_znakow = slowo100.length();
    System.out.println("Podane słowo składa się z "+liczba_znakow+" liter");
}