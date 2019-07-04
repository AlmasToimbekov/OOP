package main.java.iterator;

public class MenuItem {
    String name;
    String description;
    boolean vegeratian;
    double price;

    public MenuItem(String name,
                    String description,
                    boolean vegeratian,
                    double price)
    {
        this.name = name;
        this.description = description;
        this.vegeratian = vegeratian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegeratian() {
        return vegeratian;
    }

    public double getPrice() {
        return price;
    }
}
