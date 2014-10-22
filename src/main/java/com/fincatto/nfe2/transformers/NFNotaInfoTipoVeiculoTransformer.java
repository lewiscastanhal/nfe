package com.fincatto.nfe2.transformers;

import org.simpleframework.xml.transform.Transform;

import com.fincatto.nfe2.classes.NFNotaInfoTipoVeiculo;

public class NFNotaInfoTipoVeiculoTransformer implements Transform<NFNotaInfoTipoVeiculo> {

    @Override
    public NFNotaInfoTipoVeiculo read(final String codigoTipoVeiculo) throws Exception {
        return NFNotaInfoTipoVeiculo.valueOfCodigo(codigoTipoVeiculo);
    }

    @Override
    public String write(final NFNotaInfoTipoVeiculo tipoVeiculo) throws Exception {
        return tipoVeiculo.getCodigo();
    }
}