package model.entities;

import java.sql.SQLOutput;

public class Aluno extends Usuario{


    @Override
    public void exibirPerfil(){
        System.out.println("hello");
    }

    public void exibirMenu(){
        System.out.println("--------AREA DO ALUNO--------");
        System.out.println("Selecione a Opcão: ");
        System.out.println("1 - Meus Cursos");
        System.out.println("2 - Tarefas Pendente");
        System.out.println("3 - Portal Professores");
    }
}
