package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;
import o.onPrepareOptionsPanel;
/* loaded from: classes4.dex */
public class LocalResourceFetchProducer extends LocalFetchProducer {
    public static final String PRODUCER_NAME = "LocalResourceFetchProducer";
    private final Resources mResources;

    @Override // com.facebook.imagepipeline.producers.LocalFetchProducer
    protected String getProducerName() {
        return PRODUCER_NAME;
    }

    public LocalResourceFetchProducer(Executor executor, onPrepareOptionsPanel onprepareoptionspanel, Resources resources) {
        super(executor, onprepareoptionspanel);
        this.mResources = resources;
    }

    @Override // com.facebook.imagepipeline.producers.LocalFetchProducer
    protected EncodedImage getEncodedImage(ImageRequest imageRequest) throws IOException {
        return getEncodedImage(this.mResources.openRawResource(getResourceId(imageRequest)), getLength(imageRequest));
    }

    private int getLength(ImageRequest imageRequest) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.mResources.openRawResourceFd(getResourceId(imageRequest));
            int length = (int) assetFileDescriptor.getLength();
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            return length;
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    private static int getResourceId(ImageRequest imageRequest) {
        String path = imageRequest.getSourceUri().getPath();
        path.getClass();
        return Integer.parseInt(path.substring(1));
    }
}
