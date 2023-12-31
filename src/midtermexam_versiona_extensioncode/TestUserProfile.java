/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author midwest
 */
import java.util.Scanner;

public class TestUserProfile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.println("Choose your favorite genre:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        System.out.print("Enter the number corresponding to your favorite genre: ");
        int genreChoice = scanner.nextInt();

        if (genreChoice >= 1 && genreChoice <= genres.length) {
            String chosenGenre = genres[genreChoice - 1];

            UserProfile userProfile = new UserProfile(userName, chosenGenre);
            System.out.println("User profile created successfully!");
            System.out.println("Name: " + userProfile.getUserID());
            System.out.println("Favorite Genre: " + userProfile.getGenre());
        } else {
            System.out.println("Invalid genre choice. Please try again.");
        }
    }
}
