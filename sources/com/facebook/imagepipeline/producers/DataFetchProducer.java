package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import o.Fragment;
/* loaded from: classes4.dex */
public class DataFetchProducer extends LocalFetchProducer {
    public static final String PRODUCER_NAME = "DataFetchProducer";

    @Override // com.facebook.imagepipeline.producers.LocalFetchProducer
    protected String getProducerName() {
        return PRODUCER_NAME;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DataFetchProducer(o.onPrepareOptionsPanel r2) {
        /*
            r1 = this;
            o.setRetainInstance r0 = o.setRetainInstance.ag$a()
            r1.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.DataFetchProducer.<init>(o.onPrepareOptionsPanel):void");
    }

    @Override // com.facebook.imagepipeline.producers.LocalFetchProducer
    protected EncodedImage getEncodedImage(ImageRequest imageRequest) throws IOException {
        byte[] data = getData(imageRequest.getSourceUri().toString());
        return getByteBufferBackedEncodedImage(new ByteArrayInputStream(data), data.length);
    }

    static byte[] getData(String str) {
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(str.substring(0, 5).equals("data:")));
        int indexOf = str.indexOf(44);
        String substring = str.substring(indexOf + 1, str.length());
        if (isBase64(str.substring(0, indexOf))) {
            return Base64.decode(substring, 0);
        }
        String decode = Uri.decode(substring);
        decode.getClass();
        return decode.getBytes();
    }

    static boolean isBase64(String str) {
        if (str.contains(";")) {
            String[] split = str.split(";");
            return split[split.length - 1].equals("base64");
        }
        return false;
    }
}
