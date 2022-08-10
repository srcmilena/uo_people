package unit_05.ProgrammingAssignment;

import static unit_05.ProgrammingAssignment.MultipleChoiceQuestion.showResults;

public class Quiz {

    public static void main(String[] args) {

        Question question = new TrueFalseQuestion ("Java is an object-oriented language. (y/n)", "y");
        question.check();

        question = new TrueFalseQuestion ("HTML is a style language. (y/n)", "n");
        question.check();

        question = new TrueFalseQuestion ("CSS is known as a programming language. (y/n)", "n");
        question.check();

        question = new TrueFalseQuestion ("JavaScript is a compiled programming language. (y/n)", "n");
        question.check();

        question = new TrueFalseQuestion ("SQL is a language for relational databases. (y/n)", "y");
        question.check();

        Question questionA = new MultipleChoiceQuestion (
                "What is the correct name of NASA's space telescope?",
                "James World",
                "James Hubble",
                "James Webb",
                "SpaceX James",
                "Hubble Space",
                "c"
        );
        questionA.check();
        questionA.showResults();

        Question questionB = new MultipleChoiceQuestion (
                "When will the 2022 World Cup begin?",
                "August",
                "November",
                "October",
                "September",
                "December",
                "b"
        );
        questionB.check();
        questionB.showResults();

        Question questionC = new MultipleChoiceQuestion (
                "Who is Lewis Hamilton?",
                "A pilot",
                "A singer",
                "A famous professor",
                "A videogame player",
                "A musician",
                "a"
        );
        questionC.check();
        questionC.showResults();

        Question questionD = new MultipleChoiceQuestion (
                "Where is Brazil?",
                "Europe",
                "Asia",
                "Oceania",
                "North America",
                "Latin America",
                "e"
        );
        questionD.check();
        questionD.showResults();

        Question questionE = new MultipleChoiceQuestion (
                "What is TikTok?",
                "Clock sound",
                "Candy brand",
                "Name of a car",
                "Social media",
                "A song",
                "d"
        );
        questionE.check();
        questionE.showResults();
    }
}