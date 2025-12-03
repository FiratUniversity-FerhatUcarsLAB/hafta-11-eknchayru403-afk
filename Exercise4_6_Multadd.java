/**
 * Ad Soyad: [Hayrunnisa Ekinci]
 * Öğrenci No: [240541043]
 * Proje: [Exercise4_6_Multadd]
 * Tarih: [03/12/2025]
 */
public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        return a*b + c;
    }

    public static double expSum(double x) {
       double e_minus_x= Math.exp(-x); 
        return multadd(x, e_minus_x, Math.sqrt(1 - e_minus_x));
    }

    public static void main(String[] args) {
     double simpleTest= multadd(1.0, 2.0, 3.0);
        System.out.println(simpleTest);
        
        
        double pi_over_4= Math.PI / 4.0;
        double sin_val= Math.sin(pi_over_4);
        double cos_val= Math.cos(pi_over_4);
        
        
        double result1= multadd(1.0/2.0, cos_val, sin_val);
        System.out.println(result1);

        
        double log10= Math.log(10.0);
        double log20= Math.log(20.0);

       
        double result2= multadd(1.0, log20, log10);
        System.out.println(result2);
        
      
        double xTest= 5.0;
        double expSumResult= expSum(xTest);
        System.out.println(expSumResult);
    }
}
