import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rejestracja {


    public static final int ADD_PERSON = 1;
    public static final int PRINT_PERSON=2;
    public static final int FIND_PERSON =3;
    public static final int EXIT = 4;

    private Scanner scanner = new Scanner(System.in);
    private Map<String, Dane> osoby = new HashMap();
    private Opcje opcje = new Opcje();
    private int choose = -1;


    public void run(){

        do{
            opcje();
            choose = scanner.nextInt();
            scanner.nextLine();
            wybor();
        }
        while (choose!=EXIT);
    }




    public void wybor(){
        switch (choose){

            case ADD_PERSON:
                dodajOsobe();
                break;

            case PRINT_PERSON:
                opcje.printPerson();
                break;
            case FIND_PERSON:
                szukajDanychOsoby();
                break;
            case EXIT:
                System.out.println("Żegnaj!");
                break;

        }
    }

    public  void dodajOsobe(){

        System.out.println("Dodaj osobe");
        System.out.println("Podaj imie:");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String lastName=scanner.nextLine();
        System.out.println("Podaj numer pesel");
        long pesel = scanner.nextLong();
        opcje.addPerson(new Dane(name,lastName,pesel));
    }

    public void szukajDanychOsoby(){

        System.out.println("Podaj imie i naziwko osoby aby otrzymac pesel");
        System.out.println("Podaj imie :");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko :");
        String lastName = scanner.nextLine();

        Dane dane = opcje.findPerson(name, lastName);
        System.out.println(dane);

    }



    public static void opcje(){
        System.out.println("Witamy w menu, co chcesz zrobić :");
        System.out.println("1 - Dodaj pacjenta");
        System.out.println("2 - Pokaz pacjentow");
        System.out.println("3 - Szukaj danych osoby wybranej");
        System.out.println("4 - Wyjscie z programu");

    }



}
