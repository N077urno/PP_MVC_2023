/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_mvc_2023;

/**
 *
 * @author nando
 */

//Classe Controler
public class UsuarioController {
    private Usuario model;
    private UsuarioView view;
    
    public UsuarioController(Usuario model, UsuarioView view){
        this.model = model;
        this.view = view;
    }
    
    public void setNome(String nome){
        model.setNome(nome);
    }
    
    public void setEmail(String email){
        model.setEmail(email);
    }
    
    public void atualizarView(){
        view.exibirDetalhes(model.getNome(),model.getEmail());
    }
}
