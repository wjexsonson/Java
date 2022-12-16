package ru.mirea.task2;

public class Book {
    private boolean isOpen=false;
    private int pages, year;
    private String name, genre, author, publishing_house;
    public Book(){

    }
    public Book(int pages, int year, String name, String genre, String author, String publishing_house){
        this.isOpen=false;
        this.year=year;
        this.pages=pages;
        this.name=name;
        this.genre=genre;
        this.author=author;
        this.publishing_house=publishing_house;
    }
    public void OpenBook(){
        this.isOpen=true;
    }
    public void CloseBook(){
        this.isOpen=false;
    }
    public int BookAge(int current_year){
        return current_year-year;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublishing_house() {
        return publishing_house;
    }
    public void setPublishing_house(String publishing_house) {
        this.publishing_house = publishing_house;
    }
}