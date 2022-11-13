package com.hamitmizrak.io;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FileDataClass {

    private Long id;
    private String path;

    //parametresiz constructor
    public FileDataClass() {
        this.path=FileStaticData.FILE_PATH;
    }

    public FileDataClass(Long id, String path) {
        this.id = id;
        this.path = path;
    }
}
