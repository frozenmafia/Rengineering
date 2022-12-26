package o;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.data.CandleEntry;
import o.MediaBrowserServiceCompat;
import o.MediaButtonReceiver;
/* loaded from: classes4.dex */
public class getMediaButtonReceiverComponent {
    protected MediaButtonReceiver.MediaButtonConnectionCallback toString;
    protected Matrix ah$a = new Matrix();
    protected Matrix ag$a = new Matrix();
    protected float[] HaptikSDK$c = new float[1];
    protected float[] HaptikSDK$b = new float[1];
    protected float[] HaptikSDK$a = new float[1];
    protected float[] invoke = new float[1];
    protected Matrix valueOf = new Matrix();
    float[] values = new float[2];
    private Matrix ah$b = new Matrix();
    private Matrix HaptikSDK$d = new Matrix();

    public getMediaButtonReceiverComponent(MediaButtonReceiver.MediaButtonConnectionCallback mediaButtonConnectionCallback) {
        this.toString = mediaButtonConnectionCallback;
    }

    public void toString(float f, float f2, float f3, float f4) {
        float HaptikSDK$d = this.toString.HaptikSDK$d() / f2;
        float ah$b = this.toString.ah$b() / f3;
        if (Float.isInfinite(HaptikSDK$d)) {
            HaptikSDK$d = 0.0f;
        }
        if (Float.isInfinite(ah$b)) {
            ah$b = 0.0f;
        }
        this.ah$a.reset();
        this.ah$a.postTranslate(-f, -f4);
        this.ah$a.postScale(HaptikSDK$d, -ah$b);
    }

    public void values(boolean z) {
        this.ag$a.reset();
        if (!z) {
            this.ag$a.postTranslate(this.toString.onPostMessage(), this.toString.HaptikSDK$e() - this.toString.extraCallback());
            return;
        }
        this.ag$a.setTranslate(this.toString.onPostMessage(), -this.toString.onMessageChannelReady());
        this.ag$a.postScale(1.0f, -1.0f);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.mikephil.charting.data.Entry] */
    public float[] ag$a(MediaBrowserServiceCompat.ServiceHandler serviceHandler, float f, float f2, int i, int i2) {
        int i3 = ((int) (((i2 - i) * f) + 1.0f)) * 2;
        if (this.HaptikSDK$c.length != i3) {
            this.HaptikSDK$c = new float[i3];
        }
        float[] fArr = this.HaptikSDK$c;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            ?? HaptikSDK$d = serviceHandler.HaptikSDK$d((i4 / 2) + i);
            if (HaptikSDK$d != 0) {
                fArr[i4] = HaptikSDK$d.HaptikWebView();
                fArr[i4 + 1] = HaptikSDK$d.ah$b() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        valueOf().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.github.mikephil.charting.data.Entry] */
    public float[] ah$a(MediaBrowserServiceCompat.ServiceCallbacks serviceCallbacks, float f, int i, int i2) {
        int i3 = ((i2 - i) + 1) * 2;
        if (this.HaptikSDK$b.length != i3) {
            this.HaptikSDK$b = new float[i3];
        }
        float[] fArr = this.HaptikSDK$b;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            ?? HaptikSDK$d = serviceCallbacks.HaptikSDK$d((i4 / 2) + i);
            if (HaptikSDK$d != 0) {
                fArr[i4] = HaptikSDK$d.HaptikWebView();
                fArr[i4 + 1] = HaptikSDK$d.ah$b() * f;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        valueOf().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.mikephil.charting.data.Entry] */
    public float[] valueOf(MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass6 anonymousClass6, float f, float f2, int i, int i2) {
        int i3 = (((int) ((i2 - i) * f)) + 1) * 2;
        if (this.HaptikSDK$a.length != i3) {
            this.HaptikSDK$a = new float[i3];
        }
        float[] fArr = this.HaptikSDK$a;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            ?? HaptikSDK$d = anonymousClass6.HaptikSDK$d((i4 / 2) + i);
            if (HaptikSDK$d != 0) {
                fArr[i4] = HaptikSDK$d.HaptikWebView();
                fArr[i4 + 1] = HaptikSDK$d.ah$b() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        valueOf().mapPoints(fArr);
        return fArr;
    }

    public float[] ah$a(MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass9 anonymousClass9, float f, float f2, int i, int i2) {
        int i3 = ((int) (((i2 - i) * f) + 1.0f)) * 2;
        if (this.invoke.length != i3) {
            this.invoke = new float[i3];
        }
        float[] fArr = this.invoke;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            CandleEntry candleEntry = (CandleEntry) anonymousClass9.HaptikSDK$d((i4 / 2) + i);
            if (candleEntry != null) {
                fArr[i4] = candleEntry.HaptikWebView();
                fArr[i4 + 1] = candleEntry.ag$a() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        valueOf().mapPoints(fArr);
        return fArr;
    }

    public void ag$a(Path path) {
        path.transform(this.ah$a);
        path.transform(this.toString.isLogoutPending());
        path.transform(this.ag$a);
    }

    public void toString(float[] fArr) {
        this.ah$a.mapPoints(fArr);
        this.toString.isLogoutPending().mapPoints(fArr);
        this.ag$a.mapPoints(fArr);
    }

    public void valueOf(RectF rectF) {
        this.ah$a.mapRect(rectF);
        this.toString.isLogoutPending().mapRect(rectF);
        this.ag$a.mapRect(rectF);
    }

    public void ah$a(RectF rectF, float f) {
        rectF.top *= f;
        rectF.bottom *= f;
        this.ah$a.mapRect(rectF);
        this.toString.isLogoutPending().mapRect(rectF);
        this.ag$a.mapRect(rectF);
    }

    public void valueOf(RectF rectF, float f) {
        rectF.left *= f;
        rectF.right *= f;
        this.ah$a.mapRect(rectF);
        this.toString.isLogoutPending().mapRect(rectF);
        this.ag$a.mapRect(rectF);
    }

    public void ag$a(float[] fArr) {
        Matrix matrix = this.valueOf;
        matrix.reset();
        this.ag$a.invert(matrix);
        matrix.mapPoints(fArr);
        this.toString.isLogoutPending().invert(matrix);
        matrix.mapPoints(fArr);
        this.ah$a.invert(matrix);
        matrix.mapPoints(fArr);
    }

    public generateBigContentView ag$a(float f, float f2) {
        generateBigContentView valueOf = generateBigContentView.valueOf(0.0d, 0.0d);
        toString(f, f2, valueOf);
        return valueOf;
    }

    public void toString(float f, float f2, generateBigContentView generatebigcontentview) {
        float[] fArr = this.values;
        fArr[0] = f;
        fArr[1] = f2;
        ag$a(fArr);
        generatebigcontentview.values = this.values[0];
        generatebigcontentview.ag$a = this.values[1];
    }

    public generateBigContentView toString(float f, float f2) {
        float[] fArr = this.values;
        fArr[0] = f;
        fArr[1] = f2;
        toString(fArr);
        float[] fArr2 = this.values;
        return generateBigContentView.valueOf(fArr2[0], fArr2[1]);
    }

    public Matrix valueOf() {
        this.ah$b.set(this.ah$a);
        this.ah$b.postConcat(this.toString.toString);
        this.ah$b.postConcat(this.ag$a);
        return this.ah$b;
    }
}
