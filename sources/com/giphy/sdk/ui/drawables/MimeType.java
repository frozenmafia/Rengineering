package com.giphy.sdk.ui.drawables;

import com.google.android.exoplayer2.util.MimeTypes;
/* loaded from: classes4.dex */
public enum MimeType {
    VIDEO_MP4(MimeTypes.VIDEO_MP4),
    IMAGE_GIF(MimeTypes.VIDEO_MP4),
    IMAGE_MP4(MimeTypes.VIDEO_MP4),
    IMAGE_WEBP(MimeTypes.VIDEO_MP4),
    IMAGE_JPG(MimeTypes.VIDEO_MP4),
    IMAGE_JPEG(MimeTypes.VIDEO_MP4),
    IMAGE_PNG(MimeTypes.VIDEO_MP4);
    
    private final String value;

    MimeType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
