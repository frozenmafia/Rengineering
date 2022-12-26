package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import o.FragmentAnim;
import o.onPrepareOptionsPanel;
/* loaded from: classes4.dex */
public class LocalContentUriFetchProducer extends LocalFetchProducer {
    public static final String PRODUCER_NAME = "LocalContentUriFetchProducer";
    private static final String[] PROJECTION = {"_id", "_data"};
    private final ContentResolver mContentResolver;

    @Override // com.facebook.imagepipeline.producers.LocalFetchProducer
    protected String getProducerName() {
        return PRODUCER_NAME;
    }

    public LocalContentUriFetchProducer(Executor executor, onPrepareOptionsPanel onprepareoptionspanel, ContentResolver contentResolver) {
        super(executor, onprepareoptionspanel);
        this.mContentResolver = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.LocalFetchProducer
    protected EncodedImage getEncodedImage(ImageRequest imageRequest) throws IOException {
        EncodedImage cameraImage;
        InputStream createInputStream;
        Uri sourceUri = imageRequest.getSourceUri();
        if (!FragmentAnim.AnonymousClass2.toString(sourceUri)) {
            return (!FragmentAnim.AnonymousClass2.ag$a(sourceUri) || (cameraImage = getCameraImage(sourceUri)) == null) ? getEncodedImage((InputStream) this.mContentResolver.openInputStream(sourceUri).getClass(), -1) : cameraImage;
        }
        if (sourceUri.toString().endsWith("/photo")) {
            createInputStream = this.mContentResolver.openInputStream(sourceUri);
        } else if (sourceUri.toString().endsWith("/display_photo")) {
            try {
                AssetFileDescriptor openAssetFileDescriptor = this.mContentResolver.openAssetFileDescriptor(sourceUri, "r");
                openAssetFileDescriptor.getClass();
                createInputStream = openAssetFileDescriptor.createInputStream();
            } catch (IOException unused) {
                throw new IOException("Contact photo does not exist: " + sourceUri);
            }
        } else {
            InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.mContentResolver, sourceUri);
            if (openContactPhotoInputStream == null) {
                throw new IOException("Contact photo does not exist: " + sourceUri);
            }
            createInputStream = openContactPhotoInputStream;
        }
        createInputStream.getClass();
        return getEncodedImage(createInputStream, -1);
    }

    private EncodedImage getCameraImage(Uri uri) throws IOException {
        try {
            ParcelFileDescriptor openFileDescriptor = this.mContentResolver.openFileDescriptor(uri, "r");
            openFileDescriptor.getClass();
            return getEncodedImage(new FileInputStream(openFileDescriptor.getFileDescriptor()), (int) openFileDescriptor.getStatSize());
        } catch (FileNotFoundException unused) {
            return null;
        }
    }
}
