package cs245.Appler;

public class Rational {//Creates Rational Class
    private int numerator;
    private int denominator;

    public Rational() {//Default Constructor 1/1
        numerator = 1;
        denominator = 1;
    }

    public Rational(int num, int denom) {//Other Constructor
        if (denom == 0 ) {throw new IllegalArgumentException("Denominator cannot be zero");}
        else if (denom < 0 ) {throw new IllegalArgumentException("Denominator cannot be negative");}
        else if (num < 0 ) {throw new IllegalArgumentException("Numerator cannot be negative");}
        numerator = num;
        denominator = denom;
    }

    public Rational Reduce() {//Returns a reduced Rational number
        int GFC=GreatestCommonFactor(numerator, denominator);
        return new Rational(numerator/GFC, denominator/GFC);
    }

    public Rational add(Rational b){//Adds two rational numbers together and returns a reduced Rational number
        int LCD=LeastCommonDenominator(denominator, b.denominator);
        int num=(numerator*(LCD/denominator)+b.numerator*(LCD/b.denominator));
        Rational c = new Rational(num,LCD);
        return (c.Reduce());
    }

    public Rational multiply(Rational b){//Multiplies two rational numbers together and returns a reduced Rational number
        int num = (numerator*b.numerator);
        int denom = (denominator*b.denominator);
        Rational c = new Rational(num,denom);
        return (c.Reduce());
    }

    public String toString() {//Allows System.out.println(Rational) to work
        return (numerator + "/" + denominator);
    }

    private int GreatestCommonFactor(int num, int denom){//Finds and returns the GCF of two integers
        int GFC=1;
        for (int i = 2; i <= num; i++){
            if (num%i==0 && denom%i==0){GFC=i;}
        }
        return(GFC);
    }

    private int LeastCommonDenominator(int denom1, int denom2){//Finds and returns the LCD of two integers
        int LCD = denom1;
        while (LCD%denom1!=0 || LCD%denom2!=0){
            LCD+=1;
        }
        return(LCD);
    }
}