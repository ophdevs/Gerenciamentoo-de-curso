package model.entities;

import model.enums.TipoUsuario;

public  abstract class Usuario {
    private String name;
    private String user;
    private String password;
    private Matricula matricula;
    private TipoUsuario tipoUsuario;

    public Usuario(String name, String user, String password, Matricula matricula, TipoUsuario tipoUsuario) {
        this.name = name;
        this.user = user;
        this.password = password;
        this.matricula = matricula;
        this.tipoUsuario = tipoUsuario;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void exibirPerfil(){
    }

    public void exibirMenu(){
    }


}
