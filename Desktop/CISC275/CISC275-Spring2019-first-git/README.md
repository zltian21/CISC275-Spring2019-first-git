# CISC275-Fall2018-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?

The five Objects in main are: Three Dog objects, One Dog ArrayList, and One Animal Comparator

3. Can you spot the comparator constructor call? Where is the class definition for the comparator?
THe comparator constructor is at "new Comparator<Animal>()"
The class definition is right after the constructor call, which is
    	  	     
		     @Override
    	  	     public int compare(Animal a, Animal b){
		     	    		       
			 return a.getLegs() - b.getLegs();
							    	   	           
		     }