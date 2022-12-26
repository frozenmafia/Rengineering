package o;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LocaleListCompatWrapper extends MediaCodec.Callback {
    private IllegalStateException HaptikSDK$a;
    private Handler HaptikSDK$b;
    private MediaCodec.CodecException HaptikSDK$c;
    private MediaFormat HaptikSDK$e;
    private long HaptikWebView;
    private boolean getInitSettings;
    private final HandlerThread toString;
    private MediaFormat valueOf;
    private final Object ah$b = new Object();
    private final matchScore values = new matchScore();
    private final matchScore ah$a = new matchScore();
    private final ArrayDeque<MediaCodec.BufferInfo> ag$a = new ArrayDeque<>();
    private final ArrayDeque<MediaFormat> invoke = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocaleListCompatWrapper(HandlerThread handlerThread) {
        this.toString = handlerThread;
    }

    public void toString(MediaCodec mediaCodec) {
        FingerprintManagerCompat.ah$a(this.HaptikSDK$b == null);
        this.toString.start();
        Handler handler = new Handler(this.toString.getLooper());
        mediaCodec.setCallback(this, handler);
        this.HaptikSDK$b = handler;
    }

    public void ah$a() {
        synchronized (this.ah$b) {
            this.getInitSettings = true;
            this.toString.quit();
            HaptikSDK$b();
        }
    }

    public int ag$a() {
        synchronized (this.ah$b) {
            int i = -1;
            if (invoke()) {
                return -1;
            }
            HaptikSDK$c();
            if (!this.values.ag$a()) {
                i = this.values.values();
            }
            return i;
        }
    }

    public int ah$a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.ah$b) {
            if (invoke()) {
                return -1;
            }
            HaptikSDK$c();
            if (this.ah$a.ag$a()) {
                return -1;
            }
            int values = this.ah$a.values();
            if (values >= 0) {
                FingerprintManagerCompat.ag$a(this.valueOf);
                MediaCodec.BufferInfo remove = this.ag$a.remove();
                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
            } else if (values == -2) {
                this.valueOf = this.invoke.remove();
            }
            return values;
        }
    }

    public MediaFormat values() {
        MediaFormat mediaFormat;
        synchronized (this.ah$b) {
            mediaFormat = this.valueOf;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void valueOf() {
        synchronized (this.ah$b) {
            this.HaptikWebView++;
            ((Handler) getElevationDegrees.ah$a(this.HaptikSDK$b)).post(new Runnable() { // from class: o.getEmptyLocaleList
                @Override // java.lang.Runnable
                public final void run() {
                    LocaleListCompatWrapper.this.getSignupData();
                }
            });
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.ah$b) {
            this.values.valueOf(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.ah$b) {
            MediaFormat mediaFormat = this.HaptikSDK$e;
            if (mediaFormat != null) {
                toString(mediaFormat);
                this.HaptikSDK$e = null;
            }
            this.ah$a.valueOf(i);
            this.ag$a.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.ah$b) {
            this.HaptikSDK$c = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.ah$b) {
            toString(mediaFormat);
            this.HaptikSDK$e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getSignupData() {
        synchronized (this.ah$b) {
            if (this.getInitSettings) {
                return;
            }
            long j = this.HaptikWebView - 1;
            this.HaptikWebView = j;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0) {
                return;
            }
            if (i < 0) {
                values(new IllegalStateException());
            } else {
                HaptikSDK$b();
            }
        }
    }

    private void HaptikSDK$b() {
        if (!this.invoke.isEmpty()) {
            this.HaptikSDK$e = this.invoke.getLast();
        }
        this.values.ah$a();
        this.ah$a.ah$a();
        this.ag$a.clear();
        this.invoke.clear();
        this.HaptikSDK$c = null;
    }

    private boolean invoke() {
        return this.HaptikWebView > 0 || this.getInitSettings;
    }

    private void toString(MediaFormat mediaFormat) {
        this.ah$a.valueOf(-2);
        this.invoke.add(mediaFormat);
    }

    private void HaptikSDK$c() {
        HaptikSDK$a();
        ah$b();
    }

    private void HaptikSDK$a() {
        IllegalStateException illegalStateException = this.HaptikSDK$a;
        if (illegalStateException == null) {
            return;
        }
        this.HaptikSDK$a = null;
        throw illegalStateException;
    }

    private void ah$b() {
        MediaCodec.CodecException codecException = this.HaptikSDK$c;
        if (codecException == null) {
            return;
        }
        this.HaptikSDK$c = null;
        throw codecException;
    }

    private void values(IllegalStateException illegalStateException) {
        synchronized (this.ah$b) {
            this.HaptikSDK$a = illegalStateException;
        }
    }
}
