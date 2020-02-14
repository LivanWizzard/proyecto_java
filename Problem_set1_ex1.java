/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_set1_ex1;

/**
 *
 * @author Livan Martinez
 */
public class Problem_set1_ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vowels = 0;
        String s = "azcbobobegghakl";
        for (int i = 0; i < s.length(); i++) {
            if ("a".equals(String.valueOf(s.charAt(i)))||"e".equals(String.valueOf(s.charAt(i)))||"i".equals(String.valueOf(s.charAt(i)))||
                    "o".equals(String.valueOf(s.charAt(i)))||"u".equals(String.valueOf(s.charAt(i)))) {
                vowels += 1;
            }
        }
        System.out.println(vowels);
    }
    
}
