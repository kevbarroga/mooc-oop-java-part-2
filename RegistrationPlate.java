import java.util.HashMap;
import java.util.ArrayList;

public class RegistrationPlate {
    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
       this.regCode = regCode;
       this.country = country;
    }

    public String toString(){
        return country+ " "+regCode;
    }

	public String getRegCode() {
		return this.regCode;
	}

	public String getCountry() {
		return this.country;
	}

	@Override
	public boolean equals(Object object) {
		if (object == null) {
			return false;
		}
		if (getClass() != object.getClass()) {
			return false;
		}
		RegistrationPlate compared = (RegistrationPlate) object;

		if (this.regCode == null || !this.regCode.equals(compared.getRegCode())) {
			return false;
		}
		if (this.country == null || !this.country.equals(compared.getCountry())) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		if (this.regCode == null) {
			return 3;
		}

		return this.regCode.hashCode() + this.country.hashCode();
	}

	public static void main(String[] args) {
		RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
		RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
		RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

		ArrayList<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
		finnish.add(reg1);
		finnish.add(reg2);

		RegistrationPlate newPlate = new RegistrationPlate("FI", "ABC-123");

		if (!finnish.contains(newPlate)) {
			finnish.add(newPlate);
		}

		System.out.println("Finnish: " + finnish);
		// if the equals method has not been overwritten, the saem registration plate is reapted in the list

		HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
		owners.put(reg1, "Arto");
		owners.put(reg3, "Jürgen");

		System.out.println("owners:");
		System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
		System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));
		// if the haseCode has not been overwritten, the owners are not found
		
	}
}

