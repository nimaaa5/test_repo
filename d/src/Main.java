public class Main {
// this is an interface for checking it
    interface StringFunction{
        String run(String run);
    }

    public static void main(String[] args){
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hi", exclaim);
        printFormatted("Hey", exclaim);

    }

    private static void printFormatted(String hello, StringFunction format) {
        String result = format.run(hello);
        System.out.println(result);
    }


}

