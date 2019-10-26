package com.sda.general.ex04;


public class RemovePolishSigns {

    public String reverseFromPolishToEnglish(String text) {

        String result = text.replace("ą", "a").replace("ę", "e").replace("ó", "o")
                .replace("ł", "l").replace("ń", "n").replace("ż", "z").replace("ć", "c");

        return result;

    }

    public String reverseFromPolishToEnglishbySwitch(String text) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case 'ó':
                    stringBuilder.append('o');
                    break;
                case 'ż':
                    stringBuilder.append('z');
                    break;
                case 'ł':
                    stringBuilder.append('l');
                    break;
                case 'ć':
                    stringBuilder.append('c');
                    break;
                default:
                    stringBuilder.append(text.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

}
