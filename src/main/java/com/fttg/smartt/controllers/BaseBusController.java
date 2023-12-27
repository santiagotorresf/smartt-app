/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fttg.smartt.controllers;

import com.fttg.smartt.dtos.BaseBusCooperativaDiscoDto;
import com.fttg.smartt.dtos.BaseBusDto;
import com.fttg.smartt.dtos.BaseBusIdDto;
import com.fttg.smartt.dtos.BaseBusInactivoDto;
import com.fttg.smartt.errors.BusNotFoundException;
import com.fttg.smartt.services.BaseBusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author storres
 */
@RestController
@RequestMapping("/api/v1/cooperativa/bus")
public class BaseBusController {

    @Autowired
    private BaseBusService baseBusService;

    @GetMapping("/{externalId}")
    public ResponseEntity<BaseBusDto> getBusByExternalId(@PathVariable("externalId") Integer externalId) throws BusNotFoundException {
        return new ResponseEntity<>(baseBusService.findBusOwnerInformationByExternalId(externalId), HttpStatus.OK);
    }

    @GetMapping("/id")
    public ResponseEntity<BaseBusDto> findBusByExternalId(@RequestParam(name = "externalId") Integer externalId) throws BusNotFoundException {
        return new ResponseEntity<>(baseBusService.findBusOwnerInformationByExternalId(externalId), HttpStatus.OK);
    }
    
    @GetMapping("/id2")
    public ResponseEntity<BaseBusInactivoDto> findBusByExternalIdInactivo(@RequestParam(name = "externalId") Integer externalId) {
        return new ResponseEntity<>(baseBusService.findBusOwnerInformationByExternalIdInactivo(externalId), HttpStatus.OK);
    }
    
    @GetMapping("/idCoop")
    public ResponseEntity<BaseBusCooperativaDiscoDto> findBusCooperativaByDisco (@RequestParam(name = "externalIdCooperativa") Integer externalIdCooperativa, @RequestParam (name = "disco") String disco ) {
        return new ResponseEntity<>(baseBusService.findBusCooperativaByDisco(externalIdCooperativa, disco), HttpStatus.OK);
    }
    
    @GetMapping("/idBus")
    public ResponseEntity<BaseBusIdDto> findBusById(@RequestParam(name = "idBus") Integer idBus) throws BusNotFoundException {
        return new ResponseEntity<>(baseBusService.findBusById(idBus), HttpStatus.OK);
    }
}
