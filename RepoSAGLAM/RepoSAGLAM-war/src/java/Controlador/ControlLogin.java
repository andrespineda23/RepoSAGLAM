/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AdministrarInterface.AdministrarLoginInterface;
import Entidades.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author ANDRES PINEDA
 */
@Named(value = "controlLogin")
@ManagedBean
@SessionScoped
public class ControlLogin implements Serializable {

    @EJB
    AdministrarLoginInterface administrarLogin;

    private Usuario nuevoUsuarioRegistrar;
    private Usuario usuarioLogin;

    public ControlLogin() {

        nuevoUsuarioRegistrar = new Usuario();
        usuarioLogin = null;
    }
    
    
    public void dispararDialogoNuevoUsuario(){
        System.out.println("Fucking !");
    }

    public Usuario getNuevoUsuarioRegistrar() {
        return nuevoUsuarioRegistrar;
    }

    public void setNuevoUsuarioRegistrar(Usuario nuevoUsuarioRegistrar) {
        this.nuevoUsuarioRegistrar = nuevoUsuarioRegistrar;
    }

    public Usuario getUsuarioLogin() {
        return usuarioLogin;
    }

    public void setUsuarioLogin(Usuario usuarioLogin) {
        this.usuarioLogin = usuarioLogin;
    }

}
