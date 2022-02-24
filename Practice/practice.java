import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner clients = new Scanner(new File("input.txt"));
        int numberOfClients = clients.nextInt();   
        String LikedIngrediants[][] = new String[numberOfClients][5];
        String DislikedIngrediants[][] = new String[numberOfClients][5];
        System.out.println("numberOfClients = " + numberOfClients);
        for(int i=0; i<numberOfClients; i++) {
            int numberOfLikes = clients.nextInt();
            for(int j=0; j<numberOfLikes; j++){
                // clients.useDelimiter("");
                 LikedIngrediants[i][j] = clients.next();
            }
            int numberOfDislikes = clients.nextInt();
            System.out.println("numberOfDislikes = "+numberOfDislikes);
            for(int k=1; k<=numberOfDislikes; k++){
                System.out.println("k = " + k);

                // clients.useDelimiter("");
                 DislikedIngrediants[i][k] = clients.next();
            }
            for(int l=0; l<numberOfClients; l++) {
                if(numberOfDislikes == 0) {
                    System.out.println("no dislikes");
                }
                for(int m=0; m<5; m++){
                    if(DislikedIngrediants[l][m] == null){
                        continue;
                    }
                    System.out.println("disliked ingredient number : " + m);
                    System.out.println(DislikedIngrediants[l][m]);
                }
            }
        }
        
        




        //                 !DOESN'T WORK
        // while(numberOfClients < 1 || numberOfClients > 100000) {
        //     System.out.println("enter a number beteen 0 and 10^5 !!!");
        //     numberOfClients = clients.nextInt();
        // }
        // String LikedIngrediants[][] = new String[numberOfClients][5];
        // String DislikedIngrediants[][] = new String[numberOfClients][5];
        // for (int i=0; i< numberOfClients; i++) {
        //     Scanner Like = new Scanner(System.in);
        //     System.out.println("enter the number of Ingrediants you like :");
        //     int numberOfLikes = Like.nextInt(); 
        //     Like.close();  
        //     while(numberOfLikes < 0 || numberOfLikes > 5) {
        //         System.out.println("enter a number beteen 0 and 5 !!!");
        //         numberOfLikes = Like.nextInt();
        //     }
        //     Scanner Dislike = new Scanner(System.in);
        //     System.out.println("enter the number of Ingrediants you Dislike :");
        //     int numberOfDislikes = Dislike.nextInt();   
        //     Dislike.close();  
        //     while(numberOfDislikes < 0 || numberOfDislikes > 5) {
        //         System.out.println("enter a number beteen 0 and 5 !!!");
        //         numberOfDislikes = Like.nextInt();
        //     }
        //     for (int j=0; j<numberOfLikes ; j++) {
        //         System.out.println("enter the ingredient you like : ");
        //         Scanner Likes = new Scanner(System.in);
        //         LikedIngrediants[i][j] = Likes.nextLine();   
        //         Likes.close();  
        //     }
        //     for (int k=0; k<numberOfDislikes ; k++) {
        //         System.out.println("enter the ingredient you Dislike : ");
        //         Scanner Dislikes = new Scanner(System.in);
        //         DislikedIngrediants[i][k] = Dislikes.nextLine();   
        //         Dislikes.close();  
        //     }
        // }

    }
}