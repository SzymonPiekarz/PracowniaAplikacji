//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    //zadanie 1
    System.out.println("----Zadanie 1----");
    System.out.println("Podaj liczbe całkowitą dodatnią nieparzystą:");
    int i = sc.nextInt();
    for( int j = 1;j <= i; j = j+2 ){
        System.out.println(j+",");
    }

    //zadanie 2
    System.out.println("----Zadanie 2----");
    System.out.println("Podaj liczbe całkowitą dodatnią parzystą:");
    int a = sc.nextInt();
    for( int j = 1;j <= a; j = j*2 ){
        System.out.println(j+",");
    }

    //zadanie 3
    System.out.println("----Zadanie 3----");
    System.out.println("Program dodaje liczby do momentu podania liczby zero:");
    int suma = 0;
    int liczba;
    do {
        liczba = sc.nextInt();
        suma+=liczba;
    }while (liczba!=0);
    System.out.println(suma);

    //Zadanie 4
    System.out.println("----Zadanie 4----");
    System.out.println("Podaj liczby całkowite:");
    int b  = sc.nextInt();
    int max = b;
    int min = b;
    if(b==0){
        System.out.println("Nie podałeś żadnych liczb");
    }
    do {
        b = sc.nextInt();
        if (b ==0){
            break;
        }
        if (b >max){
            max = b;
        }if(b<min){
            min  = b;
        }
    }while(b!=0);
    int suma1 = min +max;
    double srednia = suma1/2;
    System.out.println("Suma to: "+suma1);
    System.out.println("Średnia to:"+srednia);

    System.out.println("----Zadanie 5----");
    System.out.println("Program zagra z tobą w 'Za dużo, za mało'");
    int random = (int)(Math.random() * 101);
    System.out.println("Zgaduj:");
    int c;
    do {
    c = sc.nextInt();
    if (c> random){
        System.out.println("Za dużo");
        }if (c< random) {
            System.out.println("Za mało");
    }
    }while(c !=random);
    System.out.println("Zgadłeś!!!!");
    System.out.println("----Zadanie 6----");
    System.out.println("Rysowanie prostokąta");
    System.out.println("Podaj znak wypełnienia:");
    char zn = sc.next().charAt(0);
    System.out.println("Podaj x:");
    int x6 = sc.nextInt();
    System.out.println("Podaj y:");
    int y6 = sc.nextInt();
    System.out.println("Podaj długość boku a:");
    int a6 = sc.nextInt();
    System.out.println("Podaj długość boku b:");
    int b6 = sc.nextInt();
    for (int i6 = 1; i6 < y6; i6++) {
        System.out.println();
    }
    for (int j6 = 0; j6 < b6; j6++) {
        for (int k6 = 1; k6 < x6; k6++) {
            System.out.print(" ");
        }
        for (int l6 = 0; l6 < a6; l6++) {
            System.out.print(zn);
        }
        System.out.println();
    }

    System.out.println("----Zadanie 7----");
    System.out.println("Podaj wysokość choinki:");
    int n7 = sc.nextInt();
    for (int i7 = 1; i7 <= n7; i7++) {
        for (int j7 = 1; j7 <= n7 - i7; j7++) {
            System.out.print(" ");
        }
        for (int j7 = 1; j7 <= 2 * i7 - 1; j7++) {
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("----Zadanie 8----");
    System.out.println("Podaj liczbę:");
    int n8 = sc.nextInt();
    int silnia = 1;
    for (int i8 = 1; i8 <= n8; i8++) {
        silnia = silnia * i8;
    }
    System.out.println("Silnia wynosi: " + silnia);
}
