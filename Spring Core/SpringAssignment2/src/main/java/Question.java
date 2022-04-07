import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	private int questionid;
	private String question;
	private List<String>Answer;
	private Set<String>Ans1;
	private Map<Integer , String>Ans2;
	
	
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswer() {
		return Answer;
	}
	public void setAnswer(List<String> answer) {
		Answer = answer;
	}
	public Set<String> getAns1() {
		return Ans1;
	}
	public void setAns1(Set<String> ans1) {
		Ans1 = ans1;
	}
	public Map<Integer, String> getAns2() {
		return Ans2;
	}
	public void setAns2(Map<Integer, String> ans2) {
		Ans2 = ans2;
	}
	
	public void ListDisplay() {
		System.out.println("questionId:"+ getQuestionid()+"Question:" +getQuestion() + "Answer:" +getAnswer()  );
	}
	public void SetDisplay() {
		System.out.println("questionId:"+ getQuestionid()+"Question:" +getQuestion() + "Answer:" +getAns1()  );
	}
	
	public void MapDisplay() {
		System.out.println("questionId:"+ getQuestionid()+"Question:" +getQuestion() + "Answer:" +getAns2()  );
	}
	
}