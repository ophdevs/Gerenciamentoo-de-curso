package model.entities;

import model.enums.TipoUsuario;

public  abstract class Usuario {
    private String name;
    private String user;
    private String password;
    private TipoUsuario tipoUsuario;

    public Usuario(String name, String user, String password, TipoUsuario tipoUsuario) {
        this.name = name;
        this.user = user;
        this.password = password;
        this.tipoUsuario = tipoUsuario;
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
