import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by franc on 15/10/2017.
 */
public class Main {

    public static void main(String[] args) {
        //Get responses
        String fileName = "sorting.tsv";
        File file = new File(fileName);
        List<List<String>> responses = new ArrayList<>();
        Scanner inputStream;

        try{
            inputStream = new Scanner(file);
            while (inputStream.hasNext()){
                String response = inputStream.nextLine();
                String[] values = response.split("[\t]");
                responses.add(Arrays.asList(values));
            }
            inputStream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        responses.remove(0);

        //Write results
        try{
            PrintWriter pw = new PrintWriter(new File("results.csv"));
            StringBuilder heading = new StringBuilder();
            heading.append("Name");
            heading.append(",");
            heading.append("Email");
            heading.append(",");
            heading.append("Membership");
            heading.append(",");
            heading.append("Choice");
            heading.append(",");
            heading.append("Result");
            heading.append(",");
            heading.append("% Gryffindor");
            heading.append(",");
            heading.append("% Slytherin");
            heading.append(",");
            heading.append("% Ravenclaw");
            heading.append(",");
            heading.append("% Hufflepuff");
            heading.append(",");
            heading.append("% Other");
            heading.append("\n");
            pw.write(heading.toString());
            for (List<String> response: responses) {
                StringBuilder results = new StringBuilder();
                results.append(response.get(2)); //Name
                results.append(",");
                results.append(response.get(1)); //Email
                results.append(",");
                results.append(response.get(3)); //Membership
                results.append(",");
                results.append(response.get(4)); //Choice
                results.append(",");

                //Results
                int[] houses = {0, 0, 0, 0, 0};
                //Question 1
                String answer = response.get(5);
                switch (answer) {
                    case "Butterbeer":
                        houses[2]++;
                        break;
                    case "Firewhiskey":
                        houses[0]++;
                        break;
                    case "Gigglewater":
                        houses[3]++;
                        break;
                    case "Water, Father will turn it into rum":
                        houses[1]++;
                        break;
                    case "Just a water":
                        houses[4]++;
                        break;
                }
                //Question 2
                answer = response.get(6);
                switch (answer) {
                    case "Dragon Heartstring":
                        houses[1]++;
                        break;
                    case "Unicorn Tail Hair":
                        houses[3]++;
                        break;
                    case "Thestral Hair":
                        houses[2]++;
                        break;
                    case "Phoenix Feather":
                        houses[0]++;
                        break;
                    case "Troll Hair":
                        houses[4]++;
                        break;
                }
                //Question 3
                answer = response.get(7);
                switch (answer) {
                    case "Pewter":
                        houses[2]++;
                        break;
                    case "Copper":
                        houses[3]++;
                        break;
                    case "Brass":
                        houses[4]++;
                        break;
                    case "Silver":
                        houses[1]++;
                        break;
                    case "Solid Gold":
                        houses[0]++;
                        break;
                }
                //Question 4
                answer = response.get(8);
                switch (answer) {
                    case "Owl":
                        houses[2]++;
                        break;
                    case "Cat":
                        houses[0]++;
                        break;
                    case "Toad":
                        houses[3]++;
                        break;
                    case "Rat":
                        houses[1]++;
                        break;
                    case "Dog":
                        houses[4]++;
                        break;
                }
                //Question 5
                answer = response.get(9);
                switch (answer) {
                    case "Weasley's Wizarding Wheezes":
                        houses[1]++;
                        break;
                    case "Florean Fortescue's Ice Cream Parlour":
                        houses[3]++;
                        break;
                    case "Florish and Blotts":
                        houses[2]++;
                        break;
                    case "Quality Quidditch Supplies":
                        houses[0]++;
                        break;
                    case "Boots Cosmetics":
                        houses[4]++;
                        break;
                }
                //Question 6
                answer = response.get(10);
                switch (answer) {
                    case "Hippogriff":
                        houses[0]++;
                        break;
                    case "Basilisk":
                        houses[1]++;
                        break;
                    case "Niffler":
                        houses[3]++;
                        break;
                    case "Unicorn":
                        houses[2]++;
                        break;
                    case "Owl":
                        houses[4]++;
                        break;
                }
                //Question 7
                answer = response.get(11);
                switch (answer) {
                    case "Polyjuice Potion":
                        houses[0]++;
                        break;
                    case "Veritaserum":
                        houses[2]++;
                        break;
                    case "Draught of Peace":
                        houses[3]++;
                        break;
                    case "Draught of Living Death":
                        houses[1]++;
                        break;
                    case "Bubble Juice":
                        houses[4]++;
                        break;
                }
                //Question 8
                answer = response.get(12);
                switch (answer) {
                    case "You binge eat, cry and tell yourself you'll just try your hardest":
                        houses[3]++;
                        break;
                    case "You set up camp in the library, read everything you can and cry":
                        houses[2]++;
                        break;
                    case "You selectively learn only what you need to know, realise there's more than you thought, oh and now you're crying - not that you'll let anyone see of course":
                        houses[1]++;
                        break;
                    case "You cram everything the night before, get zero sleep and you're not crying, of course your not, you're fine..":
                        houses[0]++;
                        break;
                    case "You calmly prepare and are totally relaxed about everything":
                        houses[4]++;
                        break;
                }
                //Question 9
                answer = response.get(13);
                switch (answer) {
                    case "Wizard's Chess":
                        houses[2]++;
                        break;
                    case "Exploding Snap":
                        houses[1]++;
                        break;
                    case "Quidditch":
                        houses[0]++;
                        break;
                    case "Collecting Chocolate Frog Cards":
                        houses[3]++;
                        break;
                    case "Solitare":
                        houses[4]++;
                        break;
                }
                //Question 10
                answer = response.get(14);
                switch (answer) {
                    case "For the glory":
                        houses[1]++;
                        break;
                    case "To demonstrate your bravery":
                        houses[0]++;
                        break;
                    case "You've already completed all the assignments for the year so need something to keep you busy":
                        houses[2]++;
                        break;
                    case "Your friend entered and you didn't want them to have to go through it alone":
                        houses[3]++;
                        break;
                    case "You change your mind and don't enter the tournament after all":
                        houses[4]++;
                        break;
                }
                //Question 11
                answer = response.get(15);
                switch (answer) {
                    case "Swedish Short-Snout":
                        houses[2]++;
                        break;
                    case "Chinese Fireball":
                        houses[1]++;
                        break;
                    case "Hungarian Horntail":
                        houses[0]++;
                        break;
                    case "Welsh Green":
                        houses[3]++;
                        break;
                    case "Imagine Dragons":
                        houses[4]++;
                        break;
                }
                //Question 12
                answer = response.get(16);
                switch (answer) {
                    case "You ask your friends for help":
                        houses[3]++;
                        break;
                    case "You just relax as you have full faith in your abilities":
                        houses[0]++;
                        break;
                    case "You command one of your sidekicks to figure it out for you":
                        houses[1]++;
                        break;
                    case "You obtain scuba gear and learn how to scuba dive":
                        houses[4]++;
                        break;
                    case "You go and do research in the library":
                        houses[2]++;
                        break;
                }
                //Question 13
                answer = response.get(17);
                switch (answer) {
                    case "Auror":
                        houses[0]++;
                        break;
                    case "Healer":
                        houses[3]++;
                        break;
                    case "Hogwarts Professor":
                        houses[2]++;
                        break;
                    case "Unspeakable":
                        houses[1]++;
                        break;
                    case "Caretaker":
                        houses[4]++;
                        break;
                }
                //Question 14
                answer = response.get(18);
                switch (answer) {
                    case "Go to the Quidditch World Cup":
                        houses[0]++;
                        break;
                    case "Visit Romania to learn about dragons":
                        houses[2]++;
                        break;
                    case "Spend your time visiting your friends and extended family":
                        houses[3]++;
                        break;
                    case "Go camping":
                        houses[4]++;
                        break;
                    case "Visit the sites of famous battle scenes from throughout wizarding history to show your children where once powerful wizards triumphed or were defeated":
                        houses[1]++;
                        break;
                }
                //Question 15
                answer = response.get(19);
                switch (answer) {
                    case "Work hard, Hogwarts is the finest school of Witchcraft and Wizardry in the world and there's lots to be learnt":
                        houses[2]++;
                        break;
                    case "Follow in the footsteps of your family and make us proud":
                        houses[1]++;
                        break;
                    case "Get involved in as many opportunities as possible, you only go to Hogwarts once":
                        houses[0]++;
                        break;
                    case "Enjoy spending time with your fellow young witches and wizards, the friends you make at Hogwarts will be your friends for life":
                        houses[3]++;
                        break;
                    case "You aren't sending your kids to Hogwarts because you will not pay to have some crackpot old fool teach them magic tricks!":
                        houses[4]++;
                        break;
                }
                //Question 16
                answer = response.get(20);
                switch (answer) {
                    case "Add it to the huge collection in the family vault at Gringotts":
                        houses[1]++;
                        break;
                    case "Share it amongst your loved ones and donate it to those who are less fortunate":
                        houses[3]++;
                        break;
                    case "Donate it to Hogwarts so that future generations of witches and wizards may benefit from a better education":
                        houses[2]++;
                        break;
                    case "Give everything to your children to provide them with the best chance at achieving great things":
                        houses[0]++;
                        break;
                    case "Use your money to buy expensive items to use as horcruxes so you will never die and don't have to consider giving anything away":
                        houses[4]++;
                        break;
                }
                int index = 0;
                int max = Integer.MIN_VALUE;
                for (int i = 0; i < 4; i++) {
                    if (houses[i] > max) {
                        max = houses[i];
                        index = i;
                    }
                }
                String house = "";
                switch (index) {
                    case 0:
                        house = "Gryffindor";
                        break;
                    case 1:
                        house = "Slytherin";
                        break;
                    case 2:
                        house = "Ravenclaw";
                        break;
                    case 3:
                        house = "Hufflepuff";
                        break;
                    case 4:
                        house = "Other";
                        break;
                }
                results.append(house); //Results
                results.append(",");
                results.append(((double)houses[0]/16)*100); //% Gryffindor
                results.append(",");
                results.append(((double)houses[1]/16)*100); //% Slytherin
                results.append(",");
                results.append(((double)houses[2]/16)*100); //% Ravenclaw
                results.append(",");
                results.append(((double)houses[3]/16)*100); //% Hufflepuff
                results.append(",");
                results.append(((double)houses[4]/16)*100); //% Other
                results.append(",");
                results.append("\n");
                pw.write(results.toString());
            }
            pw.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
