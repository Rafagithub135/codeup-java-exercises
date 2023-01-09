package util;

public class Input {
    private class scanner{
        public static String getString(String prompt){
            return prompt;
        }
        boolean yesNo(boolean prompt){
            return true;
        }
        int getInt(int min, int max){
            return min;
        }
        int getInt(){
            return 0;
        }
        double getDouble(double min, double max){
            return 0;
        }
        double getDouble(){
            return 0;
        }

        public class InputTest {
            public static void main(String[] args) {
                Input input = new Input();
                System.out.println("Please enter a string: ");
                String userInput = scanner.getString();
                System.out.println("You entered: --> \"" + userInput + "\" <--");
            }
        }
    }
}
