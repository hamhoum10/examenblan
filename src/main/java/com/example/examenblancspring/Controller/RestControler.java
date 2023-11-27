package com.example.examenblancspring.Controller;

import com.example.examenblancspring.Entities.Clinique;
import com.example.examenblancspring.Entities.Medecin;
import com.example.examenblancspring.Entities.Patient;
import com.example.examenblancspring.Entities.RendezVous;
import com.example.examenblancspring.Services.ServiecIMP;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class RestControler {
private ServiecIMP serviecIMP ;
    @PostMapping("/addClinique")
    public Clinique addClineque(@RequestBody Clinique clinique ){
        return  serviecIMP.addClinique(clinique);
    }
    @PostMapping("/addmedecinAndAssignClinique/{id}")
    public Medecin addMedecinAndAssignToClinique(@RequestBody Medecin medecin ,@PathVariable long id){
        return  serviecIMP.addMedecinAndAssignToClinique(medecin,id);
    }
    @PostMapping("/addPatient")
    public Patient addPatient(@RequestBody Patient patient ){
        return  serviecIMP.addPatient(patient);
    }
    @PostMapping("/ddRDVAndAssignMeAndPatient/{idMedecin}/{idPatient}")
    public void addRDVAndAssignMeAndPatient(@RequestBody RendezVous rendezVous, @PathVariable long idMedecin, @PathVariable long idPatient){
          serviecIMP.addRDVAndAssignMeAndPatient(rendezVous,idMedecin,idPatient);
    }

}
