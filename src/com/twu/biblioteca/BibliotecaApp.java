package com.twu.biblioteca;

import com.twu.biblioteca.module.Book;
import com.twu.biblioteca.module.Movie;

import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {
    private List<Book> bookList;
    private List<String> menu;
    private List<Movie> movieList;

    public BibliotecaApp() {
    }
    public BibliotecaApp(List<Book> bookList) {
        this.bookList = bookList;
    }


    public void run(){
        showWelcome("Welcome");
        showMenu();

        boolean flag = false;
        while(!flag) {
            Scanner sc = new Scanner(System.in);
            if (sc.nextLine().equals(String.valueOf(menu.size())))
                flag = true;
            doOption(Integer.valueOf(sc.nextLine()));
        }

    }

    public void showWelcome(String s){
        System.out.println(s);
    }

    public void showBookList(){
        int index = 1;
        for(Book book : bookList){
            if(!book.isCheckout())
                System.out.println((index++) + " " + book.getName() + " " + book.getAuthor() + " " + book.getPublish());
        }
    }

    public void showMenu(){
        int index = 1;
        for(String item : menu){
            System.out.println((index++) + " " + item);
        }
    }

    public void doOption(int n){
        switch (n){
            case 1:
                showBookList();
                break;
            case 2:
                System.out.println("choose a book: ");
                Scanner sc = new Scanner(System.in);
                checkOutBook(Integer.valueOf(sc.nextLine()));
                break;
            case 3:
                System.out.println("choose a book: ");
                Scanner sc2 = new Scanner(System.in);
                returnBook(Integer.valueOf(sc2.nextLine()));
                break;
            case 4:
                listMovies();
                break;
            case 5:
                System.out.println("choose a movie: ");
                Scanner sc3 = new Scanner(System.in);
                checkoutMovie(Integer.valueOf(sc3.nextLine()));
                break;
            case 6:
                System.out.println("bye!");
                break;
            default:
                System.out.println("Select a valid option!");
                break;
        }
    }

    public void checkOutBook(int n){
        if (bookList.get(n-1).isCheckout())
            System.out.println("That book is not available");
        bookList.get(n-1).setCheckout(true);
        System.out.println("Thank you! Enjoy the book");
    }

    public void returnBook(int n){
        if (!bookList.get(n-1).isCheckout())
            System.out.println("That is not a valid book to return");
        bookList.get(n-1).setCheckout(false);
        System.out.println("Thank you for returning the book");
    }

    public void listMovies() {
        int index = 1;
        for (Movie movie : movieList) {
                if(!movie.isCheckout())
                System.out.println((index++) + " " + movie.getName() + " " + movie.getDirector() + " " + movie.getYear() + " " + movie.getRating());

        }
    }

    public void checkoutMovie(int n){
        movieList.get(n-1).setCheckout(true);
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }
}


