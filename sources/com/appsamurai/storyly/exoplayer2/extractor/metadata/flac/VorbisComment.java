package com.appsamurai.storyly.exoplayer2.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import com.appsamurai.storyly.exoplayer2.common.metadata.Metadata;
import o.createFromIcon;
import o.getElevationDegrees;
import o.getResId;
import o.updateDstRect;
@Deprecated
/* loaded from: classes3.dex */
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new Parcelable.Creator<VorbisComment>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.flac.VorbisComment.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public VorbisComment[] newArray(int i) {
            return new VorbisComment[i];
        }
    };
    public final String valueOf;
    public final String values;

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

    public VorbisComment(String str, String str2) {
        this.valueOf = str;
        this.values = str2;
    }

    public VorbisComment(Parcel parcel) {
        this.valueOf = (String) getElevationDegrees.ah$a(parcel.readString());
        this.values = (String) getElevationDegrees.ah$a(parcel.readString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.Entry
    public void valueOf(getResId.values valuesVar) {
        char c;
        String str = this.valueOf;
        str.hashCode();
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            valuesVar.ah$a(this.values);
        } else if (c == 1) {
            valuesVar.HaptikSDK$e(this.values);
        } else if (c == 2) {
            valuesVar.HaptikSDK$b(this.values);
        } else if (c == 3) {
            valuesVar.valueOf(this.values);
        } else if (c != 4) {
        } else {
            valuesVar.toString(this.values);
        }
    }

    public String toString() {
        return "VC: " + this.valueOf + "=" + this.values;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.valueOf.equals(vorbisComment.valueOf) && this.values.equals(vorbisComment.values);
    }

    public int hashCode() {
        return ((this.valueOf.hashCode() + BR.userTeamVM) * 31) + this.values.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.valueOf);
        parcel.writeString(this.values);
    }
}
