package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl 
{
	@Autowired
	private SortAlgorithm sortAlgorithm;

	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// Search the array
		return 7;
	}
	
	//We can use constructor Injection or Setter Injection 
	//by default is Setter Injection
	
	/**
	 * @param sortAlgorithm
	 * Constructor Injection
	 */
	/*
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	*/

	/**
	 * @param sortAlgorithm the sortAlgorithm to set
	 * Setter Injection
	 */
	/*
	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
	*/
	
}