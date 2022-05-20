package Employe_salary;

public class EmployeCommission extends Employe {
	private int vent;
	private double commission;
	private double salaire;

	public EmployeCommission(String nom, String prenom, String dateNaissance, int vent, double commission, double salaire) {
		super(nom, prenom, dateNaissance);
		this.vent = vent;
		this.commission = commission;
		this.salaire=  salaire;
	}
	
	//getters and setters 
	public int getVent() {
		return vent;
	}

	public void setVent(int vent) {
		this.vent = vent;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	
	public double getSalaire() { 
		return salaire; 
	}
	  
	public void setSalaire(double salaire) { 
		this.salaire = salaire; 
	}
	
	// salaire mensuel 
	public Double salaireMensuel(double vent, double commission) {
		return  this.vent * this.commission;
	}
	
	
	//afficher salaire
	public String toString() {
		return super.toString() + "vent : " + vent + " DH/ncommission :" + commission + " DH /nsalaire de base : " + super.calculSalaire(salaire) + "DH /nsalaire mensuel : " + salaireMensuel(vent,commission) + "DH\n";
		
	}
	
	
}