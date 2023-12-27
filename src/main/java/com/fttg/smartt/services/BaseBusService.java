/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fttg.smartt.services;

import com.fttg.smartt.dtos.BaseBusCooperativaDiscoDto;
import com.fttg.smartt.dtos.BaseBusDto;
import com.fttg.smartt.dtos.BaseBusIdDto;
import com.fttg.smartt.dtos.BaseBusInactivoDto;
import com.fttg.smartt.errors.BusNotFoundException;
import com.fttg.smartt.repositories.BaseBusRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author storres
 */
@Service
public class BaseBusService {

    @Autowired
    private BaseBusRepository repo;

    /*
    public BaseBusDto findBusOwnerInformationByExternalId(Integer externalId) {
        return repo.findBusOwnerInformationByExternalId(externalId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                String.format("Bus %d not found", externalId)));
    }
     */
    public BaseBusDto findBusOwnerInformationByExternalId(Integer externalId) throws BusNotFoundException {
        Optional<BaseBusDto> baseBusDto = repo.findBusOwnerInformationByExternalId(externalId);
        if (!baseBusDto.isPresent()) {
            throw new BusNotFoundException("Bus no existe !!" + " " + externalId);
        }
        return baseBusDto.get();
    }

    public BaseBusInactivoDto findBusOwnerInformationByExternalIdInactivo(Integer externalId) {
        return repo.findBusOwnerInformationByExternalIdInactivo(externalId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                String.format("Bus %d not found", externalId)));
    }

    public BaseBusCooperativaDiscoDto findBusCooperativaByDisco(Integer externalIdCoop, String disco) {
        return repo.findBusCooperativaByDisco(externalIdCoop, disco)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                String.format("Bus %d not found", externalIdCoop)));
    }

    public BaseBusIdDto findBusById(Integer id) throws BusNotFoundException {
        Optional<BaseBusIdDto> baseBusIdDto = repo.findBusById(id);
        if (!baseBusIdDto.isPresent()) {
            throw new BusNotFoundException("Bus no existe!!!" + " " + id);
        }
        return baseBusIdDto.get();
    }
}
