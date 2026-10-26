public class Complex {

        int real;
        int imaginary;
        Complex(int real,int imaginary)
        {
            this.real=real;
            this.imaginary=imaginary;
        }
        public Complex add(Complex c)
            {
              int newReal=this.real+c.real;
              int newImaginary=this.imaginary+c.imaginary;
              return new Complex(newReal,newImaginary);
            }
            public Complex add(int a)
            {
              int newReal=this.real+a;
             
              return new Complex(newReal,this.imaginary);
            }
        
        public void dispaly()
        {
            if(imaginary<0)
            {
                System.out.println(real+"-"+(-imaginary)+"i");
            }
            else
                System.out.println(real+"-"+(imaginary)+"i");

        }
    public static void main(String[] args) {
        Complex c1=new Complex(4,3);
        Complex c2=new Complex(2,5);
        Complex sum1=c1.add(c2);
        System.out.println("Adding Two Complex Numbers (c1+c2): ");
        sum1.dispaly();

        Complex sum2=c1.add(10);
        System.out.println("Adding Two Complex Numbers (c1+10): ");
        sum1.dispaly();


    }
    
}
