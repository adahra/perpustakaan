/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.adahra.Perpustakaan.repository;

import io.github.adahra.Perpustakaan.model.Nasabah;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sebangsa
 */
@Repository
public interface NasabahRepository extends JpaRepository<Nasabah, Integer> {
    
    @Query("SELECT n FROM Nasabah n WHERE LOWER(n.nasabahId) = LOWER(:nasabahId)")
    public List<Nasabah> findByNasabahId(@Param("nasabahId") String nasabahId);
}
