package turing;
/*
  <sentence> ::= <simple_sentence> [ <conjunction> <sentence> ]

<simple_sentence> ::= <noun_phrase> <verb_phrase>

<noun_phrase> ::= <proper_noun> |
<determiner> [ <adjective> ]. <common_noun> [ who <verb_phrase> ]

<verb_phrase> ::= <intransitive_verb> |
<transitive_verb> <noun_phrase> |
is <adjective> |
believes that <simple_sentence>

<conjunction> ::= and | or | but | because

<proper_noun> ::= Fred | Jane | Richard Nixon | Miss America

<common_noun> ::= man | woman | fish | elephant | unicorn

<determiner> ::= a | the | every | some

<adjective> ::= big | tiny | pretty | bald

<intransitive_verb> ::= runs | jumps | talks | sleeps

<transitive_verb> ::= loves | hates | sees | knows | looks for | finds
*/


import java.util.ArrayList;
import java.util.List;

public class SimpleRandomSentences {

    public static class RecursiveSyntax {

        private static final String[] conjunction = {"and", "or", "but", "because"};
        private static final String[] properNoun = {"Fred", "Jane", "Richard Nixon", "Miss America"};
        private static final String[] commonNoun = {"man", "woman", "fish", "elephant", "unicorn"};
        private static final String[] determiner = {"a", "the", "every", "some"};
        private static final String[] adjective = {"big", "tiny", "pretty", "bald"};
        private static final String[] intransitiveVerb = {"runs", "jumps", "talks", "sleeps"};
        private static final String[] transitiveVerb = {"loves", "hates", "sees", "knows", "looks for", "finds"};

        public static void main(String[] args) {


            List<String[]> arrayList = new ArrayList<>();
            arrayList.add(conjunction);
            arrayList.add(properNoun);
            arrayList.add(commonNoun);
            arrayList.add(determiner);
            arrayList.add(adjective);
            arrayList.add(intransitiveVerb);
            arrayList.add(transitiveVerb);


            /**
             * The main routine prints out one random sentence every three
             * seconds, forever (or until the program is killed).
             */

            while (true) {
                sentence();
                System.out.println(".\n\n");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {

                }

            }

        }


        private static void sentence() {
            int c = (int) (Math.random() * conjunction.length);
            double x = Math.random();
            if (x < 0.2){
                simpleSentence();}
            else{
                sentence();}
            System.out.print(conjunction[c]);
        }


        private static void simpleSentence() {
            nounPhrase();
            verbPhrase();
        }


        private static void nounPhrase() {
            int pn = (int)(Math.random()*properNoun.length);
            System.out.print(" "+  properNoun[pn] + " ");
        }


        private static void verbPhrase() {
            int iv = (int)(Math.random()*intransitiveVerb.length);
            System.out.print(" " +  intransitiveVerb[iv]);

        }
    }
}