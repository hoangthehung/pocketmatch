/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hung.hoang.pocketmath;

import java.util.ArrayList;

/**
 *
 * @author hoanghung
 */
public class SwapEvenOddArray {
    public int[] swapArray(int[] input){
        int i = 0;
        int j = input.length - 1;
        int tmp;
        while (i < j){
            while (i < j && input[i] % 2 == 0) i++;
            while (j > i && input[j] % 2 == 1 ) j--;
            if ( j > i){
                tmp = input[i];
                input[i] = input[j];
                input[j] = tmp;
                i++;
                j--;
            }
        }
        return input;
    }
}
