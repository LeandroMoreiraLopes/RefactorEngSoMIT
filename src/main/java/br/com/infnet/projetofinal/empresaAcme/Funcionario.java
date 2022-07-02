package br.com.infnet.projetofinal.empresaAcme;

import java.util.List;

abstract class Funcionario {
    public GrupoSanguineo grupoSanguineo;

    private Long matricula;

    private List<Cursos> cursos;

    public Funcionario(GrupoSanguineo grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    private String id;
    private String nome;
    private String sobrenome;
    private Long tempoDeServicoEmAnos;

    public String logradouro;
    public String cidade;
    public String numero;
    public String cep;
    public String bairro;

    public Long getTempoDeServicoEmAnos() {
        return tempoDeServicoEmAnos;
    }

    public void setTempoDeServicoEmAnos(Long tempoDeServicoEmAnos) {
        this.tempoDeServicoEmAnos = tempoDeServicoEmAnos;
    }

    public Long getMaticula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public List<Cursos> getCursos() {
        return cursos;
    }

    public void setCursos(List<Cursos> cursos) {

        this.cursos = cursos;
    }

    public Integer getQuantidadeEmpregadosFabrica(){
        return 34;
    }
}
