package simple_array_command_prompt_input;

public class Main {

    public static JustArray justArray = new JustArray();

    public static void main(String[] args) {
    int [] someArray = justArray.declareSomeArray(justArray.setArraySize());
    justArray.printSomeArray(someArray);

    String answer = justArray.findNumber(someArray,2);
    System.out.println(answer);

    }
}
