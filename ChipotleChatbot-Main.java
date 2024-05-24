import java.util.Scanner; //allows use of scanner class

class Main {
  public static void main(String[] args) {

    MyPanel thePanel = new MyPanel();
    
    Scanner in = new Scanner(System.in);

    //create a chatterbot object
    ChatterBot chatty = new ChatterBot();
    System.out.println(chatty.askName());
    String statement = in.nextLine(); 
    //nextLine() gets it as a string
    //nextInt() saves it as an integer
    
    chatty.setName(statement); 
    //calls the setName() method and response is the argument
    // System.out.println(chatty.askAge());
    // int answer = in.nextInt();
    // chatty.setAge(answer);
    
   
    
    //System.out.println(chatty.getAge());

    System.out.println("\n Hello " + chatty.getName() + ", " + chatty.intro());

    boolean exit = false;
    while(!exit){
      String theResponse = in.nextLine();
      if(theResponse.contains("bye") || theResponse.contains("Bye") || theResponse.contains("bye!") || theResponse.contains("Bye!")){
        exit = true;
        System.out.println("\nSee you later! If you have another question, need more info, or simply want to just chat about our delicious options, hit me up. Until then, keep spreading those good vibes like our famous Chipotle Sauce!\n");
        System.exit(0);
      }
      else{
        chatty.userInput(theResponse);
      }
    }
    in.close();
  }
    
}