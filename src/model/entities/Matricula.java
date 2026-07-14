package model.entities;

import model.enums.StatusMatricula;

import java.time.LocalDate;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private LocalDate dataInicio;
    private LocalDate dataVencimento;
    private StatusMatricula statusMatricula;
    private Certificado certificado;



}
