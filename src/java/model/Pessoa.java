/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.PessoaDAO;
import javax.faces.bean.ManagedBean;



/**
 *
 * @author Vagner Bellaver
 */
@ManagedBean
public class Pessoa {
   private String nome;
   private String sobrenome;
   private String  email;
    PessoaDAO pes = new PessoaDAO();
    
   public void inserirPessoaDAO(){
       
       System.out.println(this.nome);
       pes.inserirPessoa(this);
   }
    
    public Pessoa() {
        this.nome = "Vagner";
        this.sobrenome = "Bellaver";
        this.email = "vfbellaver@bellaver.com";
    }

    public void trocarDados(){
        this.nome = "João";
        this.sobrenome = "Amaral";
        this.email = "joaoamaral@bellaver.com";
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
   
   
}
