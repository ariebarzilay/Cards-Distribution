package Cards_Distribution;

import java.util.Random;

public class Cards_Distribution {

    public static final int DECK_LENGTH = 10;
    public static final int CARDS_PER_VALUE = 4;
    public static final int HAND_SIZE = 5;
    public static final int PLAYER_COUNT = 4;

    public static void main(String[] args) {
        int[] deck = new int[DECK_LENGTH];
        for (int card = 0; card < DECK_LENGTH; card++) {
            deck[card] = CARDS_PER_VALUE;
        }

        int[][] playerHands = new int[PLAYER_COUNT][HAND_SIZE];
        for (int hand = 0; hand < HAND_SIZE; hand++) {
            for (int player = 0; player < PLAYER_COUNT; player++) {
                playerHands[player][hand] = -1;

            }
        }
        
        Random rand = new Random();
        //deal card
        for (int player = 0; player < PLAYER_COUNT; player++) {
            System.out.print("Player " + (player + 1) + " hand: ");
            for (int hand = 0; hand < HAND_SIZE; hand++) {

                int randCard;
                do {
                    randCard = rand.nextInt(DECK_LENGTH);

                } while (deck[randCard] == 0);

                playerHands[player][hand] = randCard;
                deck[randCard]--;       //deck[randCard] = deck[randCard] -1

                System.out.print(playerHands[player][hand] + " ");
            }
            System.out.println();
        }

        System.out.println("");

        System.out.println("Cards remaining:");
        System.out.print("Card:  ");
        for (int card = 0; card < DECK_LENGTH; card++) {
            System.out.print(card + " ");
        }
        System.out.println("");
        System.out.print("Count: ");
        for (int card = 0; card < DECK_LENGTH; card++) {
            System.out.print(deck[card] + " ");
        }
        System.out.println("");

    }

}
