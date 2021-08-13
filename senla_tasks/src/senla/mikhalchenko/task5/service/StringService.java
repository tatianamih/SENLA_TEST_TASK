package senla.mikhalchenko.task5.service;

public class StringService {
    public void printTheWordsAndTheNumberOfVowels(String str) {
        String[] words = getArrayByDelimiter(str);
        for (String word : words) {
            int vowels = getNumberOfVowels(word);
            System.out.println("Word '" + word + "' has " + vowels + " vowels.");
        }
    }

    public String[] getArrayByDelimiter(String str) {
        return str.split(" ");
    }

    private int getNumberOfVowels(String str) {
        String vowelString = "AEIOUYaeiouyУуЕеЫыАаОоЯяЭэИиЮю";
        int counter = 0;
        char[] wordChars = wordDivider(str);
        for (char ch : wordChars) {
            if (vowelString.contains(String.valueOf(ch))) {
                counter++;
            }
        }
        return counter;
    }

    private char[] wordDivider(String word) {
        return word.toCharArray();
    }

    private int[] findTheNumberOfVowels(String str) {
        int i = 0;
        String[] words = getArrayByDelimiter(str);
        int[] numberArray = new int[words.length];
        for (String word : words) {
            int vowels = getNumberOfVowels(word);
            numberArray[i] = vowels;
            i++;
        }
        return numberArray;
    }


    public void printWordsSortedByNumberOfVowels(String str) {
        String[] words = getArrayByDelimiter(str);
        int[] numberOfVowels = findTheNumberOfVowels(str);
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < numberOfVowels.length; j++) {
                int itmp;
                String stmp;
                if (numberOfVowels[i] > numberOfVowels[j]) {
                    itmp = numberOfVowels[i];
                    numberOfVowels[i] = numberOfVowels[j];
                    numberOfVowels[j] = itmp;
                    stmp = words[i];
                    words[i] = words[j];
                    words[j] = stmp;
                }
            }
        }
        System.out.println("Sorting by the number of vowel letters is ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i] + " - " + numberOfVowels[i]);
        }
    }

    public void toUpperCaseForFirstVowelLetter(String str) {
        String[] words = getArrayByDelimiter(str);
        int[] indexOfFirstVowel = indexOfVowelsForUpperCase(words);
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].substring(0, indexOfFirstVowel[i]) +
                    words[i].substring(indexOfFirstVowel[i], indexOfFirstVowel[i] + 1).toUpperCase() +
                    words[i].substring(indexOfFirstVowel[i] + 1, words[i].length()) + " ");
        }
    }

    public int[] indexOfVowelsForUpperCase(String[] words) {
        int index;
        int[] indexOfFirstVowelsInAWord = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if ("AEIOUYaeiouyУуЕеЫыАаОоЯяЭэИиЮю".indexOf(words[i].charAt(j)) > -1) {
                    index = j;
                    indexOfFirstVowelsInAWord[i] = index;
                    break;
                }
            }
        }
        return indexOfFirstVowelsInAWord;
    }
 }
