package Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TreeNode {
    private String name;
    private List<TreeNode> children;

    public TreeNode(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void addChild(TreeNode child) {
        children.add(child);
    }
}

public class CountryStateCityTree {
    public static void main(String[] args) {
        TreeNode world = new TreeNode("India");

        // Adding countries
        TreeNode country1 = new TreeNode("-Maharashtra");
        TreeNode country2 = new TreeNode("-Madhya Pradesh");
        world.addChild(country1);
        world.addChild(country2);

        // Adding states to Country 1
        TreeNode state1 = new TreeNode("--Mumbai");
        TreeNode state2 = new TreeNode("--Pune");
        TreeNode state3 = new TreeNode("--Aurangabad");
        TreeNode state4 = new TreeNode("--Nashik");
        TreeNode state5 = new TreeNode("--Kolhapur");
        country1.addChild(state1);
        country1.addChild(state2);
        country1.addChild(state3);
        country1.addChild(state4);
        country1.addChild(state5);
        
     // Adding states to Country 2
        TreeNode state11 = new TreeNode("--Indore");
        TreeNode state21 = new TreeNode("--Bhopal");
        TreeNode state31 = new TreeNode("--Gwalior");
        TreeNode state41 = new TreeNode("--Khandwa");
        TreeNode state51 = new TreeNode("--Dewas");
        country2.addChild(state11);
        country2.addChild(state21);
        country2.addChild(state31);
        country2.addChild(state41);
        country2.addChild(state51);

        // Adding cities to State 1 -Mumbai
        TreeNode city11 = new TreeNode("---Marine Drive");
        TreeNode city12 = new TreeNode("---Gateway of India");
        TreeNode city13 = new TreeNode("---Sidhdhi Vinayaak");
        TreeNode city14 = new TreeNode("---Golden Pagoda");
        TreeNode city15 = new TreeNode("---Water Park");
        state1.addChild(city11);
        state1.addChild(city12);
        state1.addChild(city13);
        state1.addChild(city14);
        state1.addChild(city15);
        
        // Adding cities to State 2 -Pune
        TreeNode city21 = new TreeNode("---Dagdu Seth Temple");
        TreeNode city22 = new TreeNode("---MKSSS Cummins College");
        TreeNode city23 = new TreeNode("---Peshwa Park");
        TreeNode city24 = new TreeNode("---Shaniwar Wada");
        TreeNode city25 = new TreeNode("---Shivneri Fort");
        state2.addChild(city21);
        state2.addChild(city22);
        state2.addChild(city23);
        state2.addChild(city24);
        state2.addChild(city25);
        
        // Adding cities to State 3 -Aurangabaad
        TreeNode city31 = new TreeNode("---Ajanta Caves");
        TreeNode city32 = new TreeNode("---Ellora Caves");
        TreeNode city33 = new TreeNode("---Bibi ka Maqbara");
        TreeNode city34 = new TreeNode("---Bhaadra Maruti Temple");
        TreeNode city35 = new TreeNode("---Grishneshwar Temple");
        state3.addChild(city31);
        state3.addChild(city32);
        state3.addChild(city33);
        state3.addChild(city34);
        state3.addChild(city35);
        
        // Adding cities to State 4 -Nashik
        TreeNode city41 = new TreeNode("---Saptshringi Temple");
        TreeNode city42 = new TreeNode("---Kalaram Temple");
        TreeNode city43 = new TreeNode("---Panchvati");
        TreeNode city44 = new TreeNode("---HAL");
        TreeNode city45 = new TreeNode("---Pandav Leni");
        state4.addChild(city41);
        state4.addChild(city42);
        state4.addChild(city43);
        state4.addChild(city44);
        state4.addChild(city45);
        
        // Adding cities to State 5 -Kolhapur
        TreeNode city51 = new TreeNode("---Mahalakshmi Temple");
        TreeNode city52 = new TreeNode("---Kopeshwar Temple");
        TreeNode city53 = new TreeNode("---Kopeshwar Temple");
        TreeNode city54 = new TreeNode("---Lankala Lake");
        TreeNode city55 = new TreeNode("---Maharaja Palace");
        state5.addChild(city51);
        state5.addChild(city52);
        state5.addChild(city53);
        state5.addChild(city54);
        state5.addChild(city55);
        
     
        // Adding cities to State 11 -Indore
        TreeNode city111 = new TreeNode("---Khajrana Mandir");
        TreeNode city112 = new TreeNode("---Sarafa Bajar");
        TreeNode city113 = new TreeNode("---Rajwada");
        TreeNode city114 = new TreeNode("---Kanch Mandir");
        TreeNode city115 = new TreeNode("---Lalbaug Palace");
        state11.addChild(city111);
        state11.addChild(city112);
        state11.addChild(city113);
        state11.addChild(city114);
        state11.addChild(city115);
        
        // Adding cities to State 21 -Bhopal
        TreeNode city121 = new TreeNode("---Bhimbetka");
        TreeNode city122 = new TreeNode("---Yodhasthal");
        TreeNode city123 = new TreeNode("---Upper Lake");
        TreeNode city124 = new TreeNode("---Badi Jheel Lake");
        TreeNode city125 = new TreeNode("---Lakshmi Narayan Temple");
        state21.addChild(city121);
        state21.addChild(city122);
        state21.addChild(city123);
        state21.addChild(city124);
        state21.addChild(city125);
        
        // Adding cities to State 31 -Gwalior
        TreeNode city131 = new TreeNode("---Gwalior Fort");
        TreeNode city132 = new TreeNode("---Saas bahu Temple");
        TreeNode city133 = new TreeNode("---Jai Vilas Palace");
        TreeNode city134 = new TreeNode("---Gopachal Parvat");
        TreeNode city135 = new TreeNode("---Bara");
        state31.addChild(city131);
        state31.addChild(city132);
        state31.addChild(city133);
        state31.addChild(city134);
        state31.addChild(city135);
        
        // Adding cities to State 4 -Khandwa
        TreeNode city141 = new TreeNode("---Dada Darbar");
        TreeNode city142 = new TreeNode("---Indira Sagar Dam");
        TreeNode city143 = new TreeNode("---Ranmukteshwar Temple");
        TreeNode city144 = new TreeNode("---Nagchoon Lake");
        TreeNode city145 = new TreeNode("---Omkareshwar");
        state41.addChild(city141);
        state41.addChild(city142);
        state41.addChild(city143);
        state41.addChild(city144);
        state41.addChild(city145);
        
        // Adding cities to State 5 -Dewas
        TreeNode city151 = new TreeNode("---Chamunda Temple");
        TreeNode city152 = new TreeNode("---Tulja Bhavani Temple");
        TreeNode city153 = new TreeNode("---Kalia Devi temple");
        
        state51.addChild(city151);
        state51.addChild(city152);
        state51.addChild(city153);
        
        
        
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.println("Do you want to search State Wise or City Wise: 1 For State Wise, 2 for City Wise");
        String main_Choice=sc.nextLine();
        switch(main_Choice) {
        case "1":
         System.out.println("Enter State Code: 11 For Maharashtra, 12 for Madhya Pradesh");
            String state_Choice=sc.nextLine();
             switch(state_Choice) {
             case "11":
              System.out.println("Enter City Name of Maharashtra: ");
                    String city_Choice1=sc.nextLine();
                    switch(city_Choice1) {
                 case "Mumbai":
                  traverseTree(state1);
                  break;
                 case "Pune":
                  traverseTree(state2);
                  break;
                 case "Aurangabad":
                  traverseTree(state3);
                  break;
                 case "Nashik":
                  traverseTree(state4);
                  break;
                 case "Kolhapur":
                  traverseTree(state5);
                  break;
     
      default: traverseTree(country1); 
      break;
      
             }
                    break;
             case "12":
              
              System.out.println("Enter City Name of Madhya Pradesh: ");
                    String city_Choice2=sc.nextLine();
                    switch(city_Choice2) {
                 case "Indore":
                  traverseTree(state11);
                  break;
                 case "Bhopal":
                  traverseTree(state21);
                  break;
                 case "Gwalior":
                  traverseTree(state31);
                  break;
                 case "Khandwa":
                  traverseTree(state41);
                  break;
                 case "Dewas":
                  traverseTree(state51);
                  break;
                 default:
                     traverseTree(country2);
                     break;
                }
             }
             break;
        case "2":
         System.out.println("Enter City Name: ");
            String city_Choice=sc.nextLine();
             switch(city_Choice) {
             case "Mumbai":
              traverseTree(state1);
              break;
             case "Pune":
              traverseTree(state2);
              break;
             case "Aurangabad":
              traverseTree(state3);
              break;
             case "Nashik":
              traverseTree(state4);
              break;
             case "Kolhapur":
              traverseTree(state5);
              break;
             case "Indore":
              traverseTree(state11);
              break;
             case "Bhopal":
              traverseTree(state21);
              break;
             case "Gwalior":
              traverseTree(state31);
              break;
             case "Khandwa":
              traverseTree(state41);
              break;
             case "Dewas":
              traverseTree(state51);
              break;
             default:
              traverseTree(world);
              break;
             }
          
       
             }
   
        // Traversing the tree
       
    }

    public static void traverseTree(TreeNode node) {
        System.out.println(node.getName());
        for (TreeNode child : node.getChildren()) {
            traverseTree(child);
        }
    }
}