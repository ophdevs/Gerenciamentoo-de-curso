package model.entities;

import model.enums.StatusMatricula;
import model.enums.TipoUsuario;

public class Aluno extends Usuario{

    public Aluno(String name, String user, String password, TipoUsuario tipoUsuario) {
        super(name, user, password,tipoUsuario);
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
