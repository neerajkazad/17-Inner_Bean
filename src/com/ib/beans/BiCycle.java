package com.ib.beans;

public class BiCycle {
	private String name;
	private Chain chain;

	public void setName(String name) {
		this.name = name;
	}

	public void setChain(Chain chain) {
		this.chain = chain;
	}

	@Override
	public String toString() {
		return "BiCycle [name=" + name + ", chain=" + chain + "]";
	}

}
