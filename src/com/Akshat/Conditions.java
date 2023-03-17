package com.Akshat;

public class Conditions {

    public static void main(String args[]){

        /* syntax of if statments
         if (Boolean expression T or F){
               //body
               }
               // do this


       */


   int salary=50000;
    //if (salary>10000){
        //salary=salary+2000;


   // } else{
      //  salary=salary+4000;
        //}

          // Multiple if else statments

        if (salary>10000) {
            salary = salary + 1000;

        } else if (salary>20000) {
            salary = salary + 2000;

        }else{
              salary=salary+4500;
            }
        System.out.println (salary);
}
}


