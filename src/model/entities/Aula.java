package model.entities;

import model.Avaliavel;

public class Aula implements Avaliavel {
    private String name;

    @Override
    public double avaliação() {
        return 0;
    }
}
