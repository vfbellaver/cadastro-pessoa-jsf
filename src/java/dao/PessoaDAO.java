/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Pessoa;

/**
 *
 * @author Vagner Bellaver
 */
public class PessoaDAO {
    public void inserirPessoa(Pessoa pessoa){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = new ConnectionFactory().getConnection();
            PreparedStatement stmt;
            stmt = conn.prepareStatement("INSERT INTO pessoa(nome,sobrenome,email) VALUES (?,?,?)");
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSobrenome());
            stmt.setString(3, pessoa.getEmail());
            stmt.execute();
        } catch (Exception e) {
            System.out.println("ERRO "+e.getMessage());
        }
    }
}
