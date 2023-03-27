package classes_and_object;

public class Polynomial {
    public int[] degree = new int[10];

    public void setCoefficient(int degree, int coefficient) {
        this.degree[degree] = coefficient;
    }

    public void print() {
        for (int i = 0; i < 10; i++) {
            if (degree[i] != 0) {

                System.out.print(degree[i] + "x^" + (i) + " + ");

            }

        }

    }
    //addition
    public Polynomial add(Polynomial p){
        for (int i = 0; i < 10; i++) {
            this.degree[i] = this.degree[i] + p.degree[i];

        }
        return this;
    }
    //subtraction
    public Polynomial subtract(Polynomial p){
        for (int i = 0; i < 10; i++) {
            this.degree[i] = this.degree[i] - p.degree[i];

        }
        return this;
    }

    //multiplication
    public Polynomial multiply(Polynomial p)
    {
        int[] x = new int[10];
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j < 10; j++) {
                int deg = (i) + (j);
                if (deg<10)
                {
                    x[deg] = x[deg] + this.degree[i] * p.degree[i];
                }

            }

        }
        for (int i = 0; i < 10; i++) {
            this.degree[i] = x[i];


        }
        return this;
    }



}




