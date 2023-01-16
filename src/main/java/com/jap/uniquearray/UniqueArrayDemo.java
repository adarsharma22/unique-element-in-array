package com.jap.uniquearray;



public class UniqueArrayDemo {

    public static void main(String[] aa) {

        //declare and initialize integer Array in numberArray Variable

        int[] numberArray = {201,202,201,204,201};
        UniqueArrayDemo uniqueArrayDemo = new UniqueArrayDemo();
        boolean result = uniqueArrayDemo.getUniqueArrayElement(numberArray);
        System.out.println(result);
        for(int newarr:numberArray){
            System.out.println(newarr);

        }

    }


    public boolean getUniqueArrayElement(int numberArray[]) {
        boolean result=true ;
        int count=0;
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = i+1; j < numberArray.length ; j++) {
                if (numberArray[i] == numberArray[j]) {
                    result = false;
                    numberArray[j]=0;
                    count=count+1;
                }
            }
        }
        return result;
    }



}
