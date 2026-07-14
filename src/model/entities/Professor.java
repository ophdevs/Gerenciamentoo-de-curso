package model.entities;

import model.enums.TipoUsuario;

public class Professor extends Usuario {

    public Professor(String name, String user, String password, TipoUsuario tipoUsuario) {
        super(name, user, password, tipoUsuario);
    }

    @Override
    public void exibirMenu() {
        System.out.println("--------AREA DO PROFESSOR--------");
        System.out.println("Selecione a Opcão: ");
        System.out.println("1 - Meus Cursos");
        System.out.println("2 - Criar Tarefa");
        System.out.println("3 - Portal Alunos");
        System.out.println("4 - Avaliar Tarefas");
    }
}
