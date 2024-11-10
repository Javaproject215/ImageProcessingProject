

package com.mycompany.banksystem;


public class BankSystem {

    public static void main(String[] args) {
        BankAcount id1 = new BankAcount("Khalid","Dhaka",20000);
        BankAcount id2 = new BankAcount("Shahid","Dhaka",10000);
        BankAcount id3 = new BankAcount("Shimanto","Dhaka",15000);
        BankAcount id4 = new BankAcount("Raha","Dhaka",5000);
        System.out.println(BankAcount.getTotalAmount());
        System.out.println(BankAcount.getAvg());
    }
}

 class BankAcount
 {
     private String name,branch;
     private double Bankbalance;
     private static double TotalAmount = 0.0;
     private static int numberofacount = 0;
    public BankAcount(String name,String branch,double Bankbalance)
     {
         this.name = name;
         this.branch = branch;
         this.Bankbalance = Bankbalance;
         numberofacount++;
         TotalAmount +=Bankbalance;
     }
     public String getName()
     {
         return name;
     }
     public void setName(String name)
     {
         this.name = name;
     }
     public String getBranch()
     {
         return branch;
     }
     public void setBranch(String branch)
     {
         this.branch = branch;
     }
     public double getBankBalance()
     {
         return Bankbalance;
     }
     public void setBankBalace(double Bankbalance)
     {
         this.Bankbalance = Bankbalance;
         TotalAmount +=Bankbalance;
     }
     public static double getTotalAmount()
     {
         return TotalAmount;
     }
     public static double getAvg()
     {
         double avg=0;
         if(numberofacount>0)
         {
             avg = TotalAmount/numberofacount;
         }
         return avg;
     }
           
     
 }

    
