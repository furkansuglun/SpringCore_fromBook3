package _17.Custom.Events.Handling;

public class Proverbs {

	private String sentence;

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
	
	public void write() {
		System.out.println(getSentence());
		System.out.println("F.S");
	}
	
	
}
