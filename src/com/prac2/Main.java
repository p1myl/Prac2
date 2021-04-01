package com.prac2;

public class Main {

    public static void main(String[] args) {
    }

    public static int oppositeHouse(int n, int len){
        return len * 2 - n + 1;
    }

    public static String nameShuffle(String fullName){
        String[] names = fullName.split(" ");
        return names[1] + " " + names[0];
    }

    public static double discount(int sourcePrice, int discountValue){
        return sourcePrice - sourcePrice * ((double) discountValue / 100);
    }

    public static int differenceMaxMin(int[] arr){
        int minVal = arr[0];
        int maxVal = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            } else if (arr[i] < minVal){
                minVal = arr[i];
            }
        }

        return maxVal - minVal;
    }

    public static int equal(int a, int b, int c){
        int[] tempArr = {a, b, c};
        int counter, tempCounter;
        counter = 0;

        for (int i = 0; i < tempArr.length; i++){
            tempCounter = 0;
            for (int j = 0; j < tempArr.length; j++){
                if (tempArr[j] == tempArr[i]){
                    tempCounter++;
                }
            }
            if (tempCounter > counter) counter = tempCounter;
        }

        if (counter >= 2){
            return counter;
        }
        return 0;
    }

    public static String reverse(String sourceStr){
        String result = "";
        for (int i = sourceStr.length() - 1; i >= 0; i--){
            result += sourceStr.charAt(i);
        }
        return result;
    }

    public static int programmers(int a, int b, int c){
        int[] arr = {a, b, c};

        int minVal = arr[0];
        int maxVal = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            } else if (arr[i] < minVal){
                minVal = arr[i];
            }
        }

        return maxVal - minVal;
    }

    public static boolean getXO(String str){
        int xCount = 0;
        int oCount = 0;

        for (int i = 0; i < str.length(); i++){
            if (Character.toLowerCase(str.charAt(i)) == 'x'){
                xCount++;
            } else if (Character.toLowerCase(str.charAt(i)) == 'o'){
                oCount++;
            }
        }

        return xCount == oCount;
    }

    public static String bomb(String str){
        if (str.toLowerCase().contains("bomb")){
            return "DUCK!";
        }
        return "Relax, there's no bomb.";
    }

    public static boolean sameAscii(String a, String b){
        int aAscii = 0;
        int bAscii = 0;
        for (int i = 0; i < a.length(); i++){
            aAscii += a.charAt(i);
        }
        for (int i = 0; i < b.length(); i++){
            bAscii += b.charAt(i);
        }
        return aAscii == bAscii;
    }
}
