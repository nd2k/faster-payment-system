package com.nd2k.library.model.common;

import com.nd2k.library.model.common.Metadata.Metadata;
import com.nd2k.library.model.pain.pain00100112.Document;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FullPain00100112Request {

    private Metadata metadata;
    private Document document;
}
