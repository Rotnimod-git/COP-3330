import java.util.*;
class Poll{
   @SuppressWarnings("resource")
   // Sorry for the slopping printing --- not sure how to allign it while using a for loop. code would be a lot longer to allign
public static void main(String args[]){
       String[] topic={"Video Games","Social Media","Television","Sports","Education"}; 
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
       
       int i=1;
       while(i<=peoples){
           for(int j = 0; j < 5; j++){ 
               System.out.print("P" + i + ":" + topic[j] + ":");
               int x=scnr.nextInt();
               responses[j][x]=responses[j][x]+1;
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

// import java.util.Scanner;

/*
5 topics --- 1(least important)-10(most important)
string
5-row, 10-column two-dimensional array responses(type of int)
	each row corresponds to an element in the topics array.
*/
/*
public class Poll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		double avgRating;
		double mostPoints;
		double lowestPoints;
		int userAnswer;
		int i;
		String topic1;
		String topic2;
		String topic3;
		String topic4;
		String topic5;
		
		for(i=0; i<5; i++) {
			System.out.println("Help me ");
		}
		System.out.println("Enter topic 1: ");
		topic1 = scnr.next();
		System.out.println("Enter topic 2: ");
		topic2 = scnr.next();
		System.out.println("Enter topic 3: ");
		topic3 = scnr.next();
		System.out.println("Enter topic 4: ");
		topic4 = scnr.next();
		System.out.println("Enter topic 5: ");
		topic5 = scnr.next();
		
		System.out.println("Rate 1-10: " + topic1);
		userAnswer = scnr.nextInt();
		switch(userAnswer) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			default:
				System.out.println("Invalid entry.");
				break;
		}
		System.out.println("Rate 1-10: " + topic2);
		userAnswer = scnr.nextInt();
		switch(userAnswer) {
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			default:
				System.out.println("Invalid entry.");
				break;
		}
	}

}
*/