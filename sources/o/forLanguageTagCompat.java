package o;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import o.computeFirstMatchIndex;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class forLanguageTagCompat implements computeFirstMatchIndex {
    private int ag$a;
    private final getFirstMatch ah$a;
    private final boolean invoke;
    private final MediaCodec toString;
    private boolean valueOf;
    private final LocaleListCompatWrapper values;

    @Override // o.computeFirstMatchIndex
    public boolean values() {
        return false;
    }

    private forLanguageTagCompat(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.toString = mediaCodec;
        this.values = new LocaleListCompatWrapper(handlerThread);
        this.ah$a = new getFirstMatch(mediaCodec, handlerThread2);
        this.invoke = z;
        this.ag$a = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah$a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.values.toString(this.toString);
        getBasebandCn0DbHz.toString("configureCodec");
        this.toString.configure(mediaFormat, surface, mediaCrypto, i);
        getBasebandCn0DbHz.ag$a();
        this.ah$a.valueOf();
        getBasebandCn0DbHz.toString("startCodec");
        this.toString.start();
        getBasebandCn0DbHz.ag$a();
        this.ag$a = 1;
    }

    @Override // o.computeFirstMatchIndex
    public void ag$a(int i, int i2, int i3, long j, int i4) {
        this.ah$a.values(i, i2, i3, j, i4);
    }

    @Override // o.computeFirstMatchIndex
    public void valueOf(int i, int i2, getIconView geticonview, long j, int i3) {
        this.ah$a.toString(i, i2, geticonview, j, i3);
    }

    @Override // o.computeFirstMatchIndex
    public void valueOf(int i, boolean z) {
        this.toString.releaseOutputBuffer(i, z);
    }

    @Override // o.computeFirstMatchIndex
    public void ah$a(int i, long j) {
        this.toString.releaseOutputBuffer(i, j);
    }

    @Override // o.computeFirstMatchIndex
    public int ag$a() {
        return this.values.ag$a();
    }

    @Override // o.computeFirstMatchIndex
    public int valueOf(MediaCodec.BufferInfo bufferInfo) {
        return this.values.ah$a(bufferInfo);
    }

    @Override // o.computeFirstMatchIndex
    public MediaFormat ah$a() {
        return this.values.values();
    }

    @Override // o.computeFirstMatchIndex
    public ByteBuffer ah$a(int i) {
        return this.toString.getInputBuffer(i);
    }

    @Override // o.computeFirstMatchIndex
    public ByteBuffer ag$a(int i) {
        return this.toString.getOutputBuffer(i);
    }

    @Override // o.computeFirstMatchIndex
    public void valueOf() {
        this.ah$a.ag$a();
        this.toString.flush();
        this.values.valueOf();
        this.toString.start();
    }

    @Override // o.computeFirstMatchIndex
    public void HaptikSDK$c() {
        try {
            if (this.ag$a == 1) {
                this.ah$a.ah$a();
                this.values.ah$a();
            }
            this.ag$a = 2;
        } finally {
            if (!this.valueOf) {
                this.toString.release();
                this.valueOf = true;
            }
        }
    }

    @Override // o.computeFirstMatchIndex
    public void toString(final computeFirstMatchIndex.values valuesVar, Handler handler) {
        HaptikSDK$b();
        this.toString.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: o.LocaleListCompat
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                forLanguageTagCompat.this.ag$a(valuesVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    public /* synthetic */ void ag$a(computeFirstMatchIndex.values valuesVar, MediaCodec mediaCodec, long j, long j2) {
        valuesVar.ah$a(this, j, j2);
    }

    @Override // o.computeFirstMatchIndex
    public void valueOf(Surface surface) {
        HaptikSDK$b();
        this.toString.setOutputSurface(surface);
    }

    @Override // o.computeFirstMatchIndex
    public void valueOf(Bundle bundle) {
        HaptikSDK$b();
        this.toString.setParameters(bundle);
    }

    @Override // o.computeFirstMatchIndex
    public void valueOf(int i) {
        HaptikSDK$b();
        this.toString.setVideoScalingMode(i);
    }

    private void HaptikSDK$b() {
        if (this.invoke) {
            try {
                this.ah$a.values();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String toString(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }
}
