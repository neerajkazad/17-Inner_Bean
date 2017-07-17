package com.ib.beans;

public class Chain {
	private String chainType;
	private int chainLength;

	public void setChainType(String chainType) {
		this.chainType = chainType;
	}

	public void setChainLength(int chainLength) {
		this.chainLength = chainLength;
	}

	@Override
	public String toString() {
		return "Chain [chainType=" + chainType + ", chainLength=" + chainLength + "]";
	}

}
