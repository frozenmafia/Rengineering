package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import o.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda2;
import o.onPrepareOptionsPanel;
/* loaded from: classes4.dex */
public class LocalAssetFetchProducer extends LocalFetchProducer {
    public static final String PRODUCER_NAME = "LocalAssetFetchProducer";
    private static int toString = 0;
    private static int valueOf = 1;
    private final AssetManager mAssetManager;

    @Override // com.facebook.imagepipeline.producers.LocalFetchProducer
    protected String getProducerName() {
        return PRODUCER_NAME;
    }

    public LocalAssetFetchProducer(Executor executor, onPrepareOptionsPanel onprepareoptionspanel, AssetManager assetManager) {
        super(executor, onprepareoptionspanel);
        this.mAssetManager = assetManager;
    }

    @Override // com.facebook.imagepipeline.producers.LocalFetchProducer
    protected EncodedImage getEncodedImage(ImageRequest imageRequest) throws IOException {
        int i = valueOf + 3;
        toString = i % 128;
        int i2 = i % 2;
        try {
            EncodedImage encodedImage = getEncodedImage((InputStream) ((Class) AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda2.valueOf(ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getPressedStateDuration() >> 16) + 87)).getMethod("ah$a", AssetManager.class, String.class).invoke(null, this.mAssetManager, getAssetName(imageRequest)), getLength(imageRequest));
            try {
                int i3 = toString + 39;
                try {
                    valueOf = i3 % 128;
                    int i4 = i3 % 2;
                    return encodedImage;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private int getLength(ImageRequest imageRequest) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.mAssetManager.openFd(getAssetName(imageRequest));
            int length = (int) assetFileDescriptor.getLength();
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            return length;
        } catch (IOException unused2) {
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

    private static String getAssetName(ImageRequest imageRequest) {
        return imageRequest.getSourceUri().getPath().substring(1);
    }
}
