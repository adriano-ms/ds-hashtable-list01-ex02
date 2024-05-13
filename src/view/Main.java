package view;

import java.util.Scanner;

import br.edu.fateczl.list.List;
import controller.ApartmentController;
import model.Resident;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		@SuppressWarnings("unchecked")
		List<Resident>[] hashtable = new List[10];
		for(int i = 0; i < 10; i++) {
			hashtable[i] = new List<Resident>();
		}
		ApartmentController controller = new ApartmentController();
		int option = -1;
		do {
			try {
				option = Gui.mainMenu(sc);
				switch (option) {
				case 1:
					Resident newResident = Gui.registerMenu(sc);
					controller.registerResident(hashtable, newResident);
					break;
				case 2:
					Resident resident = controller.findResident(hashtable,
							new Resident(Gui.consultByApartmentMenu(sc), null, null, null, null));
					System.out.println(resident);
					break;
				case 3:
					controller.deleteResident(hashtable,
							new Resident(Gui.consultByApartmentMenu(sc), null, null, null, null));
					break;
				case 4:
					List<Resident> floor = hashtable[Gui.consultFloorMenu(sc)];
					int size = floor.size();
					for (int i = 0; i < size; i++) {
						System.out.println(floor.get(i));
					}
					break;
				case 0:
					System.out.println("Ending...");
					break;
				default:
					throw new Exception("Invalid option!");

				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}

		}while (option != 0);

		sc.close();
	}

}
