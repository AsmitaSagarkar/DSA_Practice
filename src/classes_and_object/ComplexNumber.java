package classes_and_object;

public class ComplexNumber {
    private int real;
    private int imaginary;

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }
    public void print(){
        System.out.println(getReal() + "+" + getImaginary() + "i");
    }
    public void plus(ComplexNumber c1){
        this.real = this.real+ c1.real;
        this.imaginary = this.imaginary + c1.imaginary;
    }
    public void printplus()
    {
        System.out.println(this.real + "+" + this.imaginary + "i");
    }
    public void multiply(ComplexNumber c2)
    {
        int temp = this.real;
        this.real = (this.real*c2.real )- (this.imaginary*c2.imaginary);
        this.imaginary = temp*c2.imaginary + this.imaginary*c2.real;
    }
    public void printmultiply(){

        System.out.println(this.real+" + "+this.imaginary+"i");
    }




}
