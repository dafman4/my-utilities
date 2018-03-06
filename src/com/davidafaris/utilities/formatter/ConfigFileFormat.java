/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.davidafaris.utilities.formatter;

import com.davidafaris.utilities.interfaces.Formatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Config file Format is used for a simple config file format option
 * It reads and encodes files that have individual lines based on the
 * key value pair Key=Value
 * Each line is it's own pair
 * this also provides the ability to comment areas in your properties file
 * using the # sign
 * 
 * 
 * @author David
 */
public class ConfigFileFormat implements Formatter{

	@Override
	public List<String> encode(Map<String,String> lines) {
		List<String> ret = new ArrayList<>();
		lines.keySet().forEach((s) -> {
			ret.add(s+"="+lines.get(s));
		});
		
		return ret;
	}

	@Override
	public Map<String,String> decode(List<String> lines) {
		Map<String,String> ret = new HashMap<>();
		for(String s: lines){
			String[] parts = s.split("=");
			for(String part :parts)
				System.out.println(part);
			if(parts[0].charAt(0) == '#')
				continue;
			ret.put(parts[0], parts[1]);
		}
		
		return ret;
	}

	@Override
	public String toString() {
		return "ConfigFileFormat instance";
	}

}
