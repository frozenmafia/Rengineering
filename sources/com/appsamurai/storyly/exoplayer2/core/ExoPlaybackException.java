package com.appsamurai.storyly.exoplayer2.core;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appsamurai.storyly.exoplayer2.common.PlaybackException;
import java.io.IOException;
import o.FingerprintManagerCompat;
import o.LocationCompat;
import o.createFromIcon;
import o.getColorFilter$ah$a;
import o.getElevationDegrees;
import o.setMipMap;
/* loaded from: classes3.dex */
public final class ExoPlaybackException extends PlaybackException {
    public static final getColorFilter$ah$a<ExoPlaybackException> CREATOR = LocationCompat.valueOf;
    private static final int FIELD_IS_RECOVERABLE = 1006;
    private static final int FIELD_RENDERER_FORMAT = 1004;
    private static final int FIELD_RENDERER_FORMAT_SUPPORT = 1005;
    private static final int FIELD_RENDERER_INDEX = 1003;
    private static final int FIELD_RENDERER_NAME = 1002;
    private static final int FIELD_TYPE = 1001;
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    public final boolean isRecoverable;
    public final setMipMap mediaPeriodId;
    public final createFromIcon rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final int type;

    public static /* synthetic */ ExoPlaybackException $r8$lambda$_LogRwFPFgB4tWhYPK4iXFSNZEs(Bundle bundle) {
        return new ExoPlaybackException(bundle);
    }

    public static ExoPlaybackException createForSource(IOException iOException, int i) {
        return new ExoPlaybackException(0, iOException, i);
    }

    public static ExoPlaybackException createForRenderer(Throwable th, String str, int i, createFromIcon createfromicon, int i2, boolean z, int i3) {
        return new ExoPlaybackException(1, th, null, i3, str, i, createfromicon, createfromicon == null ? 4 : i2, z);
    }

    @Deprecated
    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return createForUnexpected(runtimeException, 1000);
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException, int i) {
        return new ExoPlaybackException(2, runtimeException, i);
    }

    public static ExoPlaybackException createForRemote(String str) {
        return new ExoPlaybackException(3, null, str, 1001, null, -1, null, 4, false);
    }

    private ExoPlaybackException(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    private ExoPlaybackException(int i, Throwable th, String str, int i2, String str2, int i3, createFromIcon createfromicon, int i4, boolean z) {
        this(deriveMessage(i, str, str2, i3, createfromicon, i4), th, i2, i, str2, i3, createfromicon, i4, null, SystemClock.elapsedRealtime(), z);
    }

    private ExoPlaybackException(Bundle bundle) {
        super(bundle);
        this.type = bundle.getInt(keyForField(1001), 2);
        this.rendererName = bundle.getString(keyForField(1002));
        this.rendererIndex = bundle.getInt(keyForField(1003), -1);
        Bundle bundle2 = bundle.getBundle(keyForField(1004));
        this.rendererFormat = bundle2 == null ? null : createFromIcon.ah$a.ah$a(bundle2);
        this.rendererFormatSupport = bundle.getInt(keyForField(1005), 4);
        this.isRecoverable = bundle.getBoolean(keyForField(1006), false);
        this.mediaPeriodId = null;
    }

    private ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, createFromIcon createfromicon, int i4, setMipMap setmipmap, long j, boolean z) {
        super(str, th, i, j);
        boolean z2 = false;
        FingerprintManagerCompat.toString(!z || i2 == 1);
        FingerprintManagerCompat.toString((th != null || i2 == 3) ? true : true);
        this.type = i2;
        this.rendererName = str2;
        this.rendererIndex = i3;
        this.rendererFormat = createfromicon;
        this.rendererFormatSupport = i4;
        this.mediaPeriodId = setmipmap;
        this.isRecoverable = z;
    }

    public IOException getSourceException() {
        FingerprintManagerCompat.ah$a(this.type == 0);
        return (IOException) FingerprintManagerCompat.toString(getCause());
    }

    public Exception getRendererException() {
        FingerprintManagerCompat.ah$a(this.type == 1);
        return (Exception) FingerprintManagerCompat.toString(getCause());
    }

    public RuntimeException getUnexpectedException() {
        FingerprintManagerCompat.ah$a(this.type == 2);
        return (RuntimeException) FingerprintManagerCompat.toString(getCause());
    }

    @Override // com.appsamurai.storyly.exoplayer2.common.PlaybackException
    public boolean errorInfoEquals(PlaybackException playbackException) {
        if (super.errorInfoEquals(playbackException)) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) getElevationDegrees.ah$a(playbackException);
            return this.type == exoPlaybackException.type && getElevationDegrees.values(this.rendererName, exoPlaybackException.rendererName) && this.rendererIndex == exoPlaybackException.rendererIndex && getElevationDegrees.values(this.rendererFormat, exoPlaybackException.rendererFormat) && this.rendererFormatSupport == exoPlaybackException.rendererFormatSupport && getElevationDegrees.values(this.mediaPeriodId, exoPlaybackException.mediaPeriodId) && this.isRecoverable == exoPlaybackException.isRecoverable;
        }
        return false;
    }

    public ExoPlaybackException copyWithMediaPeriodId(setMipMap setmipmap) {
        return new ExoPlaybackException((String) getElevationDegrees.ah$a(getMessage()), getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, setmipmap, this.timestampMs, this.isRecoverable);
    }

    private static String deriveMessage(int i, String str, String str2, int i2, createFromIcon createfromicon, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i2 + ", format=" + createfromicon + ", format_supported=" + getElevationDegrees.ah$a(i3);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    @Override // com.appsamurai.storyly.exoplayer2.common.PlaybackException, o.getColorFilter
    public Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putInt(keyForField(1001), this.type);
        bundle.putString(keyForField(1002), this.rendererName);
        bundle.putInt(keyForField(1003), this.rendererIndex);
        if (this.rendererFormat != null) {
            bundle.putBundle(keyForField(1004), this.rendererFormat.toBundle());
        }
        bundle.putInt(keyForField(1005), this.rendererFormatSupport);
        bundle.putBoolean(keyForField(1006), this.isRecoverable);
        return bundle;
    }
}
