package models;

import vista.View;
import controller.Controller;
import controller.SearchMethods;
import controller.SortingMethods;

public class App {
    public static void main(String[] args) throws Exception {
        // Instanciar las clases necesarias
        View view = new View();
        SortingMethods sortingMethods = new SortingMethods();
        SearchMethods searchMethods = new SearchMethods();

        // Crear el objeto Controller de manera correcta
        Controller controller = new Controller(view, sortingMethods, searchMethods);

        // Debe imprimir "Controller created" si todo está correcto
    }
}
