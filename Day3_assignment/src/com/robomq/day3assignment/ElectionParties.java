package com.robomq.day3assignment;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
//import java.util.TreeSet;

public class ElectionParties {
	 public void Details(TreeMap<String,ElectionPartiesDetails> det) {
		 Collection<ElectionPartiesDetails> c = det.values();
			Iterator<ElectionPartiesDetails> itr = c.iterator();
			
			while(itr.hasNext())
			{
				Iterator<ElectionPartiesDetails> itr2= c.iterator();
				if(itr.equals(itr2))
					System.out.println(itr.next());
					
			}
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,ElectionPartiesDetails> elect =new TreeMap<String,ElectionPartiesDetails>();
		elect.put("na2",new ElectionPartiesDetails(1,"na1","10-08-1998","Dis1","Cons1","17-09-1998"));
		elect.put("na3",new ElectionPartiesDetails(2,"na2","12-08-1998","Dis1","Cons2","15-09-1998"));
		elect.put("na1",new ElectionPartiesDetails(3,"na3","14-08-1998","Dis2","Cons1","16-09-1998"));
		elect.put("na4",new ElectionPartiesDetails(4,"na4","15-08-1998","Dis1","Cons2","27-09-1998"));
		elect.put("na4",new ElectionPartiesDetails(5,"na5","12-08-1998","Dis5","Cons1","13-09-1998"));
		elect.put("na5",new ElectionPartiesDetails(6,"na6","22-08-1998","Dis5","Cons2","09-09-1998"));
		elect.put("na6",new ElectionPartiesDetails(7,"na7","01-08-1998","Dis2","Cons1","30-09-1998"));
		elect.put("na1",new ElectionPartiesDetails(8,"na8","10-08-1998","Dis1","Cons2","10-09-1998"));
		
		
		
	}

}
