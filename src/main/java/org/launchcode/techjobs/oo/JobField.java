package org.launchcode.techjobs.oo;

public abstract class JobField {

    // Fields
    private int id;
    private static int nextId = 1;
    private String value;

    // Constructors

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    // toString override

    @Override
    public String toString() {
        return value;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
