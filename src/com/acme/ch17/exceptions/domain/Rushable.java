package com.acme.ch17.exceptions.domain;

public interface Rushable {
	public abstract boolean isRushable(MyDate orderDate, double amount);
}
