package br.com.infnet.projetofinal.empresaAcme;

import java.util.List;
import java.util.Map;

public class Vendedor extends Funcionario{
    private Long quantidadeDeVendas;
    private boolean metaBatida;

    public Vendedor(GrupoSanguineo grupoSanguineo) {

        super(grupoSanguineo);
    }

    public boolean isMetaBatida() {
        return metaBatida;
    }

    public void setMetaBatida(boolean metaBatida) {
        this.metaBatida = metaBatida;
    }

    public boolean isPlatinumEBateuMeta(){
        boolean isPlatinum = false;
        if(quantidadeDeVendas > 35 && getCursos().size() > 3 && metaBatida){
            isPlatinum = true;
        }
        return  isPlatinum;
    }


}
