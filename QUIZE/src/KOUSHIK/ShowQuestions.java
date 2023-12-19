package KOUSHIK;

import java.util.Scanner;

public class ShowQuestions  extends  QuestionsData {
    private String Answer[] = new String[5];

    public String[] getAnswer() {
        return Answer;

    }

    public void setAnswer(String[] answer) {
        Answer = answer;
    }

    @Override

    public void Questions() {
        super.Questions();
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to quize competition");
        for (int i = 0; i < question.length; i++) {
            System.out.println(i + 1 + " " + question[i].getQuestion());
            System.out.println("option 1 " + question[i].getOption1());
            System.out.println("option 2 " + question[i].getOption2());
            System.out.println("option 1 " + question[i].getOption3());
            System.out.println("option 1 " + question[i].getOption4());
            Answer[i] = sc.next();
        }
    }











}





