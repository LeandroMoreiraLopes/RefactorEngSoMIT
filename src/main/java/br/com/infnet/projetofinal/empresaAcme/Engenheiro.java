package br.com.infnet.projetofinal.empresaAcme;

import java.util.Date;
import java.util.List;

public class Engenheiro extends Funcionario{

    private boolean fluenteEmIngles;
    public String numeroConselho;

    public Engenheiro(GrupoSanguineo grupoSanguineo) {
        super(grupoSanguineo);
    }

    public Double calculaBonusEngenheiro() {
        return getTempoDeServicoEmAnos() * 3.7;
    }

    public String getNumeroConselho() {
        return numeroConselho + new Date().getYear();
    }

    public Integer verificaQualificacoesParaTrabalhoFora(){
        Integer aprovado = -1;

        if (fluenteEmIngles) {
            for (Cursos curso : getCursos()) {
                if((curso.isMestrado() || curso.isDoutorado()) && curso.isAprovado()) aprovado = 1;
            }
        }
        return aprovado;
    }
}
