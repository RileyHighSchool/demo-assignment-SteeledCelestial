public class Annuity
{
    public static void main(String[] args){
        System.out.print(getPresentValue(35,3,15)); //sets value for  pmt etc
    }
/**
* Returns the present value of the annuity
*/
public  static double getPresentValue(int pmt, int i, int n)
{
    double intdec = i/100.0;
    double presentVal = pmt*((1-Math.pow((1+intdec),-1*n))/intdec); 
    

    return presentVal;
}
// there may be instance variables, constructors, and methods not shown
}
    

