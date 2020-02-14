/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_set_ex3;

/**
 *
 * @author Livan Martinez
 */
public class Problem_set_ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "azcbobobegghakl";
        int tamano = s.length();
        String res = "";
        String temp = "";
        String mayor="";
        String actual = "";
        
        for(int i = 0; i<s.length();i++){
            if(tamano <= 1){
                res = s.substring(i);
                System.out.println("Longest substring in alphabetical order is: "+res);
            }else{
                System.out.println("awa");
                temp = s.substring(i,i);
                System.out.println(temp);
                if(res.equals("")){
                    res = temp;
                    if(res.equals("z")){
                        mayor = res;
                    }
                }else{
                    if(res.substring(s.length()-1).compareToIgnoreCase(temp)==-1){
                        res+=temp;
                        actual = res;
                    }else{
                        if(actual.length()>mayor.length()){
                            mayor=res;
                        }
                        res = temp;
                    }
                }
            }
        }
        if(mayor.length() >= res.length()){
            System.out.println("Longest substring in alphabetical order is: "+mayor);
        }else{
            System.out.println("Longest substring in alphabetical order is: "+res);
        }
    } 
}
