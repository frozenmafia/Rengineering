package com.facebook.react.modules.camera;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.Base64OutputStream;
import com.facebook.fbreact.specs.NativeImageStoreAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o.FragmentStateManager;
@FragmentStateManager.AnonymousClass1(values = ImageStoreManager.NAME)
/* loaded from: classes4.dex */
public class ImageStoreManager extends NativeImageStoreAndroidSpec {
    private static final int BUFFER_SIZE = 8192;
    public static final String NAME = "ImageStoreManager";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public ImageStoreManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeImageStoreAndroidSpec
    public void getBase64ForTag(String str, Callback callback, Callback callback2) {
        new values(getReactApplicationContext(), str, callback, callback2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* loaded from: classes6.dex */
    class values extends GuardedAsyncTask<Void, Void> {
        private final String ah$a;
        private final Callback toString;
        private final Callback valueOf;

        private values(ReactContext reactContext, String str, Callback callback, Callback callback2) {
            super(reactContext);
            this.ah$a = str;
            this.toString = callback;
            this.valueOf = callback2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: ag$a */
        public void doInBackgroundGuarded(Void... voidArr) {
            try {
                InputStream openInputStream = ImageStoreManager.this.getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(this.ah$a));
                try {
                    this.toString.invoke(ImageStoreManager.this.convertInputStreamToBase64OutputStream(openInputStream));
                } catch (IOException e) {
                    this.valueOf.invoke(e.getMessage());
                }
                ImageStoreManager.closeQuietly(openInputStream);
            } catch (FileNotFoundException e2) {
                this.valueOf.invoke(e2.getMessage());
            }
        }
    }

    String convertInputStreamToBase64OutputStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 2);
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read > -1) {
                    base64OutputStream.write(bArr, 0, read);
                } else {
                    closeQuietly(base64OutputStream);
                    return byteArrayOutputStream.toString();
                }
            } catch (Throwable th) {
                closeQuietly(base64OutputStream);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
