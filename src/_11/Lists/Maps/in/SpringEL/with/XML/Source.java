package _11.Lists.Maps.in.SpringEL.with.XML;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Source {

	private Map<String, String> map;
	private List<String> list;
	
	public Source() {
		map = new HashMap<String,String>();
		map.put("Java", "Furkan Süðlün");
		map.put("C#", "ALi Akar");
		map.put("Python", "Veli Saðlam");
		
		list = new ArrayList<String>();
		list.add("Furkan Süðlün");
		list.add("Emin Erdar");
		list.add("Emre Yýlmaz");
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	
	
}
