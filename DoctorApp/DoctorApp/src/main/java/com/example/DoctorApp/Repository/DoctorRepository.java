package com.example.DoctorApp.Repository;


import com.example.DoctorApp.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor> findBySpecialityAndCity(String s, String patientCity);

}
