package KOUSHIK;

public class QuestionsData {

    QuizeRequirement  question[] = new  QuizeRequirement[5];






    public void Questions(){

        question [0] = new QuizeRequirement(1,"when was java invented","1995",
                "1996","1994","1999","1995");
        question[1] = new QuizeRequirement(2, "What is the capital of France", "Paris",
                "Berlin", "London", "Madrid", "Paris");
        question[2] = new QuizeRequirement(3, "Which programming language is known as the 'mother of all languages'",
                "C",
                "Java", "Assembly", "Python", "C");
        question[3] = new QuizeRequirement(4, "What is the largest planet in our solar system", "Mars",
                "Jupiter", "Earth", "Saturn", "Jupiter");
        question[4] = new QuizeRequirement(5, "Who wrote 'Romeo and Juliet'", "Charles Dickens",
                "William Shakespeare", "Jane Austen", "Mark Twain", "William Shakespeare");




    }



}
