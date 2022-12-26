package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import o.Fragment;
import o.onPrepareOptionsPanel;
/* loaded from: classes4.dex */
public class QualifiedResourceFetchProducer extends LocalFetchProducer {
    public static final String PRODUCER_NAME = "QualifiedResourceFetchProducer";
    private final ContentResolver mContentResolver;

    @Override // com.facebook.imagepipeline.producers.LocalFetchProducer
    protected String getProducerName() {
        return PRODUCER_NAME;
    }

    public QualifiedResourceFetchProducer(Executor executor, onPrepareOptionsPanel onprepareoptionspanel, ContentResolver contentResolver) {
        super(executor, onprepareoptionspanel);
        this.mContentResolver = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.LocalFetchProducer
    protected EncodedImage getEncodedImage(ImageRequest imageRequest) throws IOException {
        InputStream openInputStream = this.mContentResolver.openInputStream(imageRequest.getSourceUri());
        Fragment.AnonymousClass8.values(openInputStream, "ContentResolver returned null InputStream");
        return getEncodedImage(openInputStream, -1);
    }
}
