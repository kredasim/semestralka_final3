/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fit.bpm.api.dto;

import java.io.Serializable;

/**
 *
 * @author Miroslav Ligas
 */
public class AttachmentDto extends CodebookEntity implements Serializable {

    private String fileLink;
    private String comment;
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
