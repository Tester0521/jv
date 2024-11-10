package com.tester0521.deprecated;

final class Fraction
{
	int denominator;
	int numerator;
	
	public Fraction(int d, int n)
	{
        if(d < 0) d*=-1;
        if(n < 0) n*=-1;

		this.denominator = d;
		this.numerator = n;
	}
	
	public Fraction miltioly(Fraction two)
	{
		return new Fraction(denominator * two.denominator,numerator * two.numerator);
	}
	
    public Fraction minus(Fraction frac)
    {
        int commonDenominator = this.denominator * frac.denominator;
        int newNumerator = this.numerator * frac.denominator - frac.numerator * this.denominator;
        return new Fraction(newNumerator, commonDenominator);
    }
    
    public Fraction minus(int num) 
    {
    	Fraction a = new Fraction(num, 1);
        int commonDenominator = this.denominator * a.denominator;
        int newNumerator = this.numerator * a.denominator - a.numerator * this.denominator;
        return new Fraction(newNumerator, commonDenominator);
    }
    
    public Fraction divide(Fraction frac)
    {
        return new Fraction(this.numerator * frac.denominator, this.denominator * frac.numerator);
    }
    
    public Fraction plus(Fraction frac)
    {
        int commonDenominator = this.denominator * frac.denominator;
        int newNumerator = this.numerator * frac.denominator + frac.numerator * this.denominator;
        return new Fraction(newNumerator, commonDenominator);
    }
	
	public String toString()
	{
		return denominator + "/" + numerator;
	}
}
