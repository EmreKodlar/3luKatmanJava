package Business;

import java.util.List;

import DataAccess.Doctor;
import View.IDoctor;

public class DoctorController implements IDoctor {

 
	Doctor doctor= new Doctor();

	@Override
	public void getDoctorsName() {


		for(int i=0; i<doctor.getAllDoctor().size(); i++) {
			
			 
			
		System.out.println(doctor.getAllDoctor().get(i).getName()); 
			 
			}
		
	 
	}

	@Override
	public void deleteDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addUser(Doctor doctor) {
		// TODO Auto-generated method stub
		
	}

}
