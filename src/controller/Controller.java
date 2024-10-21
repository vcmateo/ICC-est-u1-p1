package Controller;
import Models.Persona;
import Views.View;

public class Controller {
    private View view;
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;

    private Persona[] personas;

    public Controller(View view, SortingMethods sortingMethods, SearchMethods searchMethods) {
        this.view = view;
        this.searchMethods = searchMethods;
        this.sortingMethods = sortingMethods;

        System.out.println("Controller created");
    }

    public void start() {
        int option = 0;
        do {
            option = view.showMenu();  
            switch (option) {
                case 1:
                    inputPersona();  
                    break;
                case 100: 
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (option != 0);
    }

    public void inputPersona() {
        int numeroPersona = view.inputInt("Ingrese el número de personas");
        personas = new Persona[numeroPersona];  
        for (int i = 0; i < numeroPersona; i++) {
            personas[i] = view.inputPersona();  
        }
    }
}