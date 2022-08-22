package com.example.adventuregamesecondtry;

public class Dice {
        public int totalOne;
        public int totalTwo;
        public int dieOne;
        public int dieTwo;
        public int dieThree;

        public Dice() {
                roll();
        }

        public static void roll() {
                int dieOne = (int) (Math.random() * 6) + 1;
                int dieTwo = (int) (Math.random() * 6) + 1;
                int dieThree = (int) (Math.random() * 6) + 1;
        }

        public int getDieOne() {
                return dieOne;
        }

        public int getDieTwo() {
                return dieTwo;
        }

        public int getDieThree() {
                return dieThree;
        }


        public int getTotalOne() {
                totalOne = dieOne + dieTwo + dieThree;
                return totalOne;
        }

        public int getTotalTwo() {
                totalTwo = dieOne + dieTwo;
                return totalTwo;
        }

        public void DiceRoll() {
                for (int i = 1; i <= 3; i++) {
                        int randomDieNum1 = ((int) (Math.random() * 100) % 1 + 6);
                        int randomDieNum2 = ((int) (Math.random() * 100) % 1 + 6);
                        int total = randomDieNum1 + randomDieNum2;
                }
        }
}