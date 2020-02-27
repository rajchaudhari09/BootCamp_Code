package test6;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class S_no2 {

	public static void main(String[] args) 
	{
		LinkedList<Integer> list1;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (sc.hasNext()) {
			list.add(sc.nextInt());
		}
		System.out.println(list);

		HashMap<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
		for (Integer integer : list) {
			System.out.println(integer);
			
			int slotNo = integer%11;
			System.out.println("Slot: "+slotNo);
			
			list1 = map.get(slotNo);
			if( list1 == null )
			{
				//System.out.println("Value is null");
				list1 = new LinkedList<Integer>();
				map.put(slotNo, list1);
			}
			
			//System.out.println("Value is not null");
			list1.add(integer);
		}
		System.out.println(map);
			
		System.out.println("Enter Number you want to search ");
		int num = sc.nextInt();
		int SlotNumber= num%11;
		//map1.get(SlotNumber);
		
		list1 = map.get(SlotNumber);
		System.out.println(list);
		if(list.contains(num))
		{
			
		}
		else
		{
			System.out.println(num+" is not present \nshould be push");
			list1.add(num);
		}
		System.out.println(map);
	}
}