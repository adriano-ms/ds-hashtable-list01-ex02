package controller;

import br.edu.fateczl.list.List;
import model.Resident;

public class ApartmentController {

	public ApartmentController() {
		super();
	}
	
	public void registerResident(List<Resident>[] hashtable, Resident resident) throws Exception {
		hashtable[resident.hashCode()].addLast(resident);
	}
	
	public Resident findResident(List<Resident>[] hashtable, Resident resident) throws Exception {
		List<Resident> floor = hashtable[resident.hashCode()];
		int size = floor.size();
		for(int i = 0; i < size; i++) {
			if(floor.get(i).equals(resident)) {
				return floor.get(i);
			}
		}
		return null;
	}
	
	public List<Resident> listFloor(List<Resident>[] hashtable, int floor) throws Exception {
		List<Resident> list = hashtable[floor];
		return list;
	}
	
	public void deleteResident(List<Resident>[] hashtable, Resident resident) throws Exception {
		int hash = resident.hashCode();
		for(int i = 0; i < hashtable[hash].size(); i++) {
			if(hashtable[hash].get(i).equals(resident)) {
				hashtable[hash].remove(i);
			}
		}
	}

}
