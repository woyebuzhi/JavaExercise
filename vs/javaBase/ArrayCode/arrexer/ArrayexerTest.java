package javaBase.ArrayCode.arrexer;

import javax.sound.midi.spi.MidiFileReader;

import sun.util.resources.cldr.pa.TimeZoneNames_pa;

/**
 * ArrayexerTest
 */
public class ArrayexerTest {

    public static void main(String[] args) {
 
       /*       int[] arr = new int[]{8,2,1,0,3};
             int[] index = new int[]{2,0,3,2,4,0,1,3,2,3,3};
             String tel = "";
             for(int i = 0;i < index.length;i++){
             tel += arr[index[i]];
             }
                System.out.println("联系方式：" + tel); */


        /* // 复制数组
        String[] arr = new String[]{"a","b","c","d","e"};
        
        String[] arr1 = new String[arr.length];
        for(int i =0;i<arr.length;i++){
            arr1[i] = arr[i];
        } */

        int[] arr2 = new int[]{-98,-34,2,34,54,66,79,105,210,333};
        
        for(int i = 0;i < arr2.length-1;i++){
            for(int j =0;j < arr2.length - 1 - i;j++){
                if(arr2[j] > arr2[j+1]){
                    int tmp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = tmp;
                }
            }
        }
        for(int i = 0;i < arr2.length;i++){
            System.out.println(arr2[i]);
        }

	/* 	int dest1 = 12;
        int start = 0;
        int end = arr2.length-1; */

     /*    // 反转值
        for(int i = 0;i < arr2.length /2;i++){
            int tmpNum = arr2[i];
            arr2[i] = arr2[arr2.length - 1 - i];
            arr2[arr2.length -1 -i] = tmpNum;
        }

        for(int i = 0, j = arr2.length-1;i < j;i++,j--){
            int tmpNum = arr2[i];
            arr2[i] = arr2[j];
            arr2[j] = tmpNum;
        } */
       

    /*     while(start <= end){
            int middle  = (start + end) / 2;
            if(arr2[middle] == dest1){
                System.out.println("找到了位置"+ middle);
                break;
            }else if(arr2[middle] > dest1){
                end = middle - 1;
            }else{
                start = middle + 1;
            }
        } */
		
		

           
    }
}