class Polynomial {
	private double[] coefficients;
	
	public Polynomial(){
		coefficients = new double [0];
	}

	public Polynomial(double[] coefficients){
		this.coefficients = coefficients;
	}

	public Polynomial add(Polynomial calling){
		double[] coef;

		int length1 = this.coefficients.length;
		int length2 = calling.coefficients.length;

		if (length1 > length2){
			coef = new double[length1];
		}
		else {
			coef = new double[length2];
		}

		for (int i = 0; i <= length1 - 1; i++){
			coef[i] += this.coefficients[i];
		}

		for (int j = 0; j <= length2 - 1; j++){
			coef[j] += calling.coefficients[j];
		}

		return new Polynomial(coef);
	}

	public double evaluate(double x){
		double result = .0;
		for (int i = 0; i <= coefficients.length - 1; i++){
			result = result + coefficients[i] * Math.pow(x, i);
		}
		return result;
	}

	public boolean hasRoot(double n){
		return evaluate(n) == .0;
	}
}