package com.fincatto.nfe2.classes.nota;

import org.simpleframework.xml.Element;

import com.fincatto.nfe2.classes.NFBase;
import com.fincatto.nfe2.classes.NFUnidadeFederativa;
import com.fincatto.nfe2.validadores.StringValidador;

public class NFNotaInfoVeiculo extends NFBase {
    @Element(name = "placa", required = true)
    private String placaVeiculo;

    @Element(name = "UF", required = true)
    private String uf;

    @Element(name = "RNTC", required = false)
    private String registroNacionalTransportadorCarga;

    public void setPlacaVeiculo(final String placaVeiculo) {
        StringValidador.placaDeVeiculo(placaVeiculo);
        this.placaVeiculo = placaVeiculo;
    }

    public void setUf(final NFUnidadeFederativa uf) {
        this.uf = uf.getCodigo();
    }

    public void setRegistroNacionalTransportadorCarga(final String registroNacionalTransportadorCarga) {
        StringValidador.tamanho20(registroNacionalTransportadorCarga);
        this.registroNacionalTransportadorCarga = registroNacionalTransportadorCarga;
    }
}