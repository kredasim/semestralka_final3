/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fit.bpm.api.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Miroslav Ligas 
 */
public class AttachmentDto implements Serializable { 

	@Id
	@GeneratedValue
	@Column
	private long id;
	
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column
    private String fileLink;
	@Column
    private String comment;
	@Column
    private String downloadAddress;

    public String getFileId() {
        return fileLink;
    }

    public void setFileId(String fileLink) {
        this.fileLink = fileLink;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDownloadAddress() {
        return downloadAddress;
    }

    public void setDownloadAddress(String downloadAddress) {
        this.downloadAddress = downloadAddress;
    }

    
	@Override
    public String toString() {
        return "AttachmentDto{" +
                "fileLink='" + fileLink + '\'' +
                ", comment='" + comment + '\'' +
                ", downloadAddress='" + downloadAddress + '\'' +
                '}';
    }
}
