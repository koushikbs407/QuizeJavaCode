package KOUSHIK;

public class AnswerVerify  extends ShowQuestions{

     public void verify(){
         Questions();
         int marks = 0;
         for (int i = 0; i <question.length; i++) {
             if (getAnswer()[i].equalsIgnoreCase(question[i].getCorrectAnswer())) {
                 marks++;
             }else{
                 marks--;
             }
         }
         System.out.println("Marks: " + marks);



     }



     }


