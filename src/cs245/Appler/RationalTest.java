package cs245.Appler;

public class RationalTest {


    public static void main(String[] args){

        //Tests Default
        Rational Default = new Rational();
        System.out.println("Default: " + Default);

        //Tests the three throw errors
        try{ Rational Te1 = new Rational(-1,1);}//Numerator is negative
        catch(IllegalArgumentException ex){System.out.println("Numerator is negative: Could not make Rational Number");}

        try{ Rational Te2 = new Rational(1,-1);}//Denominator is negative
        catch(IllegalArgumentException ex){System.out.println("Denominator is negative: Could not make Rational Number");}

        try{ Rational Te3 = new Rational(1,0);}//Denominator is zero
        catch(IllegalArgumentException ex){System.out.println("Denominator is zero: Could not make Rational Number");}

        //Tests Reducing
        Rational R1 = new Rational(3,5);//Un-reducible
        Rational R1b = R1.Reduce();
        System.out.println("Before Reducing: " + R1 + " After Reducing: " + R1b);

        Rational R2 = new Rational(42,28);//Reducible
        Rational R2b = R2.Reduce();
        System.out.println("Before Reducing: " + R2 + " After Reducing: " + R2b);

        Rational R3 = new Rational(0,5);//Zero
        Rational R3b = R3.Reduce();
        System.out.println("Before Reducing: " + R3 + " After Reducing: " + R3b);

        //Tests adding
        Rational A = new Rational(3,14);

        Rational A1 = new Rational(1,14);//Same Denominators
        Rational A1sum = A1.add(A);
        System.out.println(A + " + " + A1 + " = " + A1sum);

        Rational A2 = new Rational(4,15);//Different Denominators
        Rational A2sum = A2.add(A);
        System.out.println(A + " + " + A2 + " = " + A2sum);

        Rational A3 = new Rational(0,5);//Zero
        Rational A3sum = A3.add(A);
        System.out.println(A + " + " + A3 + " = " + A3sum);

        //Tests Multiplication
        Rational M = new Rational(3,14);

        Rational M1 = new Rational(1,14);//Same Denominators
        Rational M1sum = M1.multiply(M);
        System.out.println(M + " * " + M1 + " = " + M1sum);

        Rational M2 = new Rational(4,15);//Different Denominators
        Rational M2sum = M2.multiply(M);
        System.out.println(M + " * " + M2 + " = " + M2sum);

        Rational M3 = new Rational(0,5);//Zero
        Rational M3sum = M3.multiply(M);
        System.out.println(M + " * " + M3 + " = " + M3sum);
    }
}