import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String partyAffiliation
        String partyAffiliation;
        //Output "What is your party affiliation, please input R/D/I"
        System.out.println("What is your party affiliation, please input R/D/I");
        if(input.hasNextLine()){
            //input partyAffiliation
            partyAffiliation = input.nextLine();
            //if partyAffiliation == "D" then
                //Output "You get the Democratic Donkey"
            if(partyAffiliation.equals("D")){
                System.out.println("You get the Democratic Donkey");

            }
            //else if partyAffiliation == "R" then
                //Output "You get the Republican Elephant"
            else if(partyAffiliation.equals("R")){
                System.out.println("You get the Republican Elephant");
            }
            //else if partyAffiliation == "I" then
                //Output "You get the Independent Man"
            else if(partyAffiliation.equals("I")){
                System.out.println("You get the Independent Man");
            }
            //else
                //Output "You get other"
            else{
                System.out.println("You get other");
            }

    }}

}
