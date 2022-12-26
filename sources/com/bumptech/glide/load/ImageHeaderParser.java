package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.rotationXBy;
/* loaded from: classes3.dex */
public interface ImageHeaderParser {
    int ag$a(InputStream inputStream, rotationXBy rotationxby) throws IOException;

    ImageType toString(InputStream inputStream) throws IOException;

    ImageType values(ByteBuffer byteBuffer) throws IOException;

    /* loaded from: classes3.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        private final boolean hasAlpha;

        ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }
}
