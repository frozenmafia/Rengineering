package com.fancode.video.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class ExoPlayerConfig implements Parcelable {
    public static final Parcelable.Creator<ExoPlayerConfig> CREATOR = new Parcelable.Creator<ExoPlayerConfig>() { // from class: com.fancode.video.base.ExoPlayerConfig$ah$a
        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public final ExoPlayerConfig[] newArray(int i) {
            return new ExoPlayerConfig[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: toString */
        public final ExoPlayerConfig createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "parcel");
            return new ExoPlayerConfig(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readFloat());
        }
    };
    private int HaptikSDK$a;
    private int HaptikSDK$b;
    private int HaptikSDK$c;
    private int HaptikWebView;
    private float ag$a;
    private int ah$a;
    private int ah$b;
    private int getInitSettings;
    private int getSignupData;
    private int invoke;
    private int toString;
    private float valueOf;
    private String values;

    public ExoPlayerConfig() {
        this(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 8191, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExoPlayerConfig) {
            ExoPlayerConfig exoPlayerConfig = (ExoPlayerConfig) obj;
            return runAnimators.values((Object) this.values, (Object) exoPlayerConfig.values) && this.getSignupData == exoPlayerConfig.getSignupData && this.HaptikSDK$c == exoPlayerConfig.HaptikSDK$c && this.ah$b == exoPlayerConfig.ah$b && this.HaptikSDK$a == exoPlayerConfig.HaptikSDK$a && this.toString == exoPlayerConfig.toString && this.ah$a == exoPlayerConfig.ah$a && this.HaptikWebView == exoPlayerConfig.HaptikWebView && this.HaptikSDK$b == exoPlayerConfig.HaptikSDK$b && this.invoke == exoPlayerConfig.invoke && this.getInitSettings == exoPlayerConfig.getInitSettings && runAnimators.values(Float.valueOf(this.ag$a), Float.valueOf(exoPlayerConfig.ag$a)) && runAnimators.values(Float.valueOf(this.valueOf), Float.valueOf(exoPlayerConfig.valueOf));
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.values.hashCode() * 31) + this.getSignupData) * 31) + this.HaptikSDK$c) * 31) + this.ah$b) * 31) + this.HaptikSDK$a) * 31) + this.toString) * 31) + this.ah$a) * 31) + this.HaptikWebView) * 31) + this.HaptikSDK$b) * 31) + this.invoke) * 31) + this.getInitSettings) * 31) + Float.floatToIntBits(this.ag$a)) * 31) + Float.floatToIntBits(this.valueOf);
    }

    public String toString() {
        String str = this.values;
        int i = this.getSignupData;
        int i2 = this.HaptikSDK$c;
        int i3 = this.ah$b;
        int i4 = this.HaptikSDK$a;
        int i5 = this.toString;
        int i6 = this.ah$a;
        int i7 = this.HaptikWebView;
        int i8 = this.HaptikSDK$b;
        int i9 = this.invoke;
        int i10 = this.getInitSettings;
        float f = this.ag$a;
        float f2 = this.valueOf;
        return "ExoPlayerConfig(configId=" + str + ", minOffsetToLiveEdge=" + i + ", maxOffsetToLiveEdge=" + i2 + ", minBufferMs=" + i3 + ", maxBufferMs=" + i4 + ", bufferForPlaybackMs=" + i5 + ", bufferForPlaybackAfterRebufferMs=" + i6 + ", targetBufferBytes=" + i7 + ", minDurationForQualityIncreaseMs=" + i8 + ", maxDurationForQualityDecreaseMs=" + i9 + ", minDurationToRetainAfterDiscardMs=" + i10 + ", bandwidthFraction=" + f + ", bufferedFractionToLiveEdgeForQualityIncrease=" + f2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "out");
        parcel.writeString(this.values);
        parcel.writeInt(this.getSignupData);
        parcel.writeInt(this.HaptikSDK$c);
        parcel.writeInt(this.ah$b);
        parcel.writeInt(this.HaptikSDK$a);
        parcel.writeInt(this.toString);
        parcel.writeInt(this.ah$a);
        parcel.writeInt(this.HaptikWebView);
        parcel.writeInt(this.HaptikSDK$b);
        parcel.writeInt(this.invoke);
        parcel.writeInt(this.getInitSettings);
        parcel.writeFloat(this.ag$a);
        parcel.writeFloat(this.valueOf);
    }

    public ExoPlayerConfig(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, float f2) {
        runAnimators.ag$a(str, "configId");
        this.values = str;
        this.getSignupData = i;
        this.HaptikSDK$c = i2;
        this.ah$b = i3;
        this.HaptikSDK$a = i4;
        this.toString = i5;
        this.ah$a = i6;
        this.HaptikWebView = i7;
        this.HaptikSDK$b = i8;
        this.invoke = i9;
        this.getInitSettings = i10;
        this.ag$a = f;
        this.valueOf = f2;
    }

    public /* synthetic */ ExoPlayerConfig(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, float f2, int i11, getTargetTypes gettargettypes) {
        this((i11 & 1) != 0 ? "DEFAULT" : str, (i11 & 2) != 0 ? 0 : i, (i11 & 4) == 0 ? i2 : 0, (i11 & 8) != 0 ? 50000 : i3, (i11 & 16) == 0 ? i4 : 50000, (i11 & 32) != 0 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : i5, (i11 & 64) != 0 ? 5000 : i6, (i11 & 128) != 0 ? -1 : i7, (i11 & 256) != 0 ? 10000 : i8, (i11 & 512) != 0 ? 25000 : i9, (i11 & 1024) == 0 ? i10 : 25000, (i11 & 2048) != 0 ? 0.7f : f, (i11 & 4096) != 0 ? 0.75f : f2);
    }

    public final int ag$a() {
        return this.HaptikSDK$b;
    }

    public final int valueOf() {
        return this.invoke;
    }

    public final int ah$b() {
        return this.getInitSettings;
    }

    public final float values() {
        return this.ag$a;
    }

    public final float ah$a() {
        return this.valueOf;
    }
}
