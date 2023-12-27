/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fttg.smartt.errors.dtos;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 *
 * @author storres
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {

    private Date time;
    private HttpStatus status;
    private String message;

}
