package Qualifications;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

public class FirstRound {
    public static void main(String[] args) throws FileNotFoundException {
        int C, P, N, i, k;
        Scanner sc = new Scanner(new File("Qualifications\\b_better_start_small.in.txt"));
        C = sc.nextInt();
        P = sc.nextInt();
        HashMap<String, HashMap<String, Integer>> contributers  = new HashMap<String, HashMap<String, Integer>>();
        for (i=0; i<C ;i++) {
            String name = sc.next();
            int skills = sc.nextInt();
            HashMap<String, Integer> skill = new HashMap<String, Integer>();
            for(k=0; k<skills ; k++) {
                String skillName = sc.next();
                int level = sc.nextInt();
                skill.put(skillName, level);
                contributers.put(name, skill);
            }
        }
        HashMap<String, HashMap<String, Integer>> projects  = new HashMap<String, HashMap<String, Integer>>();
        for (i=0; i<P; i++){
            String projectName = sc.next();
            int days = sc.nextInt();
            int score = sc.nextInt();
            int bestbefore = sc.nextInt();
            int roles = sc.nextInt();
            HashMap<String, Integer> skillRequirements = new HashMap<String, Integer>();
            for(k=0 ; k<roles; k++) {
                String role = sc.next();
                int levelRequirement = sc.nextInt();
                skillRequirements.put(role, levelRequirement);
            }
            projects.put(projectName, skillRequirements);

        }
        // System.out.println(contributers);
        // System.out.println(projects);
        sc.close();      
        for (HashMap.Entry<String, HashMap<String, Integer>> entry : contributers.entrySet()) 
        {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

}
