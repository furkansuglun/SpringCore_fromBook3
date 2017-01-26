package _14.RegularExpression.in.SpringEL.with.Annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("listsBean")
public class Lists {

	@Value("#{sourceBean.map['Furkan Süðlün']}")
	private String mapMember;
	@Value("#{sourceBean.list[0]}")
	private String listMember;
	
	
	public String getMapMember() {
		return mapMember;
	}

	public void setMapMember(String mapMember) {
		this.mapMember = mapMember;
	}

	public String getListMember() {
		return listMember;
	}

	public void setListMember(String listMember) {
		this.listMember = listMember;
	}


	@Override
	public String toString() {
		return "Selected map member : " + mapMember + "\n" +
				"Selected list member : " + listMember;
	}
	
	
	
	
}
