package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.lang.ref.WeakReference;
import o.encryptKey;
/* loaded from: classes5.dex */
public final class getAll extends AsyncTask<Void, Void, toString> {
    private final int ag$a;
    private final WeakReference<CropImageView> ah$a;
    private final Context toString;
    private final Uri valueOf;
    private final int values;

    public getAll(CropImageView cropImageView, Uri uri) {
        this.valueOf = uri;
        this.ah$a = new WeakReference<>(cropImageView);
        this.toString = cropImageView.getContext();
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        double d = displayMetrics.density > 1.0f ? 1.0f / displayMetrics.density : 1.0d;
        this.ag$a = (int) (displayMetrics.widthPixels * d);
        this.values = (int) (displayMetrics.heightPixels * d);
    }

    public Uri valueOf() {
        return this.valueOf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: toString */
    public toString doInBackground(Void... voidArr) {
        try {
            if (isCancelled()) {
                return null;
            }
            encryptKey.values ag$a = encryptKey.ag$a(this.toString, this.valueOf, this.ag$a, this.values);
            if (isCancelled()) {
                return null;
            }
            encryptKey$ah$a encryptkey = encryptKey.toString(ag$a.valueOf, this.toString, this.valueOf);
            return new toString(this.valueOf, encryptkey.values, ag$a.toString, encryptkey.ah$a);
        } catch (Exception e) {
            return new toString(this.valueOf, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: ag$a */
    public void onPostExecute(toString tostring) {
        CropImageView cropImageView;
        if (tostring != null) {
            boolean z = false;
            if (!isCancelled() && (cropImageView = this.ah$a.get()) != null) {
                z = true;
                cropImageView.values(tostring);
            }
            if (z || tostring.ah$a == null) {
                return;
            }
            tostring.ah$a.recycle();
        }
    }

    /* loaded from: classes5.dex */
    public static final class toString {
        public final int ag$a;
        public final Bitmap ah$a;
        public final Uri toString;
        public final Exception valueOf;
        public final int values;

        toString(Uri uri, Bitmap bitmap, int i, int i2) {
            this.toString = uri;
            this.ah$a = bitmap;
            this.values = i;
            this.ag$a = i2;
            this.valueOf = null;
        }

        toString(Uri uri, Exception exc) {
            this.toString = uri;
            this.ah$a = null;
            this.values = 0;
            this.ag$a = 0;
            this.valueOf = exc;
        }
    }
}
