/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pp_mvc_2023;

/**
 *
 * @author nando
 */
public class PP_MVC_2023 {

    public static void main(String[] args) {
        Usuario model = new Usuario();
        
        UsuarioView view = new UsuarioView();
        
        UsuarioController controller = new UsuarioController(model,view);
        
        controller.setNome("Maria");
        controller.setEmail("maria@email.com");
        
        controller.atualizarView();
        
        /*
        System.out.print("Novo Usuario");
        
        controller.setNome("Joao");
        controller.setEmail("joao@email.com");
        
        controller.atualizarView();
        */
        
        
    }
}
