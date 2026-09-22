//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    //zadanie 1
    System.out.println("Podaj liczbe całkowitą dodatnią nieparzystą:");
    int i = sc.nextInt();
    for( int j = 1;j <= i; j = j+2 ){
        System.out.println(j+",");
    }
    //zadanie 2
    System.out.println("Podaj liczbe całkowitą dodatnią parzystą:");
    int a = sc.nextInt();
    for( int j = 1;j <= a; j = j*2 ){
        System.out.println(j+",");
    }
    //zadanie 3
    System.out.println("Program dodaje liczby do momentu podania liczby zero:");
    int suma = 0;
    int liczba;
    do {
        liczba = sc.nextInt();
        suma+=liczba;
    }while (liczba!=0);
    System.out.println(suma);
}

