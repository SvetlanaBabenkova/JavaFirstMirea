package ru.mirea.task5.Dog;

class Shepherd extends Dog  {
    private String ushi;
    public Shepherd(String name, String age, String height, String ushi)
    {
        super(name, age, height);
        this.ushi = ushi;
    }
    public String getUshi() {return ushi;}
    public void displayInfo() {
        System.out.println("Имя собаки: " + super.getName());
        System.out.println("Количество лет: " + super.getAge());
        System.out.println("Количество ушей: " + ushi + " и высота в холке: " + super.getHeight());
    }
}
