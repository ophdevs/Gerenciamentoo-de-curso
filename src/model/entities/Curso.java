package model.entities;

import model.Avaliavel;

import java.util.ArrayList;

public class Curso implements Avaliavel {
    private String name;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Aula> aulas = new ArrayList<>();


}
