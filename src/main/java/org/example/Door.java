package org.example;

public class Door {
    public Boolean open;

    public Door(Boolean open) {
        this.open = open;
    }

    public void open() {
        open = true;

    }

    public void close() {
        open = false;

    }
}