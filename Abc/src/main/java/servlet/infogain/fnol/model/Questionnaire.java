package servlet.infogain.fnol.model;

import java.util.List;

public class Questionnaire {

	private String evaluationVersion;
	
	protected List<Question> questionsList;
	
	public String getEvaluationVersion() {
		return evaluationVersion;
	}
	public void setEvaluationVersion(String _evaluationVersion) {
		evaluationVersion = _evaluationVersion;
	}
	
	public List<Question> getQuestionsList() {
		return questionsList;
	}
	public void setQuestionsList(List<Question> questionsList) {
		this.questionsList = questionsList;
	}

}