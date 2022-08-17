package dz.master16_tp10;

import java.sql.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("patients")
public class Patients {
	
    @Id
	private ObjectId _id;
	private String nom;
	private String prenom;
	private Date date;
	private String sexe;
	
	
	public Patients(ObjectId _id, String nom, String prenom, String sexe, Date date) {
		super();
		this._id = _id;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.date = date;
	}
	
	public Patients() {

	}
	
	public ObjectId getId() {
		return _id;
	}
	public void setId(ObjectId _id) {
		this._id = _id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Patients [_id=" + _id + ", nom=" + nom + ", prenom=" + prenom + ", date=" + date + ", sexe=" + sexe
				+ "]";
	}
	

	
}
