package ru.mirea.task5.Dog;

class Bulldog extends Dog {
    private String pol;
    public Bulldog(String name, String age, String height, String pol)
    {
        super(name, age, height);
        this.pol = pol;
    }
    public String getPol() {return pol;}
    public void displayInfo() {
        System.out.println("Имя собаки: " + super.getName());
        System.out.println("Количество лет: " + super.getAge());
        System.out.println("Пол: " + pol + "и высота в холке: " + super.getHeight());
    }
}
