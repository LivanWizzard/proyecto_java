/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_set2_ex1;

import java.text.DecimalFormat;

/**
 *
 * @author Livan Martinez
 */
public class Problem_set2_ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat fmt = new DecimalFormat("#.00");
        double balance = 42; 
        double annualInterestRate = 0.2; 
        double monthlyPaymentRate = 0.04;
        for(int i = 0; i < 12;i++){ //i in range(0,12):
    //print("balance sin pagar: ",balance)
    //print("pago minimo mensual: ",balance * monthlyPaymentRate)
    double pago_minimo_mensual = balance*monthlyPaymentRate;
    //print("restante: ",balance-pago_minimo_mensual)
    balance = Math.round((balance-pago_minimo_mensual)*100)/100d; //round(balance-pago_minimo_mensual,2);
    //print("interes: ",(annualInterestRate/12.0*balance))
    double interes = Math.round((annualInterestRate/12.0*balance)*100)/100d;
    balance += interes;
    //System.out.println(round(balance,2));
        }
        System.out.println(balance);
    }
}
