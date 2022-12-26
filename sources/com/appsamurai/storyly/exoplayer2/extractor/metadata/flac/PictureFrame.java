package com.appsamurai.storyly.exoplayer2.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import com.appsamurai.storyly.exoplayer2.common.metadata.Metadata;
import java.util.Arrays;
import o.C$default$setContentDescription;
import o.addUpdateOp;
import o.createFromIcon;
import o.getElevationDegrees;
import o.getResId;
import o.updateDstRect;
/* loaded from: classes3.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new Parcelable.Creator<PictureFrame>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.flac.PictureFrame.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public PictureFrame[] newArray(int i) {
            return new PictureFrame[i];
        }
    };
    public final byte[] HaptikSDK$a;
    public final int HaptikSDK$c;
    public final String ag$a;
    public final int ah$a;
    public final int ah$b;
    public final String toString;
    public final int valueOf;
    public final int values;

    @Override // com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.Entry
    public /* synthetic */ byte[] ah$a() {
        return updateDstRect.toString(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.Entry
    public /* synthetic */ createFromIcon valueOf() {
        return updateDstRect.valueOf(this);
    }

    public PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.HaptikSDK$c = i;
        this.toString = str;
        this.ag$a = str2;
        this.ah$b = i2;
        this.ah$a = i3;
        this.values = i4;
        this.valueOf = i5;
        this.HaptikSDK$a = bArr;
    }

    PictureFrame(Parcel parcel) {
        this.HaptikSDK$c = parcel.readInt();
        this.toString = (String) getElevationDegrees.ah$a(parcel.readString());
        this.ag$a = (String) getElevationDegrees.ah$a(parcel.readString());
        this.ah$b = parcel.readInt();
        this.ah$a = parcel.readInt();
        this.values = parcel.readInt();
        this.valueOf = parcel.readInt();
        this.HaptikSDK$a = (byte[]) getElevationDegrees.ah$a(parcel.createByteArray());
    }

    @Override // com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.Entry
    public void valueOf(getResId.values valuesVar) {
        valuesVar.ag$a(this.HaptikSDK$a, this.HaptikSDK$c);
    }

    public String toString() {
        return "Picture: mimeType=" + this.toString + ", description=" + this.ag$a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.HaptikSDK$c == pictureFrame.HaptikSDK$c && this.toString.equals(pictureFrame.toString) && this.ag$a.equals(pictureFrame.ag$a) && this.ah$b == pictureFrame.ah$b && this.ah$a == pictureFrame.ah$a && this.values == pictureFrame.values && this.valueOf == pictureFrame.valueOf && Arrays.equals(this.HaptikSDK$a, pictureFrame.HaptikSDK$a);
    }

    public int hashCode() {
        int i = this.HaptikSDK$c;
        int hashCode = this.toString.hashCode();
        int hashCode2 = this.ag$a.hashCode();
        int i2 = this.ah$b;
        int i3 = this.ah$a;
        int i4 = this.values;
        return ((((((((((((((i + BR.userTeamVM) * 31) + hashCode) * 31) + hashCode2) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + this.valueOf) * 31) + Arrays.hashCode(this.HaptikSDK$a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.HaptikSDK$c);
        parcel.writeString(this.toString);
        parcel.writeString(this.ag$a);
        parcel.writeInt(this.ah$b);
        parcel.writeInt(this.ah$a);
        parcel.writeInt(this.values);
        parcel.writeInt(this.valueOf);
        parcel.writeByteArray(this.HaptikSDK$a);
    }

    public static PictureFrame ag$a(C$default$setContentDescription c$default$setContentDescription) {
        int signupData = c$default$setContentDescription.getSignupData();
        String ag$a = c$default$setContentDescription.ag$a(c$default$setContentDescription.getSignupData(), addUpdateOp.values);
        String ag$a2 = c$default$setContentDescription.ag$a(c$default$setContentDescription.getSignupData());
        int signupData2 = c$default$setContentDescription.getSignupData();
        int signupData3 = c$default$setContentDescription.getSignupData();
        int signupData4 = c$default$setContentDescription.getSignupData();
        int signupData5 = c$default$setContentDescription.getSignupData();
        int signupData6 = c$default$setContentDescription.getSignupData();
        byte[] bArr = new byte[signupData6];
        c$default$setContentDescription.valueOf(bArr, 0, signupData6);
        return new PictureFrame(signupData, ag$a, ag$a2, signupData2, signupData3, signupData4, signupData5, bArr);
    }
}
