import java.util.*;
public class Todo {
public static void main(String[] args){
		
		Map<String,String> todolist = new HashMap<String,String>();
		Scanner sc =new Scanner(System.in);
		int choice;
		int count=1;
		String value;
		int i=0,num;
		System.out.println("Welcome the the TODO Application");
		System.out.println("Select one ofthe following: \n");
		System.out.println("1. Add Entries\t2. Remove Task Completed\t3. View\n4. Exit");
		while(true) {
		
		System.out.println("Enter Option:");
		choice=sc.nextInt();
		
		switch(choice){
		case 1: 
			
			System.out.println("Enter the number of inputs:");
			num=sc.nextInt();
			for(i=1;i<=num;i++)
			{
				System.out.println("Enter the Input");
				value = sc.next();
				if(todolist.containsValue(value))
				{	
					System.out.println("The task is already in the list");
					i--;
					count--;
				}
				else
					todolist.put(String.valueOf(count), value);
								
				count++;
			
				
			}
			System.out.println(todolist);
			
		
			
			break;
		case 2:
			todolist.put(String.valueOf(99),"Delete List");
			System.out.println(todolist);
			System.out.println("Enter id of the task to remove");
			String val=sc.next();
			int valu=Integer.parseInt(val);
			if(todolist.containsKey(val) && valu!=99) {
				
				todolist.remove(val);
				todolist.remove("99");
				System.out.println(val+" has been removed successfully");
				System.out.println(todolist);
				
			}
			else if(valu==99) {
				todolist.clear();
				System.out.println("The List has been cleared. You have completed all the tasks");
				
			}
			else
				System.out.println("Invalid entry");
				
			break;
		case 3:
			System.out.println("\n\n\t\t\t\tThe List of things to do is \n\n");
			if(todolist.isEmpty())
				System.out.println("\t\t\tThe list is empty. You have no tasks to perform");
			else
				System.out.println("\t\t\t\t" + todolist+"\n");break;
		case 4:
			sc.close();System.exit(0);
			break;
		default:System.out.println("Invalid Input");
		}
	}
		
		
	}
		
	}


