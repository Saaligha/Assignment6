package Assignment6.domain;

public class Quiz {
    private String quizId, quizDescr, quizP;

    private Quiz(Builder builder) {
        this.quizId = builder.quizId;
        this.quizDescr = builder.quizDescr;
        this.quizP = builder.quizP;
    }

    public String getQuizId() {
        return quizId;
    }

    public String getQuizP() {
        return quizP;
    }

    public String getQuizDescr() {
        return quizDescr;
    }


    public static class Builder {
        private String quizId, quizDescr, quizP;

        public Builder QuizId(String quizId) {
            this.quizId = quizId;
            return this;
        }


        public Builder QuizDescr(String quizDescr) {
            this.quizDescr = quizDescr;
            return this;
        }


        public Builder QuizP(String quizP) {
            this.quizP = quizP;
            return this;
        }
        public Quiz build(){
            return new Quiz(this);
        }
    }
}