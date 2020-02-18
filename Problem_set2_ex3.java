/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_set2_ex3;

/**
 *
 * @author Livan Martinez
 */
public class Problem_set2_ex3 {

    /**
     * @param args the command line arguments
     */
    public static double calculo_interes_anual(double balance,double cuota_minima,double interes_mensual){
        for(int i = 0; i < 12; i++){
            balance = balance - cuota_minima;
            //print("balance pagando la cuota minima de: ",cuota_minima," quedando: ",balance)
            balance = balance + (interes_mensual*balance);
            //print("balance mas interes: ",balance)
        }
        return balance;
    }
    public static void main(String[] args) {
        double balance = 320000; 
        double annualInterestRate = 0.2;
        double interes_mensual = annualInterestRate/12;
        System.out.printf("interes mensual: %f \n",interes_mensual);
        double lower = Math.round((balance/12)*100)/100d;
        System.out.printf("lower: %f \n",lower);
        double upper = (balance*Math.pow((1+interes_mensual),12))/12;
        System.out.printf("upper: %f \n",upper);
        double cuota_minima = (lower+upper)/2;
        while(true){
            double awa = calculo_interes_anual(balance,cuota_minima,interes_mensual);
            System.out.println(awa);
            if(awa <= 0.01 && awa >= 0.001){
                System.out.println("Lowest Payment: " + String.valueOf(Math.round((cuota_minima)*100)/100d));
                break;
            }
            else if(awa > 0.01){
                System.out.println(cuota_minima);
                lower = cuota_minima;
                System.out.println("cuota muy baja");
            }
            else if(awa < 0.0009){
                System.out.println(cuota_minima);
                upper = cuota_minima;
                System.out.println("cuota muy alta");
            }
            cuota_minima = (lower+upper)/2;
        }
    }
}
