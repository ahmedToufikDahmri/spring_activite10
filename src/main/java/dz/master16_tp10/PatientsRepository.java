package dz.master16_tp10;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientsRepository extends MongoRepository<Patients, ObjectId>  {
	
    @Query(value="{nom:'?0'}", fields="{'nom' : 1, 'prenom' : 1, 'date' : 1 'sexe' : 1}")
    List<Patients> findAll(String nom);


}