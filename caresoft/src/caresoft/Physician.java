package caresoft;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser
{
	 private ArrayList<String> patientNotes;
	 
	 public Physician()
	 {
		 this.id=id;
	 }
	
	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) 
	{
//		// TODO Auto-generated method stub
//		if(pin<1000||pin>9999) return false;
//		this.pin=pin;
//		return true;
		return confirmedAuthID==pin;
	}
//... imports class definition...
    
    // Inside class:    
   
	
  
   
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	
    // TO DO: Setters & Getters


};