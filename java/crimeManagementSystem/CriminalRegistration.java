package crimeManagementSystem;

import java.sql.Blob;

public class CriminalRegistration {
private String policestationname,crimetype,fullname,nationality,gender,residentaddress,occupation,mostwanted;
private int firid,dateofcrime,dateofbirth,jailterm;
private Blob criminalimage;
public String getPolicestationname() {
	return policestationname;
}
public void setPolicestationname(String policestationname) {
	this.policestationname = policestationname;
}
public String getCrimetype() {
	return crimetype;
}
public void setCrimetype(String crimetype) {
	this.crimetype = crimetype;
}
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}
public String getNationality() {
	return nationality;
}
public void setNationality(String nationality) {
	this.nationality = nationality;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getResidentaddress() {
	return residentaddress;
}
public void setResidentaddress(String residentaddress) {
	this.residentaddress = residentaddress;
}
public String getOccupation() {
	return occupation;
}
public void setOccupation(String occupation) {
	this.occupation = occupation;
}
public String getMostwanted() {
	return mostwanted;
}
public void setMostwanted(String mostwanted) {
	this.mostwanted = mostwanted;
}
public int getFirid() {
	return firid;
}
public void setFirid(int firid) {
	this.firid = firid;
}
public int getDateofcrime() {
	return dateofcrime;
}
public void setDateofcrime(int dateofcrime) {
	this.dateofcrime = dateofcrime;
}
public int getDateofbirth() {
	return dateofbirth;
}
public void setDateofbirth(int dateofbirth) {
	this.dateofbirth = dateofbirth;
}
public int getJailterm() {
	return jailterm;
}
public void setJailterm(int jailterm) {
	this.jailterm = jailterm;
}
public Blob getCriminalimage() {
	return criminalimage;
}
public void setCriminalimage(Blob criminalimage) {
	this.criminalimage = criminalimage;
}

}
