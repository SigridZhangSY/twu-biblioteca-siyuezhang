package com.twu.biblioteca.module;

public class Book {
    private String name;
    private String author;
    private String publish;
    private User user;

    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
    }

    private boolean checkout;

    public Book(String name) {
        this.name = name;
        this.checkout = false;
    }

    public Book(String name, String author, String publish) {
        this.name = name;
        this.author = author;
        this.publish = publish;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublish() {
        return publish;
    }

    public boolean isCheckout() {
        return checkout;
    }

    public void checkoutTo(User user) {
        this.user = user;
    }
}
