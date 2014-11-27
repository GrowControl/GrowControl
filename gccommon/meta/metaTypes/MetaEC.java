package com.growcontrol.gccommon.meta.metaTypes;

import com.growcontrol.gccommon.meta.Meta;


public class MetaEC extends Meta {
	private static final long serialVersionUID = 11L;

	protected volatile Integer value = null;


	protected MetaEC(final String typeStr) {
		super(typeStr);
	}


	@Override
	public String getValueStr() {
		if(this.value == null)
			return null;
		return this.value.toString();
	}
	@Override
	public MetaEC clone() {
		return new MetaEC(typeStr());
	}


}