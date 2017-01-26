package _15.ExpressionParser.in.SpringEL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("sourceBean")
public class Source {

	private Map<String, String> map;
	private List<String> list;
	private String email;
	
	public Source() {
		
		setEmail("furkan.suglun@gmail.com");
		
		map = new HashMap<String,String>();
		map.put("Furkan Süðlün" , "furkan@gmail.com");
		map.put("Emin Erdar", "emin@hotmail.com");
		map.put("Emre Yýlmaz" , "emre@yandex.com");
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
