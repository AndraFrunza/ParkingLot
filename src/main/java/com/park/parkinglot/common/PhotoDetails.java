/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.park.parkinglot.common;

import com.park.parkinglot.entity.Photo;
import java.io.Serializable;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author Andra Frunza
 */
public class PhotoDetails implements Serializable {
    
    private Integer id;
    private String filename;
    private String fileType;
    private byte[] fileContent;
    
    public PhotoDetails(Integer id, String filename, String fileType, byte[] fileContent){
        this.id = id;
        this.filename = filename;
        this.fileType = fileType;
        this.fileContent = fileContent;
    }

    public Integer getId() {
        return id;
    }

    public String getFilename() {
        return filename;
    }

    public String getFileType() {
        return fileType;
    }

    public byte[] getFileContent() {
        return fileContent;
    }

     
    
    
}
