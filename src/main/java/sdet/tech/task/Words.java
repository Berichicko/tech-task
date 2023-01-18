package sdet.tech.task;

public class Words {
    public static String getFirstThreeWordsTitle(String title) {
        if (title == null) {
            return "Title is null";
        }
        title = title.trim();
        if (title.length() == 0) {
            return "Title is empty";
        }

        String[] words = title.split(" ");
        String resultString = "";

        for (int i = 0; i < words.length; i++) {
            resultString += words[i] + " ";

            if (resultString.length() > Constants.MAX_VALUE) {
                return resultString.trim() + Constants.ELLIPSIS;
            }
        }
        return resultString.trim();
    }
}
