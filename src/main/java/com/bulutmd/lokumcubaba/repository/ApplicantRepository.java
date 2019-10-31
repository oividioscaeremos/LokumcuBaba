package com.bulutmd.lokumcubaba.repository;

import com.bulutmd.lokumcubaba.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long> {

    @Query(value = "SELECT id FROM bayilik_basvuru a WHERE a.tckn = ?1", nativeQuery = true)
    Integer getIfDuplicate(String tckn);
}
