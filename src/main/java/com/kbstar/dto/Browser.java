package com.kbstar.dto;

public class Browser {
    private String name;
    private Double y;

    public Browser() {
    }

    public Browser(String name, Double y) {
        this.name = name;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }
}
