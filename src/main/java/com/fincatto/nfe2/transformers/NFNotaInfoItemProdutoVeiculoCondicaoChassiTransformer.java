package com.fincatto.nfe2.transformers;

import org.simpleframework.xml.transform.Transform;

import com.fincatto.nfe2.classes.NFNotaInfoItemProdutoVeiculoCondicaoChassi;

class NFNotaInfoItemProdutoVeiculoCondicaoChassiTransformer implements Transform<NFNotaInfoItemProdutoVeiculoCondicaoChassi> {
	
	@Override
	public NFNotaInfoItemProdutoVeiculoCondicaoChassi read(final String codigo) throws Exception {
		return NFNotaInfoItemProdutoVeiculoCondicaoChassi.valueOfCodigo(codigo);
	}
	
	@Override
	public String write(final NFNotaInfoItemProdutoVeiculoCondicaoChassi tipo) throws Exception {
		return tipo.getCodigo();
	}
}