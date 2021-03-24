package com.BitJetKit.QuadraticMethod;

import java.util.Arrays;

public class QuadraticMethod {
	double a = 0;
	double b = 0;
	double c = 0;
	double quadraticNegSqrt = 0.0;
	double quadraticPosSqrt = 0.0;
	double [] x = new double [2];
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public void setQuadraticNeg(double a, double b, double c) {
		quadraticNegSqrt = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c )) / (2 * a); 
	}
	public void setQuadraticPos(double a, double b, double c) {
		quadraticPosSqrt = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c )) / (2 * a); 
	}
	public void setX(double quadraticNegSqrt, double quadraticPosSqrt) {
		x[0] = quadraticNegSqrt;
		x[1] = quadraticNegSqrt;
	}
	public void printX() {
		System.out.println("x_1 = " + x[1] + "x_2 = " + x[2]);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(a);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(b);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(c);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(quadraticNegSqrt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(quadraticPosSqrt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Arrays.hashCode(x);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuadraticMethod other = (QuadraticMethod) obj;
		if (Double.doubleToLongBits(a) != Double.doubleToLongBits(other.a))
			return false;
		if (Double.doubleToLongBits(b) != Double.doubleToLongBits(other.b))
			return false;
		if (Double.doubleToLongBits(c) != Double.doubleToLongBits(other.c))
			return false;
		if (Double.doubleToLongBits(quadraticNegSqrt) != Double.doubleToLongBits(other.quadraticNegSqrt))
			return false;
		if (Double.doubleToLongBits(quadraticPosSqrt) != Double.doubleToLongBits(other.quadraticPosSqrt))
			return false;
		if (!Arrays.equals(x, other.x))
			return false;
		return true;
	}
}
