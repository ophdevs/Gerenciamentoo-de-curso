package application;

import model.entities.Aluno;
import model.entities.Matricula;
import model.entities.Professor;
import model.entities.Usuario;
import model.enums.StatusMatricula;
import model.enums.TipoUsuario;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Usuario user;

        System.out.println("Criar Usuario: ");
        System.out.println("Nome Completo:");
        String nome = sc.nextLine();
        System.out.print("Usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();
        System.out.println("1 - ALUNO \n 2 - PROFESSOR");
        System.out.println("Você é aluno ou professor: ");
        int tipoUser = sc.nextInt();

        if (tipoUser == 1){
            user = new Aluno(nome, usuario, senha, TipoUsuario.ALUNO);
        } else {
            user = new Professor(nome,usuario, senha, TipoUsuario.PROFESSOR);
        }







    }
}
