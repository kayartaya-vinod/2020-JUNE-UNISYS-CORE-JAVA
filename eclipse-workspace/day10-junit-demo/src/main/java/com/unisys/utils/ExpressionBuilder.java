package com.unisys.utils;

public class ExpressionBuilder {

	double result;

	public double build() {
		return result;
	}

	public ExpressionBuilder add(double num) {
		result += num;
		return this;
	}

	public ExpressionBuilder subtract(double num) {
		result -= num;
		return this;
	}

	public ExpressionBuilder multiply(double num) {
		result *= num;
		return this;
	}

	public ExpressionBuilder divide(double num) {
		result /= num;
		return this;
	}

	public ExpressionBuilder mod(double num) {
		result %= num;
		return this;
	}
}
