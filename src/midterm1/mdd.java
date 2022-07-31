package midterm1;

import java.util.Scanner;
public class mdd {


		        public static void main(String[] args) {
		            Scanner scan = new Scanner(System.in);
		            int choice = 0;
		            int income[] = new int[12];
		            int expense[] = new int[12];
		            int amount[] = new int[12];
		            String[] details=new String[12];
		            int sum = 0;
		            int final_amount=0;
		           String[] months = new String[12];
		            months[0] = "January";
		            months[1] = "February";
		            months[2] = "March";
		            months[3] = "April";
		            months[4] = "May";
		            months[5] = "June";
		            months[6] = "July";
		            months[7] = "August";
		            months[8] = "September";
		            months[9] = "October";
		            months[10] = "November";
		            months[11] = "December";
		        do
		        {
		            System.out.println("1. Enter a income and expense");
		            System.out.println("2. Display summary by month");
		            System.out.println("3. Display  overall summary");
		             System.out.println("4. Display  report(avg,min&max");
		            System.out.println("5. Exit program");
		            choice = scan.nextInt();
		            if ( choice == 1 ) 
		            {
		                Scanner scanincome = new Scanner(System.in);
		                Scanner scanexpense = new Scanner(System.in);
		                System.out.println("Enter income an expense");
		                System.out.println();
		                int i = 0;
		                for( i = 0; i < 12; i++ )
		                {
		                    System.out.println("Income:");
		                    int temp = scanincome.nextInt();
		                    income[i] = temp;
		                    System.out.println("Expense:");
		                    expense[i] = scanexpense.nextInt();
		                    if( i == ( income.length - 1 ) )
		                    {
		                        System.out.println("Thank you!");
		                        System.out.println();
		                    }
		                }
		            }
		            if ( choice == 2 )
		            {
		                System.out.println("Income" + "\tExpense" + "\tMonth");
		                System.out.println("---------------------");
		                for(int p = 0; p < income.length; p++)
		                {
		                    System.out.println(income[p] + "\t" + "\t" + expense[p] + "\t" + "\t" + months[p]);
		                }
		            }
		            if ( choice == 3 )
		            {   
		                  System.out.println("Total income: " + getSum(income));
		                  System.out.println("Total expense: " + getSum(expense));
		                  final int finalsumincome=getSum(income);
		                  final int finalsumexpense=getSum(expense);
		                  if(finalsumincome>finalsumexpense)
		                  {
		                  final_amount=getSum(income)-getSum(expense);
		                  System.out.println("Profit:"+final_amount);
		                  }
		                  else
		                  {
		                  final_amount=getSum(expense)-getSum(income);
		                  System.out.println("Loss:"+final_amount);
		                  }
		                  
		        }
		            if ( choice == 4 ) 
		            {
		             System.out.println("Average income: " + getAverage(income));
		              System.out.println("Average expenses: " + getAverage(expense));
		               System.out.println("Maximum  income: " + getMax(income));
		                System.out.println("Maximum expense: " + getMax(expense));
		                System.out.println("Minimum  income: " + getMin(income));
		                System.out.println("Minimum expense: " + getMin(expense));
		            }

		        }
		        while ( choice != 5);
		    }
		        public static double getAverage(int[] array)
		        {
		            int sum = 0;
		            for(int i : array) sum += i;
		            return ((double) sum)/array.length;
		        }
		        public static int getSum(int[] array)
		        {
		            int sum = 0;
		            for (int i : array) 
		            {
		             sum += i;
		            }
		            return sum;
		        }
		         public static int getMax(int[] inputArray){ 
		    int maxValue = inputArray[0]; 
		    for(int i=1;i < inputArray.length;i++){ 
		      if(inputArray[i] > maxValue){ 
		         maxValue = inputArray[i]; 
		      } 
		    } 
		    return maxValue; 
		  }
		 
		  // Method for getting the minimum value
		  public static int getMin(int[] inputArray){ 
		    int minValue = inputArray[0]; 
		    for(int i=1;i<inputArray.length;i++){ 
		      if(inputArray[i] < minValue){ 
		        minValue = inputArray[i]; 
		      } 
		    } 
		    return minValue; 
		  }



			}





