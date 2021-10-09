public class Main {

    interface StringFunction{
        String run(String run);
    }

    public static void main(String[] args){
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hi", exclaim);
        printFormatted("Hi", exclaim);
    }

    private static void printFormatted(String hello, StringFunction format) {
        String result = format.run(hello);
        System.out.println(result);
    }


}

