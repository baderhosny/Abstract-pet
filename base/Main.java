public class Main
{
	public static void dogMenu()
		{
			System.out.println("pick an option");
			System.out.println(" 1) eat");
			System.out.println(" 2) sleep");
			System.out.println(" 3) play");
			System.out.println(" 4) exit");
			int option = input.nextInt();
			
			if( option == 1)
				Dog.eat();
			else if (option == 2)
				Dog.sleep();
			else if (option == 3)
				Dog.play();
			else
				System.exit(0);
		}	
		

		public static void mainMenu()
		{
			Dog dog = new dog();
					
			System.out.println("pick an option");
			for(int i=0; i<ArrayList.size();i++);
			{
				System.out.println(i + " " + ArrayList.get(i).getName());
			}

			int option = input.nextInt();
			loop = ArrayList.get(option);
			

		}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		ArrayList<Pet> petList = new ArrayList<Pet>();
		try
		{
			FileInputStream inputFile = new FileInputStream("InputFile");
			ObjectInputStream pet = new ObjectInputStream(inputFile);
			petList = (ArrayList<Pet>)pet.readObject();
		}
		catch (IOEception e)
		{
			System.out.println(e.getMessage());
		}
		catch (ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Hello, please enter the name of your pet");
		petName = input.nextLine();

		petList.add(new Dog(petName,4,4,4));
		
		for(int i=0; i<petList.size();i++)
		{
			System.out.println("")
		}
		keepLooping = null;
		while(keepLooping != null)
		{
			dogMenu();
			try
			{
				FileOutputStream outputFile = new FileOutputStream("Output");
				ObjectOutputStream outFile = new ObjectOutputStream(outputFile);
				outFile.writeObject(petList);
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		}	
	}/*
		public static void dogMenu()
		{
			System.out.println("pick an option");
			System.out.println(" 1) eat");
			System.out.println(" 2) sleep");
			System.out.println(" 3) play");
			System.out.println(" 4) exit");
			int option = input.nextInt();
			
			if( option == 1)
				Dog.eat();
			else if (option == 2)
				Dog.sleep();
			else if (option == 3)
				Dog.play();
			else
				System.exit(0);
		}	
		

		public static void mainMenu()
		{
			Dog dog = new dog();
					
			System.out.println("pick an option");
			for(int i=0; i<ArrayList.size();i++);
			{
				System.out.println(i + " " + ArrayList.get(i).getName());
			}

			int option = input.nextInt();
			loop = ArrayList.get(option);
			

		}
*/
}
		
