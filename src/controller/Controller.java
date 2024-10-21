package controller;

import models.Person;
import vista.View;

public class Controller {
    private View view;
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;
    
    private Person[] personas;

    // Constructor
    public Controller(View view, SortingMethods sortingMethods, SearchMethods searchMethods) {
        this.view = view;
        this.sortingMethods = sortingMethods;
        this.searchMethods = searchMethods;
        System.out.println("Controller created");
    }
    public void start(){
        int option=0;
        do{
            option=view.showmenu();
            switch(option){
                case 1:
                imputPersonas();
                break;
                case 100:
                
            }
        }
    }
}
