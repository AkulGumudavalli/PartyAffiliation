import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your party affiliation, please input R/D/I");
        String partyAffiliation;
        if(input.hasNextLine()){
            partyAffiliation = input.nextLine();
            if(partyAffiliation.equals("D")){
                System.out.println("You get the Democratic Donkey");
            }else if(partyAffiliation.equals("R")){
                System.out.println("You get the Republican Elephant");
            }else if(partyAffiliation.equals("I")){
                System.out.println("You get the Independent Man");
            }else{
                System.out.println("You get other");
            }

    }}

}
