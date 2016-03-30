package PolymorphismLab01;
import java.util.*;
import java.util.Scanner;

/**
 * Created by rogi on 2/2/16.
 */
public class PetApp {
    int numPets;
    ArrayList<String> petNames1 = new ArrayList<String>();

    public void displayPetNames(ArrayList petName, int noOfPets){
        System.out.println("Your Pets are : ");

        for (int j = 0; j< noOfPets; j++){

            System.out.println(petName.set(j, petName.get(j)));
        }

    }


    public static void main(String[] args) {
        PetApp petApp = new PetApp();
        ArrayList<String> petNames = new ArrayList<String>();

        Scanner sn = new Scanner(System.in);
        System.out.println("How many pets do you have : ");
        int numOfPets = sn.nextInt();

        for (int i = 0; i < numOfPets; i++){
            System.out.println("Pet name " + (i + 1) + " is : ");
           petNames.add(sn.next());
        }

        petApp.displayPetNames(petNames,numOfPets);




    }




}
