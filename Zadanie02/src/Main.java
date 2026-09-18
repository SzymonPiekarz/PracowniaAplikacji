//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Podaj liczbę: ");
    int liczba1 = sc.nextInt();
    if (liczba1 % 3 ==0){
        System.out.println("Liczba "+liczba1+" jest podzielna przez 3");
    }else {
        System.out.println("Liczba "+liczba1+" nie jest podziela przez 3");
    }
    System.out.println("Podaj drógą liczbę: ");
    int liczba2 = sc.nextInt();
    if (liczba2 % 3 ==0){
        System.out.println("Liczba "+liczba2+" jest podzielna przez 3");
    }else {
        System.out.println("Liczba "+liczba2+" nie jest podziela przez 3");
    }
    System.out.println("Podaj trzecią liczbę: ");
    int liczba3 = sc.nextInt();
    if (liczba3 % 3 ==0){
        System.out.println("Liczba "+liczba3+" jest podzielna przez 3");
    }else {
        System.out.println("Liczba "+liczba3+" nie jest podziela przez 3");
    }
}
