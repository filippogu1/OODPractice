package OODBasics;

import java.util.HashMap;
import java.util.Map;

public class EqualsAndHashcode {

    static class Poker {
        String color;
        String number;
        Poker(String color, String number) {
            this.color = color;
            this.number = number;
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) return true;
            if (!(other instanceof Poker)) return false;
            Poker otherP = (Poker)other;
            if (this.color.equals(otherP.color) && this.number.equals(otherP.number)) return true;
            else return false;
        }

        @Override
        public int hashCode() {
            int code = 0;
            for (char c : color.toCharArray()) code += (int)c * 3;
            for (char c : number.toCharArray()) code += (int)c * 5;
            return code;
        }

        @Override
        public String toString() {
            return color + " " + number;
        }
    }

    public static void main(String[] args) {
        Map<Poker, Integer> pokerMap = new HashMap<>();
        Poker[] deck = new Poker[]{
                                    new Poker("Club", "A"),
                                    new Poker("Heart", "A"),
                                    new Poker("Spade", "A"),
                                    new Poker("Diamond", "A"),
                                    new Poker("Club", "A")};

        for (Poker card : deck) {
            pokerMap.put(card, pokerMap.getOrDefault(card, 0) + 1);
        }

        for (Poker card : pokerMap.keySet()) {
            System.out.println(card.toString() + ", count is " + pokerMap.get(card));
        }
    }

}
