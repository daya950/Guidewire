package servlet.infogain.fnol.model;

public class Question {
		private String questionParamName;
		private String ID;
		private String text;
		private String questionScoreID;
		private String answer;
		private String score;
		
		
		public String getQuestionParamName() {
			return questionParamName;
		}
		public void setQuestionParamName(String questionParamName) {
			this.questionParamName = questionParamName;
		}
		public String getID() {
			return ID;
		}
		public void setID(String iD) {
			ID = iD;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public String getQuestionScoreID() {
			return questionScoreID;
		}
		public void setQuestionScoreID(String questionScoreID) {
			this.questionScoreID = questionScoreID;
		}
		public String getAnswer() {
			return answer;
		}
		public void setAnswer(String answer) {
			this.answer = answer;
		}
		public String getScore() {
			return score;
		}
		public void setScore(String score) {
			this.score = score;
		}	

}
