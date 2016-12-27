package kr.co.dgit.school.dto;

public class PhoneNumber {
	private String countryCode;
	private String stateCode;
	private String number;

	public PhoneNumber() {
		
	}

	public PhoneNumber(String str) {
		if (str != null) {
			String[] parts = str.split("-");
			if (parts.length > 0) {
				countryCode = parts[0];
			}
			if (parts.length > 1) {
				stateCode = parts[1];
			}
			if (parts.length > 2) {

				number = parts[2];
			}
		}
	}

	public PhoneNumber(String countryCode, String stateCode, String number) {

		this.countryCode = countryCode;
		this.stateCode = stateCode;
		this.number = number;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return String.format("%s-%s-%s", countryCode, stateCode, number);
	}
	

}
