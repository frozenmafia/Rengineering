package com.giphy.sdk.ui.drawables;
/* loaded from: classes4.dex */
public enum ImageFormat {
    WEBP(MimeType.IMAGE_WEBP.getValue(), "webp"),
    GIF(MimeType.IMAGE_GIF.getValue(), "gif"),
    MP4(MimeType.IMAGE_MP4.getValue(), "mp4");
    
    private final String extension;
    private final String mimeType;

    ImageFormat(String str, String str2) {
        this.mimeType = str;
        this.extension = str2;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final String getMimeType() {
        return this.mimeType;
    }
}
