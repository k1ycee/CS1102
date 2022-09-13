package com.company;

 /**

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

        This program implements these rules to generate random sentences.
        */


public class SimpleRandomSentences {

    static final String[] conjuction = {"and", "or", "but", "because"};
    static final String[] proper_noun = {"Fred", "Jane", "Richard Nixon", "Miss America"};
    static final String[] common_noun = {"man", "woman", "fish", "elephant", "unicorn"};
    static final String[] determiner = {"a", "the", "every", "some"};
    static final String[] adjective = {"big", "tiny", "pretty", "bald"};
    static final String[] intransitive_verb = {"runs", "jumps", "talks", "sleeps"};
    static final String[] transitive_verbs = {"loves", "hates", "sees", "knows", "looks for", "finds"};


    public static void main(String[] args) {
        while (true) {
            randomSentence();
            System.out.println(".\n\n");
            try {
                Thread.sleep(3000);
            }
            catch (InterruptedException e) {
            }
        }
    }

    static void randomSimpleSentence() {
//        if (Math.random() > 0.2){
            randomNounPhrase();
            randomVerbPhrase();
//        }
    }

     static void randomSentence() {
         int cj = (int)(Math.random()*conjuction.length);
         randomSimpleSentence();
         if (Math.random() > 0.2){
             System.out.println(" "+cj);
             randomSentence();
         }
     }


    static void randomNounPhrase() {
        int pn = (int)(Math.random()*proper_noun.length);
        int cn = (int)(Math.random()*common_noun.length);
        int det = (int)(Math.random()*determiner.length);
        int ad = (int)(Math.random()*adjective.length);

        System.out.print(proper_noun[pn] + determiner[det]);
        if (Math.random() > 0.75)
            System.out.print(" " + adjective[ad]);
        System.out.print("." + common_noun[cn] + " ");
        if (Math.random() > 0.5)
            randomNounPhrase();
    }


    static void randomVerbPhrase(){
        int tv = (int)(Math.random()*transitive_verbs.length);
        int iv = (int)(Math.random()*intransitive_verb.length);
        int ad = (int)(Math.random()*adjective.length);
        System.out.print(transitive_verbs[tv] + intransitive_verb[iv]);
        randomNounPhrase();
        System.out.println("is" + adjective[ad] + "believes that");
        randomSimpleSentence();
    }

}