package com.example.demo.classes;

public class Coche {
    public String matricula;
    public String marca;
    public int km;

    public Coche(String matricula, String marca, int km) {
        this.matricula = matricula;
        this.marca = marca;
        this.km = km;
    }


    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public int getKm() {
        return km;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", km=" + km +
                '}';
    }
}
