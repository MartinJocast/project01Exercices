package fr.formation.inti.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;


public class UtilCollec {

	public static void main(String[] args ) {
		
		System.out.println("----------methodList----------");
		methodList();
		System.out.println("----------methodSet----------");
		methodSet();
		System.out.println("----------methodMap----------");
		methodMap();
		System.out.println("----------methodCollection----------");
		methodCollection();
		
	}

	public static void methodCollection() {
		Collection<String> col = new Vector<String>();
		col.add("test");
		col.add("test2");
		col.add("test");
		col.add(null);
		col.add(null);
		
		Iterator<String> ite = col.iterator();
		while(ite.hasNext()) {
			String str = ite.next();
			System.out.println(str);
		}
		
	}
	
	public static void methodMap() {
		Map<String, Integer> tabMap = new HashMap<String, Integer>();
		tabMap.put("Gauthier", 24);
		tabMap.put("Thibaut", 23);
		tabMap.put("Damien", 29);
		System.out.println(tabMap.toString());

	}
	
	public static void methodList() {
		List<Integer> tabList = new ArrayList<Integer>();
		Integer a = new Integer(15);
		tabList.add(a);
		tabList.add(null);
		tabList.add(1);
		tabList.add(a);
		tabList.add(null);
		tabList.add(1, 99); // methode ajoute l'element 99 a l'index 0
		
		tabList.remove(2);
		
		System.out.println("contains a : "+tabList.contains(a));
		
		int lastIndex = tabList.lastIndexOf(a);
		System.out.println("last index of a : "+tabList.lastIndexOf(a));
		
		System.out.println("size of List : "+tabList.size());
	
		for(Integer i : tabList) {
			System.out.println(i);
		}
	}
	
	public static void methodSet() {
		
		Set<String> tabSet = new HashSet<String>();
		tabSet.add("test");
		tabSet.add(null);
		tabSet.add("nom 1");
		tabSet.add("nom 2");
		tabSet.add(null);
		
		System.out.println("size tabSet : "+tabSet.size());
		for(String var : tabSet) {
			System.out.println(var);
		}

	}
}
