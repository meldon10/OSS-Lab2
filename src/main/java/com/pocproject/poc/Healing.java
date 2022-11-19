package com.pocproject.poc;
import java.util.*;



public class Healing {
    
    Map<String,Map<String,List<String>>> beforeHealing = new HashMap<>();

	void createBeforeHealingDataMap(String systemName, String selectedInstanceName, String field) {
	System.out.println("beforeHealing.containsKey(systemName) "+beforeHealing.containsKey(systemName));
	if(beforeHealing.containsKey(systemName)){
		System.out.println("beforeHealing.get(systemName).containsKey(selectedInstanceName) "+beforeHealing.get(systemName).containsKey(selectedInstanceName));
		
		System.out.println("!(beforeHealing.get(systemName).get(selectedInstanceName).contains(field)) "+ !(beforeHealing.get(systemName).get(selectedInstanceName).contains(field)));
		
		if(beforeHealing.get(systemName).containsKey(selectedInstanceName) && !(beforeHealing.get(systemName).get(selectedInstanceName).contains(field))){
			beforeHealing.get(systemName).get(selectedInstanceName).add(field);
		}else if(!(beforeHealing.get(systemName).containsKey(selectedInstanceName))){
			List<String> beforeHealingInstanceNames = new ArrayList<>();
			beforeHealingInstanceNames.add(field);
			beforeHealing.get(systemName).put(selectedInstanceName,beforeHealingInstanceNames);
		}
	}else{
		Map<String,List<String>> beforeHealingMap = new HashMap<>();
		List<String> beforeHealingInstanceNames = new ArrayList<>();
		beforeHealingInstanceNames.add(field);
		beforeHealingMap.put(selectedInstanceName,beforeHealingInstanceNames);
		beforeHealing.put(systemName,beforeHealingMap);
	
	}
    }
}
