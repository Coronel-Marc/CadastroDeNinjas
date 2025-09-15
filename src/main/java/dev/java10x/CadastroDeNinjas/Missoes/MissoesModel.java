package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDaMissao;
    private String dificuldadeDaMissao;
    private NinjaModel ninja;

    public MissoesModel(){}
    public MissoesModel(String nome, String dificuldade, List<NinjaModel> ninjas/*Provavel List<Ninjas> aqui*/){
        this.nomeDaMissao = nome;
        this.dificuldadeDaMissao = dificuldade;
        //this.ninja = ninjas;
    }

    public String getNomeDaMissao() {
        return nomeDaMissao;
    }

    public void setNomeDaMissao(String nomeDaMissao) {
        this.nomeDaMissao = nomeDaMissao;
    }

    public String getDificuldadeDaMissao() {
        return dificuldadeDaMissao;
    }

    public void setDificuldadeDaMissao(String dificuldadeDaMissao) {
        this.dificuldadeDaMissao = dificuldadeDaMissao;
    }

    public NinjaModel getNinja() {
        return ninja;
    }

    public void setNinja(NinjaModel ninja) {
        this.ninja = ninja;
    }
}
