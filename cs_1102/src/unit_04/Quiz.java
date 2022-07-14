package unit_04;

import static unit_04.MultipleChoiceQuestion.showResults;

public class Quiz {

    public static void main(String[] args) {

        MultipleChoiceQuestion questionA = new MultipleChoiceQuestion(
                "What is a quiz?",
                "a test of knowledge, especially a brief informal test given to students",
                "42",
                "a duck",
                "to get to the other side",
                "To be or not to be, that is the question.",
                "a"
                //  the constructor call does not need the choice letters ("A"-"E") or newlines because the constructor adds those automatically

        );

        MultipleChoiceQuestion questionB = new MultipleChoiceQuestion(
                "When is a quiz?",
                "a long, long ago",
                "right now",
                "the best of times",
                "the worst of times",
                "nevermore",
                "b"
        );

        MultipleChoiceQuestion questionC = new MultipleChoiceQuestion(
                "Where is a quiz?",
                "a galaxy far, far away",
                "under the sea",
                "right here",
                "there and back again",
                "the other side of the mountain",
                "c"
        );

        MultipleChoiceQuestion questionD = new MultipleChoiceQuestion(
                "Where is Brazil?",
                "Europe",
                "Asia",
                "Oceania",
                "North America",
                "Latin America",
                "e"
        );

        MultipleChoiceQuestion questionE = new MultipleChoiceQuestion(
                "Who is Pelé?",
                "a player",
                "a singer",
                "a president",
                "a developer",
                "a gamer",
                "a"
        );

        showResults();
    }
}