package com.clevertap.android.sdk.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import o.setTextSelection;
/* loaded from: classes4.dex */
public class GifImageView extends AppCompatImageView implements Runnable {
    private boolean HaptikSDK$a;
    private GifImageView$ag$a HaptikSDK$b;
    private long HaptikSDK$c;
    private boolean HaptikSDK$d;
    private Bitmap HaptikSDK$e;
    private Thread ag$a;
    private values ah$a;
    private final Handler ah$b;
    private final Runnable getInitSettings;
    private setTextSelection invoke;
    private final Runnable toString;
    private boolean valueOf;
    private toString values;

    /* loaded from: classes4.dex */
    public interface toString {
        void ah$a();
    }

    /* loaded from: classes4.dex */
    public interface values {
        void values();
    }

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ah$a = null;
        this.values = null;
        this.HaptikSDK$b = null;
        this.HaptikSDK$c = -1L;
        this.ah$b = new Handler(Looper.getMainLooper());
        this.toString = new Runnable() { // from class: com.clevertap.android.sdk.gif.GifImageView.1
            @Override // java.lang.Runnable
            public void run() {
                GifImageView.this.HaptikSDK$e = null;
                GifImageView.this.invoke = null;
                GifImageView.this.ag$a = null;
                GifImageView.this.HaptikSDK$d = false;
            }
        };
        this.getInitSettings = new Runnable() { // from class: com.clevertap.android.sdk.gif.GifImageView.4
            @Override // java.lang.Runnable
            public void run() {
                if (GifImageView.this.HaptikSDK$e == null || GifImageView.this.HaptikSDK$e.isRecycled()) {
                    return;
                }
                GifImageView gifImageView = GifImageView.this;
                gifImageView.setImageBitmap(gifImageView.HaptikSDK$e);
                GifImageView.this.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
        };
    }

    public GifImageView(Context context) {
        super(context);
        this.ah$a = null;
        this.values = null;
        this.HaptikSDK$b = null;
        this.HaptikSDK$c = -1L;
        this.ah$b = new Handler(Looper.getMainLooper());
        this.toString = new Runnable() { // from class: com.clevertap.android.sdk.gif.GifImageView.1
            @Override // java.lang.Runnable
            public void run() {
                GifImageView.this.HaptikSDK$e = null;
                GifImageView.this.invoke = null;
                GifImageView.this.ag$a = null;
                GifImageView.this.HaptikSDK$d = false;
            }
        };
        this.getInitSettings = new Runnable() { // from class: com.clevertap.android.sdk.gif.GifImageView.4
            @Override // java.lang.Runnable
            public void run() {
                if (GifImageView.this.HaptikSDK$e == null || GifImageView.this.HaptikSDK$e.isRecycled()) {
                    return;
                }
                GifImageView gifImageView = GifImageView.this;
                gifImageView.setImageBitmap(gifImageView.HaptikSDK$e);
                GifImageView.this.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
        };
    }

    public void ag$a() {
        this.valueOf = false;
        this.HaptikSDK$a = false;
        this.HaptikSDK$d = true;
        valueOf();
        this.ah$b.post(this.toString);
    }

    public void setFramesDisplayDuration(long j) {
        this.HaptikSDK$c = j;
    }

    public void setOnAnimationStop(toString tostring) {
        this.values = tostring;
    }

    public void setOnFrameAvailable(GifImageView$ag$a gifImageView$ag$a) {
        this.HaptikSDK$b = gifImageView$ag$a;
    }

    public void valueOf(int i) {
        if (this.invoke.ag$a() == i || !this.invoke.toString(i - 1) || this.valueOf) {
            return;
        }
        this.HaptikSDK$a = true;
        HaptikSDK$b();
    }

    @Override // java.lang.Runnable
    public void run() {
        long j;
        values valuesVar = this.ah$a;
        if (valuesVar != null) {
            valuesVar.values();
        }
        do {
            if (!this.valueOf && !this.HaptikSDK$a) {
                break;
            }
            boolean valueOf = this.invoke.valueOf();
            try {
                long nanoTime = System.nanoTime();
                Bitmap HaptikSDK$a = this.invoke.HaptikSDK$a();
                this.HaptikSDK$e = HaptikSDK$a;
                GifImageView$ag$a gifImageView$ag$a = this.HaptikSDK$b;
                if (gifImageView$ag$a != null) {
                    this.HaptikSDK$e = gifImageView$ag$a.values(HaptikSDK$a);
                }
                j = (System.nanoTime() - nanoTime) / 1000000;
                try {
                    this.ah$b.post(this.getInitSettings);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused) {
                }
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused2) {
                j = 0;
            }
            this.HaptikSDK$a = false;
            if (!this.valueOf || !valueOf) {
                this.valueOf = false;
                break;
            }
            try {
                int ah$a = (int) (this.invoke.ah$a() - j);
                if (ah$a > 0) {
                    long j2 = this.HaptikSDK$c;
                    if (j2 <= 0) {
                        j2 = ah$a;
                    }
                    Thread.sleep(j2);
                }
            } catch (InterruptedException unused3) {
            }
        } while (this.valueOf);
        if (this.HaptikSDK$d) {
            this.ah$b.post(this.toString);
        }
        this.ag$a = null;
        toString tostring = this.values;
        if (tostring != null) {
            tostring.ah$a();
        }
    }

    public void setBytes(byte[] bArr) {
        setTextSelection settextselection = new setTextSelection();
        this.invoke = settextselection;
        try {
            settextselection.toString(bArr);
            if (this.valueOf) {
                HaptikSDK$b();
            } else {
                valueOf(0);
            }
        } catch (Exception unused) {
            this.invoke = null;
        }
    }

    public void setOnAnimationStart(values valuesVar) {
        this.ah$a = valuesVar;
    }

    public void ah$a() {
        this.valueOf = true;
        HaptikSDK$b();
    }

    public void valueOf() {
        this.valueOf = false;
        Thread thread = this.ag$a;
        if (thread != null) {
            thread.interrupt();
            this.ag$a = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ag$a();
    }

    private boolean values() {
        return (this.valueOf || this.HaptikSDK$a) && this.invoke != null && this.ag$a == null;
    }

    private void HaptikSDK$b() {
        if (values()) {
            Thread thread = new Thread(this);
            this.ag$a = thread;
            thread.start();
        }
    }
}
