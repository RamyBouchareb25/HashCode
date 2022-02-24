package Qualifications;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

public class FirstRound {
    public static void main(String[] args) throws FileNotFoundException {
        int C, P, N, i, k;
        Scanner sc = new Scanner(new File("Qualifications\\a_an_example.in.txt"));
        C = sc.nextInt();
        P = sc.nextInt();
        HashMap<String, HashMap<Boolean, HashMap<String, Integer>>> contributers  = new HashMap<String, HashMap<Boolean, HashMap<String, Integer>>>();
        for (i=0; i<C ;i++) {
            String name = sc.next();
            int skills = sc.nextInt();
            HashMap<Boolean, HashMap<String, Integer>> person = new HashMap<Boolean, HashMap<String, Integer>>();
            HashMap<String, Integer> skill = new HashMap<String, Integer>();
            for(k=0; k<skills ; k++) {
                String skillName = sc.next();
                int level = sc.nextInt();
                skill.put(skillName, level);
                person.put(false, skill);
                contributers.put(name, person);
            }
        }
        HashMap<String, HashMap< String,HashMap<String, Integer>>> projects  = new HashMap<String, HashMap< String,HashMap<String, Integer>>>();
        for (i=0; i<P; i++){
            String projectName = sc.next();
            int days = sc.nextInt();
            int score = sc.nextInt();
            int bestbefore = sc.nextInt();
            int roles = sc.nextInt();
            HashMap<String ,HashMap<String, Integer>> Roles = new HashMap<String ,HashMap<String, Integer>>();
            HashMap<String, Integer> skillRequirements = new HashMap<String, Integer>();
            for(k=0 ; k<roles; k++) {
                String role = sc.next();
                int levelRequirement = sc.nextInt();
                skillRequirements.put(role, levelRequirement);
                Roles.put(null, skillRequirements);
            }
            projects.put(projectName, Roles);

        }
        // System.out.println(contributers);
        // System.out.println(projects);
        sc.close();      
        for (HashMap.Entry<String, HashMap< String,HashMap<String, Integer>>> entry1 : projects.entrySet()) 
        {
            String projectName = entry1.getKey();
            for(HashMap.Entry< String,HashMap<String, Integer>> entry2 : entry1.getValue().entrySet()){
                String role = entry2.getKey();
                for(HashMap.Entry< String,Integer> entryx : entry2.getValue().entrySet()){
                    String assignment = entryx.getKey();
                    int requirement = entryx.getValue();
                    for(HashMap.Entry<String, HashMap<Boolean, HashMap<String, Integer>>> entry3 : contributers.entrySet())
                    {
                        String name = entry3.getKey();
                        for(HashMap.Entry<Boolean, HashMap<String, Integer>> entry4 : entry3.getValue().entrySet())
                        {
                            boolean isTaken = entry4.getKey();
                            for(HashMap.Entry<String, Integer> entry5 : entry4.getValue().entrySet()){
                                String skill = entry5.getKey();
                                int level = entry5.getValue();
                                if(skill == role && level == requirement && !isTaken) {
                                    HashMap<Boolean, HashMap<String, Integer>> person = new HashMap<Boolean, HashMap<String, Integer>>();
                                    HashMap<String, Integer> skills = new HashMap<String, Integer>();
                                    skills.put(skill, level);
                                    person.put(true, skills);
                                    contributers.put(name, person);
                                    HashMap<String ,HashMap<String, Integer>> Roles = new HashMap<String ,HashMap<String, Integer>>();
                                    HashMap<String, Integer> skillRequirements = new HashMap<String, Integer>();
                                    skillRequirements.put(role, requirement);
                                    Roles.put(name, skillRequirements);                 
                                    projects.put(projectName, Roles);
                                }
                            }
                        }
                    }
                }
            }
            // System.out.println("Key = " + entry1.getKey() + ", Value = " + entry1.getValue());
        }
        System.out.println(contributers);
        System.out.println(projects);
    }

}
