/*
With a help of interface,write a program to find the area of rectangle and
triangle
*/

interface var
{
        final static int b=4;
        final static int l=5;
}
interface area extends var
{
        public void rect();
        public void tri();
}
class calculate implements area
{
        public void rect()
        {
                int res;
                res = l * b;
                System.out.println("The area of rectangle = " +res);
        }
        public void tri()
        {
                double res;
                res = (0.5) * l * b;
                System.out.println("The area of triangle = " +res);
        }
}
class pro1
{
        public static void main(String args[])
        {
                area a1;
                calculate c1 = new calculate();
                a1=c1;
                a1.rect();
                a1.tri();
        }
}

