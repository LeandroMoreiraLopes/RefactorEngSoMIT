package br.com.infnet.projetofinal.empresaAcme;

public class Curso {
    private String nome;
    private Integer nota;

    private TipoCurso tipoCurso;

    public Curso(String nome, Integer nota) {
        this.nome = nome;
        this.nota = nota;
        this.tipoCurso = null;
    }

    public Curso(String nome, Integer nota, TipoCurso tipoCurso) {
        this.nome = nome;
        this.nota = nota;
        this.tipoCurso = tipoCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public boolean isAprovado() {
        if (tipoCurso == TipoCurso.Doutorado && nota > 5) return true;
        else if (tipoCurso == TipoCurso.Mestrado && nota > 7) return true;
        else return false;
    }

    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public boolean isMestrado(){
        return tipoCurso == TipoCurso.Mestrado ? true : false;
    }

    public boolean isDoutorado(){
        return tipoCurso == TipoCurso.Doutorado ? true : false;
    }
}
