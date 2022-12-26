package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.lang.ref.WeakReference;
import o.encryptKey;
/* loaded from: classes5.dex */
public final class encryptKeyValuePair extends AsyncTask<Void, Void, valueOf> {
    private final boolean HaptikSDK$a;
    private final boolean HaptikSDK$b;
    private final float[] HaptikSDK$c;
    private final int HaptikSDK$d;
    private final int HaptikSDK$e;
    private final int HaptikWebView;
    private final Bitmap.CompressFormat a;
    private final Bitmap ag$a;
    private final WeakReference<CropImageView> ah$a;
    private final int ah$b;
    private final Uri aj$a;
    private final int getInitSettings;
    private final CropImageView.RequestSizeOptions getSignupData;
    private final boolean invoke;
    private final int isLogoutPending;
    private final Uri onXdkEvent;
    private final int toString;
    private final Context valueOf;
    private final int values;

    public encryptKeyValuePair(CropImageView cropImageView, Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, int i4, int i5, boolean z2, boolean z3, CropImageView.RequestSizeOptions requestSizeOptions, Uri uri, Bitmap.CompressFormat compressFormat, int i6) {
        this.ah$a = new WeakReference<>(cropImageView);
        this.valueOf = cropImageView.getContext();
        this.ag$a = bitmap;
        this.HaptikSDK$c = fArr;
        this.onXdkEvent = null;
        this.ah$b = i;
        this.HaptikSDK$a = z;
        this.toString = i2;
        this.values = i3;
        this.HaptikWebView = i4;
        this.HaptikSDK$e = i5;
        this.HaptikSDK$b = z2;
        this.invoke = z3;
        this.getSignupData = requestSizeOptions;
        this.aj$a = uri;
        this.a = compressFormat;
        this.isLogoutPending = i6;
        this.HaptikSDK$d = 0;
        this.getInitSettings = 0;
    }

    public encryptKeyValuePair(CropImageView cropImageView, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3, CropImageView.RequestSizeOptions requestSizeOptions, Uri uri2, Bitmap.CompressFormat compressFormat, int i8) {
        this.ah$a = new WeakReference<>(cropImageView);
        this.valueOf = cropImageView.getContext();
        this.onXdkEvent = uri;
        this.HaptikSDK$c = fArr;
        this.ah$b = i;
        this.HaptikSDK$a = z;
        this.toString = i4;
        this.values = i5;
        this.HaptikSDK$d = i2;
        this.getInitSettings = i3;
        this.HaptikWebView = i6;
        this.HaptikSDK$e = i7;
        this.HaptikSDK$b = z2;
        this.invoke = z3;
        this.getSignupData = requestSizeOptions;
        this.aj$a = uri2;
        this.a = compressFormat;
        this.isLogoutPending = i8;
        this.ag$a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: valueOf */
    public valueOf doInBackground(Void... voidArr) {
        encryptKey.values values;
        try {
            if (isCancelled()) {
                return null;
            }
            Uri uri = this.onXdkEvent;
            if (uri != null) {
                values = encryptKey.valueOf(this.valueOf, uri, this.HaptikSDK$c, this.ah$b, this.HaptikSDK$d, this.getInitSettings, this.HaptikSDK$a, this.toString, this.values, this.HaptikWebView, this.HaptikSDK$e, this.HaptikSDK$b, this.invoke);
            } else {
                Bitmap bitmap = this.ag$a;
                if (bitmap != null) {
                    values = encryptKey.values(bitmap, this.HaptikSDK$c, this.ah$b, this.HaptikSDK$a, this.toString, this.values, this.HaptikSDK$b, this.invoke);
                } else {
                    return new valueOf((Bitmap) null, 1);
                }
            }
            Bitmap ag$a = encryptKey.ag$a(values.valueOf, this.HaptikWebView, this.HaptikSDK$e, this.getSignupData);
            Uri uri2 = this.aj$a;
            if (uri2 == null) {
                return new valueOf(ag$a, values.toString);
            }
            encryptKey.toString(this.valueOf, ag$a, uri2, this.a, this.isLogoutPending);
            if (ag$a != null) {
                ag$a.recycle();
            }
            return new valueOf(this.aj$a, values.toString);
        } catch (Exception e) {
            return new valueOf(e, this.aj$a != null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: ag$a */
    public void onPostExecute(valueOf valueof) {
        CropImageView cropImageView;
        if (valueof != null) {
            boolean z = false;
            if (!isCancelled() && (cropImageView = this.ah$a.get()) != null) {
                z = true;
                cropImageView.values(valueof);
            }
            if (z || valueof.toString == null) {
                return;
            }
            valueof.toString.recycle();
        }
    }

    /* loaded from: classes5.dex */
    public static final class valueOf {
        public final Exception ag$a;
        public final Uri ah$a;
        public final Bitmap toString;
        public final int valueOf;
        final boolean values;

        valueOf(Bitmap bitmap, int i) {
            this.toString = bitmap;
            this.ah$a = null;
            this.ag$a = null;
            this.values = false;
            this.valueOf = i;
        }

        valueOf(Uri uri, int i) {
            this.toString = null;
            this.ah$a = uri;
            this.ag$a = null;
            this.values = true;
            this.valueOf = i;
        }

        valueOf(Exception exc, boolean z) {
            this.toString = null;
            this.ah$a = null;
            this.ag$a = exc;
            this.values = z;
            this.valueOf = 1;
        }
    }
}
