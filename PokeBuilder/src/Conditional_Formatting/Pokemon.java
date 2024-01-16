package Conditional_Formatting;

import java.util.Scanner;

import java.util.Arrays;


public class Pokemon {
	
	protected String Name;
	
	protected String Shape;
	
	protected static String [] Type_s = new String[12];
	
	protected String [] Moves = new String[10];
	
	public static Boolean Continue = true;
	public static String [] Pokemon = {"Charmander","Squirtle","Bulbasoar"};
	public static String [] Types = {"Fire","Water","Grass","Normal"};
	public static String [] Shapes = {"Head","Walker","Finoid","insectoid","Quadraped","Winged","Multi-Wingged","Cluster","Multiped","Base","Bipedal","Humanoid","Serpentine","Armed"};
	public static String [] PMoves = {"Fire Punch","Aqua Tail","Thunderbolt","Toxic","Tackle","Check for Copy Code","Give Assignment","Pop Quiz"};
	public static Pokemon [] Team = new Pokemon[6];
	public static String T1;
		
	//public static String T2;
	//public static String [] Moovs;
	
	
	public Pokemon(String N, String S, String[] T){
		this.Name=N;
		this.Shape=S;
		this.Type_s=T;
	}
	

	
	public Pokemon() {
		// TODO Auto-generated constructor stub
	}

	public static void Choice() {
		System.out.println("Will you be: \n\t(1)Making a Pokemon from scratch \n\t\t or \n\t(2)Choosing an existing one");
		Scanner Make_O_Build = new Scanner(System.in);
		int Choice = Make_O_Build.nextInt();
		if (Choice == 1) {
			System.out.println("proceding to build from scratch");
			T++;
			Pokemon PokemoN = new Pokemon();
			PokemoN.Build();
			PokemoN.TypingM();
			String fin = PokemoN.DexEntry();
		//	System.out.println();
			System.out.println(fin);
			Team[T-1]=PokemoN;
			}
		else if (Choice == 2) {
			System.out.println("Proceding to Dex-Search");
			T++;
			Pokemon PokemonD = new Pokemon();
			PokemonD.Arceus();
			PokemonD.TypingM();
			Team[T-1]=PokemonD;
			}
		else {
			System.out.println("Erorr Computed");
		}
	}
	public static Boolean SpellCheck(String One, String Two) {
		//System.out.println("Checking "+One+" and "+Two+" for Match");
		if (One.equals(Two)) {
			System.out.println("Match");
			return true;
		}
		else{
			//System.out.println("Possible Error");
			return false;
			}
	}

		public void Arceus() {
			System.out.println("What pokemon are you looking for?");
			Scanner F = new Scanner(System.in);
			String Title = F.next();
			
			for(int i = 0; i<Types.length;i++ ) {
				Boolean ToF = SpellCheck(Title,Pokemon[i]);
				if(ToF == true) {
					System.out.println("Pokemon "+Title+" found");
					//database connections
					this.Name = Title;
					this.Shape = "";
					this.Type_s[0] ="";
					this.Type_s[0] ="";
					break;
				}
				else {
					continue;
				}
				}
			//assign type(s) and shape to pokemon based on name
		}
		
		public void Build() {
			System.out.println("Name your Pokemon");
			Scanner UwU = new Scanner(System.in);
			this.Name = UwU.next();
			
			System.out.println("Provide bodytype");
			Scanner shape = new Scanner(System.in);
			String Sshape = shape.next();
			for(int i = 0; i<Types.length;i++ ) {
				Boolean ToF = SpellCheck(Sshape,Shapes[i]);
				if(ToF == true) {
					System.out.println("Shape "+Sshape+" Accepted");
					this.Shape = Sshape;
					break;	
					}
					}
			
			System.out.println("how many types");
			Scanner ooo = new Scanner(System.in);
			int num = ooo.nextInt();
			 
			while(num>0) {
			System.out.println("What type is your Pokemon");
			Scanner Yam = new Scanner(System.in);
			String responce = Yam.next();
			String Type;
			for(int i1 = 0; i1<Types.length;i1++ ) {
				Boolean ToF1 = SpellCheck(responce,Types[i1]);
				if(ToF1 == true) {
					System.out.println("Type "+responce+" Accepted");
					this.Type_s[num-1] = responce;
					num--;
					break;	
				}
				else {
					continue;
				}
				}
			 }	 
			}
		
		public void TypingM() {
		int M = 1;
		while(M<5) {		
		System.out.println("Pick move #"+(M));
		for(int i = 0;i<PMoves.length;i++) {
			System.out.println((i+1)+". "+ PMoves[i]);
			}
		Scanner yash = new Scanner(System.in);
		String ans = yash.nextLine();
		for(int i = 0; i<PMoves.length;i++ ) {
			Boolean ToF = SpellCheck(ans,PMoves[i]);
			if(ToF == true) { 
				System.out.println("Move #"+M+" "+ans+" Accepted");
				Moves[M-1] = ans;
				M++;
				break;	
			}
			else {
				continue;
			}
			
			}}
		}
		
		public String DexEntry() {
			String STR="";
			STR+= "Your Pokemon "+this.Name+" was created!\n"+
					"\t "+this.Name+":   ("+this.Shape+") \n"+
					"\t("+this.Type_s[0]+","+this.Type_s[1]+")\n"+
					"\t"+this.Moves[0]+"\n"+
					"\t"+this.Moves[1]+"\n"+
					"\t"+this.Moves[2]+"\n"+
					"\t"+this.Moves[3]+"\n";
					
			return STR;}	
		
		public static void Full_Prez() {
			for(int P = 0;P<Team.length;P++ ) {
				if(Team[P]!=null) {
		System.out.println("\t "+Team[P].Name+": \n"+
					"\t("+Team[P].Type_s[0]+","+Team[P].Type_s[1]+")\n"+
					"\t"+Team[P].Moves[0]+"\n"+
					"\t"+Team[P].Moves[1]+"\n"+
					"\t"+Team[P].Moves[2]+"\n"+
					"\t"+Team[P].Moves[3]+"\n\n");
				}
				else {
					System.out.println("screenshot your team!");
					break;
				}
				}
		} 
		
		public static int T = 0;
		
		public static void Redo() {
			System.out.println("Add another party Member?");
			Scanner fuck = new Scanner(System.in);
			String meh = fuck.next();
			if(meh.matches("Yes")) {
				Continue = true;
			}
			else {
				Continue = false;
			}
			
		} 
		
		public static void Flow() {
			do {
				Choice(); 
				Redo();
			}
			while(Continue == true && T!=6);
			Full_Prez();	
			}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		//testing tf algorythem
		/*
		Scanner fuck = new Scanner(System.in);
		String meh = fuck.next();
		for(int i = 0; i<Types.length;i++ ) { 
		Boolean TOF = SpellCheck(meh.toString(),Types[i].toString());
		if(TOF == true) {
			System.out.println("Type "+meh+" Accepted");
			break;	
		}
		else {
			continue;
		}
		}
		*/
		System.out.println("Welcome To Poke-Team-Builder!" );
		/*
		Pokemon Squirtle = new Pokemon("Squirtle","bipedal",Type_s);
		String stat = Squirtle.DexEntry();
		System.out.println(stat);
		*/
		Flow(); 
		//Pokemon Squirtle = new Pokemon("Squirtle","bipedal",Type_s);
		//Team[0]= Squirtle;
		//Full_Prez();
	}

}

