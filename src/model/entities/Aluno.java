package model.entities;

import model.enums.StatusMatricula;
import model.enums.TipoUsuario;

import java.sql.SQLOutput;

public class Aluno extends Usuario{
    private StatusMatricula statusMatricula;

    public Aluno(String name, String user, String password, Matricula matricula, TipoUsuario tipoUsuario) {
        super(name, user, password, matricula, tipoUsuario);
    }

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
