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
    
}

