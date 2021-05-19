package com.example.myapplication.ui.home.homeAdapter;

public class HomeModel {

    private String title, deck;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeck() {
        return deck;
    }

    public void setDeck(String deck) {
        this.deck = deck;
    }

    public HomeModel(String title, String deck) {
        this.title = title;
        this.deck = deck;
    }
}
