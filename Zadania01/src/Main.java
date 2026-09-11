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

}