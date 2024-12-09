package gr.aueb.cf.practice;

public class EmojiCounter {
    public static void main(String[] args) {
        int emojiStart = 0x1F600, emojiEnd = 0x1F64F, counter = 0, emoji;

        emoji = emojiStart;
        while (emoji < emojiEnd){
            System.out.print(Character.toChars(emoji));
            System.out.print(" ");
            emoji++;
            counter++;
            if (counter % 16 == 0){
                System.out.println();
            }

        }
    }
}
