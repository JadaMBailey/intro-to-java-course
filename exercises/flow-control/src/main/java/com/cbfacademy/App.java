package com.cbfacademy;

public class App {

    static int[] nums = {1,7,9,4,6,2,1,5};
    static int index = 0;

    public static void main(String[] args) {
       
       // forEachTrial();
     // continueTester();
    }


    public static String forEachTrial(){
        
      for(int num: nums){
        if(index == 5){
            break;
        }
     System.out.println("Value " + num + " is assigned to element " + (index++));
      }
        return "";
      /*
       * To output an index using a FOREACH LOOP you need to specify a variable and increment that variable
       */
    }

    public static void continueTester(){
        for(index =0; index <nums.length; index++){
            if(nums[index] == 1 || nums[index] == 4){
                continue;
            }

            System.out.println(nums[index]);
        }

    }


    public static String whichMonth(Integer number){
        String month;
        switch (number) {
            case 1:
               month = "January";
                break;
            case 2:
                 month = "February";
                break;
            case 3:
                 month ="March";
                break;
            case 4:
                month ="April";
                break;
            case 5:
                month ="May";
                break;
            case 6:
                month ="June";
                break;
            case 7:
                month ="July";
                break;
            case 8:
                month ="August";
                break;
            case 9:
                month ="September";
                break;
            case 10:
                month ="October";
                break;
            case 11:
                month ="November";
                break;
            case 12:
                month ="December";
                break;
            default:
              throw new RuntimeException("Not implemented");
        }
        return month;
    }

}
