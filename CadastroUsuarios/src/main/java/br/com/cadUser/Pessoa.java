package br.com.cadUser;

import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("pessoa")
@SessionScoped
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private ArrayList<String> nomes = new ArrayList<>();

    public void cadastrar() {
        if (nome != null && !nome.trim().isEmpty()) {
            nomes.add(nome.trim());
            nome = "";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getNomes() {
        return nomes;
    }

    public void setNomes(ArrayList<String> nomes) {
        this.nomes = nomes;
    }
}