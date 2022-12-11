package org.eumemu.facade;

import org.eumemu.subsistemaCEP.CepApi;
import org.eumemu.subsistemaCRM.CrmService;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome,cep,cidade,estado);
    }
}
