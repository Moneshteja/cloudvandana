public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "IX";
        System.out.println(romanToInt(roman));
    }

    public static int romanToInt(String s) {
        int sum = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanCharToInt(s.charAt(i));
            if (currentValue < prevValue) {
                sum -= currentValue;
            } else {
                sum += currentValue;
            }
            prevValue = currentValue;
        }
        return sum;
    }

    public static int romanCharToInt(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
