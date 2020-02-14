/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_set_ex2;


/**
 *
 * @author Livan Martinez
 */
public class Problem_set_ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "azcbobobegghakl";
        char[] awa = s.toCharArray();
        int bobs = 0;
        for (int i = 0; i < s.length()-3; i++) {
            if (s.substring(i, i+3).equals("bob")) {
                bobs += 1;
            }
        }
        System.out.println(bobs);
    }
    
}
