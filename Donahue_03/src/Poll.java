import java.util.*;
class Poll{
   @SuppressWarnings("resource")
   // Sorry for the slopping printing --- not sure how to align it while using a for loop. code would be a lot longer to align
   public static void main(String args[]){
	   String[] topic={"Video Games", "Social Media", "Television", "Sports", "Education"}; 
       int[][] responses=new int[5][11];
       for(int i = 0; i < 4; i++){
           for(int j = 1; j <=10; j++){
               responses[i][j] = 0; 
           }
       }
       
       int peoples;
       System.out.print("Enter the no. of people willing to Rate:");
       Scanner scnr = new Scanner(System.in);
       peoples = scnr.nextInt();
       
       int i = 1;
       while(i <= peoples){
           for(int j = 0; j < 5; j++){ 
               System.out.print("P" + i + ":" + topic[j] + ":");
               int x = scnr.nextInt();
               responses[j][x] = responses[j][x] + 1;
           }
           i++;
       }
       
       System.out.println("Topic" + "        " + "Total_Rating" + "        " + "Avg_Rating");
       int max_p = 0, min_p = 1000, max_topic = 0, min_topic = 0;
       
       for(i = 0; i < 5; i++){
           int total = 0,count = 0;
           
           for(int j = 1; j <= 10; j++){
               total = total + j * responses[i][j];
               count = count + responses[i][j];
           }
           if(max_p < total){  
               max_p = total;
               max_topic = i;
           }
           if(min_p > total){  
               min_p = total;
               min_topic = i;
           }
           System.out.println(topic[i] + "       " + total + "                  " + (total+0.0) / count);
       }
       System.out.println("Max_Point_Topic" + "   " + "Total_Rating");
       System.out.println(topic[max_topic] + "            " + max_p);
       System.out.println("Min_Point_Topic" + "   " + "Total_Rating");
       System.out.println(topic[min_topic] + "            " + min_p);
   }
}