package me.pipinipip;

import java.util.Objects;

import static java.lang.StrictMath.atan;


public class Main {

    private double real;
    private double imag;
    // skapar variabler till de komplexa talet och till det icke komplexa talet

    public Main(double real, double imag) { // Skapar Komplexatal
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() { //talet blir en sträng så att det går att skriva ut med System.out.print
        return "real=" + real +
                ", imag=" + imag + "i"
                ;
    }

    @Override
    public boolean equals(Object o) { //kollar om 2 komplexa tal är lika med varandra
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Main komplex = (Main) o;
        return Double.compare(komplex.real, real) == 0 &&
                Double.compare(komplex.imag, imag) == 0;

        @Override
        public int hashCode (); { //Sparar en hashcode.
            final int hash = Objects.hash(real, imag);
            return hash;
        }

    }

    public static class KomplexTest {

        public static void main(String[] args) {
            Main a = new Main(3.0, 2.0); // skapar det komplexa talet a
            Main b = new Main(4.0, 1.0);// skapar det komplexa talet b

            System.out.println("talet borde vara 3 + 2i:\n" + a);

            Main c = a.add(b);// adderar komplexa talet a med komplexa talet b
            Main d = new Main(7, 3);

            System.out.println(c);
            if (c.equals(d)) {
                System.out.println("add funkar!!");
            }
        }

    }


    private Main add(Main B) { // adderar två komplexatal
        double newreal = real + B.real;
        double newimag = imag + B.imag;
        return new Main(newreal, newimag);
    }

}

