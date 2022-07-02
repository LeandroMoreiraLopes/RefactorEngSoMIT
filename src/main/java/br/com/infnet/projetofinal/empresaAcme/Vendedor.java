package br.com.infnet.projetofinal.empresaAcme;

import java.util.List;
import java.util.Map;

public class Vendedor extends Funcionario{
    private Long quantidadeDeVendas;

    public Vendedor(GrupoSanguineo grupoSanguineo) {

        super(grupoSanguineo);
    }

    public boolean isPlatinumEBateuMeta(Boolean metaBatida){
        boolean isPlatinum = false;
        if(quantidadeDeVendas > 35 && getCursos().size() > 3 && metaBatida){
            isPlatinum = true;
        }
        return  isPlatinum;
    }


}
