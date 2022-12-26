package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.firebase_messaging.zzh;
import com.google.android.gms.internal.firebase_messaging.zzi;
import com.google.android.gms.internal.firebase_messaging.zzk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class getViewForPositionAndType implements Closeable {
    private volatile InputStream ag$a;
    private Task<Bitmap> ah$a;
    private final URL valueOf;

    public static getViewForPositionAndType toString(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new getViewForPositionAndType(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(valueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    private getViewForPositionAndType(URL url) {
        this.valueOf = url;
    }

    public void toString(Executor executor) {
        this.ah$a = Tasks.call(executor, new Callable(this) { // from class: o.RecyclerView.ViewFlinger
            private final getViewForPositionAndType ag$a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.ag$a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.ag$a.valueOf();
            }
        });
    }

    public Task<Bitmap> ah$a() {
        return (Task) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.ah$a);
    }

    public Bitmap valueOf() throws IOException {
        String valueOf = String.valueOf(this.valueOf);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Starting download of: ");
        sb.append(valueOf);
        Log.i("FirebaseMessaging", sb.toString());
        byte[] values = values();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(values, 0, values.length);
        if (decodeByteArray == null) {
            String valueOf2 = String.valueOf(this.valueOf);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
            sb2.append("Failed to decode image: ");
            sb2.append(valueOf2);
            throw new IOException(sb2.toString());
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf3 = String.valueOf(this.valueOf);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 31);
            sb3.append("Successfully downloaded image: ");
            sb3.append(valueOf3);
            Log.d("FirebaseMessaging", sb3.toString());
        }
        return decodeByteArray;
    }

    private byte[] values() throws IOException {
        URLConnection openConnection = this.valueOf.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            this.ag$a = inputStream;
            byte[] zza = zzh.zza(zzh.zza(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                int length = zza.length;
                String valueOf = String.valueOf(this.valueOf);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                sb.append("Downloaded ");
                sb.append(length);
                sb.append(" bytes from ");
                sb.append(valueOf);
                Log.v("FirebaseMessaging", sb.toString());
            }
            if (zza.length <= 1048576) {
                return zza;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    zzk.zza(th, th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            zzi.zza(this.ag$a);
        } catch (NullPointerException e) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e);
        }
    }
}
