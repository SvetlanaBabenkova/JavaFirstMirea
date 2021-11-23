package ru.mirea.task4.Author;

public class Author {
    String name;
    String email;
    char gender;

    public Author(String n,String e,char male )
    {
        name=n;
        email=e;
        gender=male;
    }

    public String getName() {return name;}

    public String setEmail() {return email;}
    public void setEmail(String email) {this.email=email;}

    public char getGender() {return gender;}

    public String toString()
    {
        return this.name+"(" +this.gender+") "+ "at " +this.email;
    }
}
