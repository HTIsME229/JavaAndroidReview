package Bai1;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator_237, int denominator_237) {
        if (denominator_237 == 0) {
            throw new IllegalArgumentException("Mẫu số không thể bằng 0");
        }
        this.numerator = numerator_237;
        this.denominator = denominator_237;

    }

    public Fraction add(Fraction other_237) {
        int num_237 = this.numerator * other_237.denominator + other_237.numerator * this.denominator;
        int den_237 = this.denominator * other_237.denominator;
        return new Fraction(num_237, den_237);
    }

    public Fraction subtract(Fraction other_237) {
        int num_237 = this.numerator * other_237.denominator - other_237.numerator * this.denominator;
        int den_237 = this.denominator * other_237.denominator;
        return new Fraction(num_237, den_237);
    }

    public Fraction multiply(Fraction other_237) {
        int num_237 = this.numerator * other_237.numerator;
        int den_237 = this.denominator * other_237.denominator;
        return new Fraction(num_237, den_237);
    }

    public Fraction divide(Fraction other_237) {
        if (other_237.numerator == 0) {
            throw new ArithmeticException("Không thể chia cho phân số có tử số = 0");
        }
        int num_237 = this.numerator * other_237.denominator;
        int den_237 = this.denominator * other_237.numerator;
        return new Fraction(num_237, den_237);
    }

    public boolean isSimplified() {
        return gcd(Math.abs(numerator), Math.abs(denominator)) == 1;
    }

    public void simplify() {
        int g = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= g;
        denominator /= g;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
