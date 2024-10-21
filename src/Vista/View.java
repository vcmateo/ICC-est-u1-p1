package views;

import java.util.Scanner;
import models.Person;

public class View {
    private Scanner scanner;

    // Constructor
    public View() {
        scanner = new Scanner(System.in);
    }

    public int showMenu() {
        System.out.println("Menu");
        System.out.println("1. Ingresar Personas");
        System.out.println("100. Salir");
        System.out.print("Ingrese una opción: ");
        return scanner.nextInt();
    }
    public int inputInt(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    public Person inputPerson() {
        String name = inputName();
        int age = inputAge();
        return new Person(name, age);
    }

    public String inputName() {
        System.out.print("Ingrese nombre: ");
        return scanner.next();
    }

    public int inputAge() {
        System.out.print("Ingrese edad: ");
        return scanner.nextInt();
    }

    public void displayPersons(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
    public void displaySearchResult(Person person) {
        if (person != null) {
            System.out.println("Persona encontrada: " + person);
        } else {
            System.out.println("Persona no encontrada.");
        }
    }
}
