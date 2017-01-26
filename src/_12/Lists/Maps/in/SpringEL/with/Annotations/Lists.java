package _12.Lists.Maps.in.SpringEL.with.Annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("listsBean")
public class Lists {

	@Value("#{sourceBean.map['Java']}")
	private String mapMember;
	@Value("#{sourceBean.list[2]}")
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
