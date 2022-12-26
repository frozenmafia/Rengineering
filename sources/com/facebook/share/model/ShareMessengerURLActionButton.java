package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {
    private final WebviewHeightRatio HaptikSDK$a;
    private final boolean ag$a;
    private final Uri ah$a;
    private final boolean valueOf;
    private final Uri values;
    public static final toString toString = new toString(null);
    public static final Parcelable.Creator<ShareMessengerURLActionButton> CREATOR = new values();

    /* loaded from: classes6.dex */
    public enum WebviewHeightRatio {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static WebviewHeightRatio[] valuesCustom() {
            WebviewHeightRatio[] valuesCustom = values();
            return (WebviewHeightRatio[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareMessengerURLActionButton(Parcel parcel) {
        super(parcel);
        runAnimators.ag$a(parcel, "parcel");
        this.values = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.ag$a = parcel.readByte() != 0;
        this.ah$a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.HaptikSDK$a = (WebviewHeightRatio) parcel.readSerializable();
        this.valueOf = parcel.readByte() != 0;
    }

    @Override // com.facebook.share.model.ShareMessengerActionButton, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "dest");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.values, 0);
        parcel.writeByte(this.ag$a ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.ah$a, 0);
        parcel.writeSerializable(this.HaptikSDK$a);
        parcel.writeByte(this.ag$a ? (byte) 1 : (byte) 0);
    }

    /* loaded from: classes6.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class values implements Parcelable.Creator<ShareMessengerURLActionButton> {
        values() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public ShareMessengerURLActionButton createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "parcel");
            return new ShareMessengerURLActionButton(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public ShareMessengerURLActionButton[] newArray(int i) {
            return new ShareMessengerURLActionButton[i];
        }
    }
}
