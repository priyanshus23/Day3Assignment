package com.robomq.day3assignment;

import java.util.*;

public class AuthorDetails{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,AuthorSub> author=new TreeMap<Integer,AuthorSub>();    
		author.put(1,new AuthorSub(34,"Au1","Ad1","Book1"));
		author.put(2,new AuthorSub(23,"Au2","Ad2","Book2"));
		author.put(3,new AuthorSub(74,"Au3","Ad3","Book3"));
		author.put(4,new AuthorSub(36,"Au4","Ad4","Book4"));
		author.put(5,new AuthorSub(37,"Au1","Ad1","Book5"));
		author.put(6,new AuthorSub(88,"Au4","Ad4","Book6"));
		
		//System.out.println(author);
		
		Collection<AuthorSub> c = author.values();
		Iterator<AuthorSub> itr = c.iterator();
		
		while(itr.hasNext())
		{
			Iterator<AuthorSub> itr2= c.iterator();
			if(itr.equals(itr2))
				System.out.println(itr.next());
				
		}
		
	}

}
