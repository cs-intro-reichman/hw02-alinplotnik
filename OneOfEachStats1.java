/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
    .מקבל מס למשל 5 כך שמתבצעים 5 ניסויים שונים שמדמים זוגות שמנסים להביא ילדים עד שיש להם ילד מכל מגדר
	.נשתמש בתוצאות הניסויים כדי לחשב מה ממוצע מס הילדים שיש לאותן משפחות בסוף
	.בנוסף נדפיס לכמה זוגות היו 2 ילדים, 3, ו4 או יותר
	.לבסוף נדפיס את המס הנפוץ ביותר של ילדים במשפחה (אם נקבל תיקו נדפיס את המס הראשון שקיבלנו) 
	.כמו קודם לכן, נניח שהסיוכיים לקבל בן או בת הוא 50\50
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int two = 0;
		int three = 0;
		int fourOrMore = 0;
		int totalSum = 0;
		
		String largest = "";
		
		
		for(int j=0; j < T; j++){                        // a loop that runs as much as the T we have got
		
			int childSum = 0;
			boolean isGirl = false;
		    boolean isBoy = false;
			
		    while(!isGirl || !isBoy){  // a loop that runs until we create a fam with kids of both genders
		    	double x = Math.random() ;
			   if ( x >= 0.5 ) {
			    	isGirl = true ;
		      	}
		    	else {
			    	isBoy = true ; 
			     }			   
				 childSum++;
		     }
			 
			    if (childSum == 2){         //sums how many families have each number of kids
			    	 two++;
			    }else if(childSum == 3){
			      three++;	 
			    }else if(childSum >= 4){
			  	      fourOrMore++;
			    }
				
				 totalSum += childSum;
				
				
		}
		                                            
		 if (two >= three && two >= fourOrMore) {        //finds the most common number of kids in one fam
            largest = "2.";
        } else if (three >= two && three >= fourOrMore) {
            largest = "3.";
        } else {
            largest = "4 or more.";
        }
		
		double average = (double)totalSum / T; 
		
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + two);
		System.out.println("Number of families with 3 children: " + three);
		System.out.println("Number of families with 4 or more children: " + fourOrMore);
		System.out.println("The most common number of children is " + largest);
				
	}
}
