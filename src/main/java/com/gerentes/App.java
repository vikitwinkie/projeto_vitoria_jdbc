package com.gerentes;


import com.gerentes.dao.PessoaDao;
import com.gerentes.dao.PessoaPojo;
import com.gerentes.modelo.Pessoa;

public class App {
    public static void main( String[] args )
    {
     
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Vitoria");
        pessoa.setIdade(16);
        pessoa.setEndereco("Rua Padre Anchieta 171");
        
        PessoaPojo pessoaPojo = new PessoaPojo();
        pessoaPojo.setNome(pessoa.getNome());
        pessoaPojo.setIdade(pessoa.getIdade());
        pessoaPojo.setEndereco(pessoa.getEndereco());

        /*
        //Cadastrar
        PessoaDao pessoaDao = new PessoaDao();
        pessoaDao.cadastrarPessoa(pessoaPojo);
        */

        /*
        //Alterar
        PessoaDao pessoaDao = new PessoaDao();
        pessoaDao.alterarPessoa(pessoaPojo);
        */


        /* 
        //Consultar
        PessoaDao pessoaDao = new PessoaDao();
        pessoaDao.consultarPessoa(pessoaPojo);
        */

        /* 
        //Remover
        PessoaDao pessoaDao = new PessoaDao();
        pessoaDao.removerPessoa(pessoaPojo);
        */
        System.out.println("Blu blu");
    }
}