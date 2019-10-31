package com.bulutmd.lokumcubaba.repository;

import com.bulutmd.lokumcubaba.model.Applicant;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long> {

    @Query(value = "SELECT id FROM bayilik_basvuru a WHERE a.tckn = ?1", nativeQuery = true)
    int getIfDuplicate(String tckn);
}
