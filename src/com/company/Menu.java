package com.company;

import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);

    public Menu() {
        System.out.println("Hello welcome to BookBook!\nHere you will be able to organize your books!");
        mainMenu();

    }

    public void mainMenu() {
        System.out.println("What would you like to do today?\n" +
                "(1)View the list by book, author, or publisher\n" +
                "(2)Add a new book, author, or publisher\n" +
                "(3)Change an existing book, author, or publisher\n" +
                "(4)Remove a book, author, or publisher");
        int optionSelect = scan.nextInt();
        System.out.println(optionSelect);
        switch (optionSelect) {
            case 1:
                System.out.println("You selected case 1");

                break;
            case 2:
                System.out.println("You selected case 2");

                break;
            case 3:
                determineSearch();
                break;
            case 4:
                System.out.println("You selected case 4");
                break;
            default:
                System.out.println("Please enter valid option");
                mainMenu();
        }
    }
    public void selectType(){
        System.out.println("What would you like to select?\n" +
                "(1)Book\n" +
                "(2)Author\n" +
                "(3)Publisher");
    }

    public void determineSearch() {
        System.out.println("How would you like to search?\n" +
                "(1)By Name\n" +
                "(2)By ID");
        int option = scan.nextInt();
        switch (option) {
            case 1:
                System.out.println("Searching by name. Please enter name");
                scan.nextLine(); // clean up
                String name = scan.nextLine();
                searchItem(name);
                break;
            case 2:
                System.out.println("Searching by ID. Please enter ID");
                int id = scan.nextInt();
                searchItem(id);
                break;
            default:
                System.out.println("Please enter valid option");
                determineSearch();
        }
    }

    public void searchItem(String name) {

        System.out.println("You are searching " + name);

    }

    public void searchItem(int Id) {
        System.out.println("You are searching by Id");
    }


}
