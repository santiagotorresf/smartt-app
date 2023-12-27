/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fttg.smartt.repositories;

import com.fttg.smartt.dtos.BaseBusCooperativaDiscoDto;
import com.fttg.smartt.dtos.BaseBusDto;
import com.fttg.smartt.dtos.BaseBusIdDto;
import com.fttg.smartt.dtos.BaseBusInactivoDto;
import com.fttg.smartt.entities.BaseBus;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author storres
 */
@Repository
public interface BaseBusRepository extends JpaRepository<BaseBus, Integer> {

    @Query(nativeQuery = true)
    public Optional<BaseBusDto> findBusOwnerInformationByExternalId(Integer externalId);

    @Query(nativeQuery = true)
    public Optional<BaseBusCooperativaDiscoDto> findBusCooperativaByDisco(Integer externalIdCoop, String disco);
    
    @Query(nativeQuery = true)
    public Optional<BaseBusInactivoDto> findBusOwnerInformationByExternalIdInactivo(Integer externalId);
    
    @Query(nativeQuery = true)
    public Optional<BaseBusIdDto> findBusById(Integer id);
}
