package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);

    //todo Task 1 - fertig
    public void sayHelloWorld(){
        System.out.println("Hello World!");  // input your solution here
    }

    //todo Task 2 - fertig
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`"); // input your solution here
    }

    // todo Task 3
    public void sumOfLiterals(){
        char buchstabe= 'Z'; //einzelnes unicodezeichen
        int hexadezimal=0xface; //ganzzahlige zahl 4byte=32bit
        int oktal=012;
        long langezahl=80L; //erweiterte integer form it 8 byte=64bit
        float gleitkommazahl1=44e-1f; //gleikommatyp mit Größe 4 byte
        float kommazahl1=5.5f; //gleikommatyp mit Größe 4 byte
        double gleitkommazahl2=8.88e1; //gleikommatyp mit Größe 8 byte
        double kommazahl2=99.9; //gleitkommatyp mit Größe 8 byte
        //  double sum1, sum2;
        int sum; // integer 4byte

        /*
         sum2=buchstabe+hexadezimal+oktal+langezahl+gleitkommazahl1+kommazahl1+gleitkommazahl2+kommazahl2;
        System.out.println("eingabe: ");
        System.out.println(buchstabe);
        System.out.println(hexadezimal);
        System.out.println(oktal);
        System.out.println(langezahl);
        System.out.println(gleitkommazahl1);
        System.out.println(kommazahl1);
        System.out.println(gleitkommazahl2);
        System.out.println(kommazahl2);
        System.out.println(sum2);
        System.out.println();     */

       // int intBuchstabe = (int)buchstabe;
        int intLangezahl = (int)langezahl;
        int intGleitkommazahl1 = (int) gleitkommazahl1;
        int intKommazahl1=(int)kommazahl1;
        int intGleitkommazahl2=(int)gleitkommazahl2;
        int intKommazahl2=(int)kommazahl2;
        // sum1=intBuchstabe+hexadezimal+oktal+intLangezahl+intGleitkommazahl1+intKommazahl1+intGleitkommazahl2+intKommazahl2;
        sum=buchstabe+hexadezimal+oktal+intLangezahl+intGleitkommazahl1+intKommazahl1+intGleitkommazahl2+intKommazahl2;


     /*   System.out.println("ausgabe");
        System.out.println(intBuchstabe);
        System.out.println(hexadezimal);
        System.out.println(oktal);
        System.out.println(intLangezahl);
        System.out.println(intGleitkommazahl1);
        System.out.println(intKommazahl1);
        System.out.println(intGleitkommazahl2);
        System.out.println(intKommazahl2);
        System.out.println(sum1);
        System.out.println();*/

        System.out.println(sum);
    }

    //todo Task 4 - fertig
    public void addTwoNumbers() {
        // Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
    }

    //todo Task 5 - fertig
    public void swapTwoNumbers(){
        System.out.println("Before Swap:");
        System.out.print("x: ");
        //  Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();

        x=x+y;
        y=-y+x;
        x=x-y;

        System.out.println("After Swap:");
        System.out.println("x: "+x);
        System.out.println("y: "+y);

        /*System.out.println("Before Swap:");
        System.out.print("x: ");
     //   Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        System.out.print("y: ");
        int x = scanner.nextInt();
        System.out.println("After Swap:");
        System.out.println("x: "+x);
        System.out.println("y: "+y);*/
    }

    //todo Task 6 - fertig
    public void compareTwoNumbers(){
        System.out.print("n1: ");
        //  Scanner scanner= new Scanner(System.in);
        int n1=scanner.nextInt();
        System.out.print("n2: ");
        int n2=scanner.nextInt();

        if(n1==n2) {
            System.out.println("n1 == n2");
        }else if(n1>n2){
            System.out.println("n1 > n2");
        }else {
            System.out.println("n2 > n1");
        }
    }

    //todo Task 7 - fertig
    public void ratingSalesPerson(){
        System.out.print("Enter annual Revenue: ");
        //  Scanner scanner= new Scanner(System.in);
        int annual=scanner.nextInt();

   /* while (annual < 0 || annual > 100000) {
            System.out.println("Invalid Revenue");
            System.out.print("");
            System.out.print("Enter annual Revenue: ");
            annual = scanner.nextInt();}*/

        /*if (annual<0||annual>100000) {
            System.out.println("Invalid Revenue");
        } */

        if(annual>=0 && annual < 20000){
            System.out.println("Poor Sales Revenue");
        }else if(annual >=20000 && annual <50000){
            System.out.println("Average Sales Revenue");
        }else if(annual >=50000 && annual <80000){
            System.out.println("Good Sales Revenue");
        }else if(annual >= 80000 && annual < 100000){
            System.out.println("Excellent Sales Revenue");
        }else{
            System.out.println("Invalid Revenue");
        }
    }

    //todo Task 8 - fertig
    public void getCommissionRate(){

        System.out.print("Enter CommissionClass: ");
        //  Scanner scanner= new Scanner(System.in);
        int commissionClass=scanner.nextInt();

        switch(commissionClass) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9 - fertig
    public void leapyear(){
        System.out.print("Year: ");
        //  Scanner scanner= new Scanner(System.in);
        int year=scanner.nextInt();

        if(year%4==0&&(year%100>0)||(year%400==0)){
            System.out.println("Leapyear");
        }else{
            System.out.println("Not a Leapyear");
        }
    }



    //todo Task 10
    public void transposedNumbers(){
        System.out.print("Number: ");
        int dreistellig= scanner.nextInt();

        if(dreistellig>=1000){
            return;
        }

        int hunderter=dreistellig/100;
        int einser=dreistellig%10;
        int zehner=dreistellig%100/10;

        System.out.print(einser);
        System.out.print(zehner);
        System.out.println(hunderter);
        //  System.out.println(hunderter);
        //  System.out.println(zehner);
        //  System.out.println(einser);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();//fertig

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();//fertig

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();//fertig

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();//fertig

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();//fertig

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();//fertig

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();//fertig

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();//fertig

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}