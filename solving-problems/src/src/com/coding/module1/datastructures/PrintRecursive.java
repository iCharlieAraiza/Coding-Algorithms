package com.coding.module1.datastructures;

public class PrintRecursive {
    public Integer all(int number){
        //Print element
        if(number<1){
            return 0;
        }

        System.out.println(number);
        return all(number-1);
        //return the same function num -1
    }

    public Integer sumPositives(int number){
        if(number<0){
            return 0;
        }

        System.out.println(number);
        return number + sumPositives(number-1);
    }

    public Integer factorial(int number){
        if(number<1){
            return 1;
        }

        return number * factorial(number - 1);
    }

    public int getOddIndex(int index, int[] numbers) {
        if(index<1){
            return 0;
        }
        else{
            if(numbers[index]%2 != 0){
                return index;
            }else{
                return getOddIndex(--index, numbers);
            }
        }
    }

    public void printAllElementsInverse(int index, String[] names){
        if(index < 0){
            return;
        }

        System.out.println( names[index] );
        printAllElementsInverse(--index, names);
    }

    public void printAllElements(int index, String[] names) {
        if(index>=names.length){
            return;
        }

        System.out.println(names[index]);
        printAllElements(++index, names);
    }
}
