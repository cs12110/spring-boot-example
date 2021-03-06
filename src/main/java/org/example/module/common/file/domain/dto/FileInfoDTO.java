package org.example.module.common.file.domain.dto;

import org.example.common.util.JsonUtil;

import java.io.Serializable;

/**
 * @version V1.0
 * @since 2020-12-07 10:04
 */
public class FileInfoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String fileName;
    private String fileUrl;
    private Long fileSize;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return JsonUtil.toJSONString(this);
    }
}
