package _13.RegularExpression.in.SpringEL.with.XML;

public class Lists {

	private String mapMember;
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
