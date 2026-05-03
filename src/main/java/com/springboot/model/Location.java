package com.springboot.model;
import java.util.Objects;

public class Location {
    private int x;
    private int y;
    private String Name;


    public Location(int x, int y, String Name) {
        this.x = x;
        this.y = y;
        this.Name = Name;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Location x(int x) {
        setX(x);
        return this;
    }

    public Location y(int y) {
        setY(y);
        return this;
    }

    public Location Name(String Name) {
        setName(Name);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Location)) {
            return false;
        }
        Location location = (Location) o;
        return x == location.x && y == location.y && Objects.equals(Name, location.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, Name);
    }

    @Override
    public String toString() {
        return "{" +
            " x='" + getX() + "'" +
            ", y='" + getY() + "'" +
            ", Name='" + getName() + "'" +
            "}";
    }
}
