/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_set2_ex2;

/**
 *
 * @author Livan Martinez
 */
public class Problem_set2_ex2 {

    /**
     * @param args the command line arguments
     */
    
    public static String cuota_min_anual(double balance,double annualInterestRate, double cuota_minima){
        double balance_original = balance;
        double interes_mensual = annualInterestRate/12;
        //print("interes mensual: ",interes_mensual)
        for(int i = 0; i < 12; i++){
            balance = balance - cuota_minima;
            //print("balance pagando la cuota minima de: ",cuota_minima," quedando: ",balance)
            balance = balance + (interes_mensual*balance);
            //print("balance mas interes: ",balance)
        }
        if(balance < 0){
            return "Lowest Payment: " + String.valueOf(cuota_minima);
        }
        else{
            //print(balance)
            balance = balance_original;
            cuota_minima += 10;
            //print(cuota_minima)
            return cuota_min_anual(balance,annualInterestRate,cuota_minima);
            }
        }
    public static void main(String[] args) {
        double cuota_minima = 10;
        double balance = 4773; 
        double annualInterestRate = 0.2;
        System.out.println(cuota_min_anual(balance,annualInterestRate,10));
                
    }
}
