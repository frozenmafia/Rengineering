package com.appsamurai.storyly.exoplayer2.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import com.appsamurai.storyly.exoplayer2.common.metadata.Metadata;
import com.google.common.primitives.Floats;
import o.createFromIcon;
import o.getResId;
import o.updateDstRect;
/* loaded from: classes3.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new Parcelable.Creator<SmtaMetadataEntry>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.mp4.SmtaMetadataEntry.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: toString */
        public SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public SmtaMetadataEntry[] newArray(int i) {
            return new SmtaMetadataEntry[i];
        }
    };
    public final float ah$a;
    public final int toString;

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

    @Override // com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.Entry
    public /* synthetic */ void valueOf(getResId.values valuesVar) {
        updateDstRect.valueOf(this, valuesVar);
    }

    public SmtaMetadataEntry(float f, int i) {
        this.ah$a = f;
        this.toString = i;
    }

    private SmtaMetadataEntry(Parcel parcel) {
        this.ah$a = parcel.readFloat();
        this.toString = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        return this.ah$a == smtaMetadataEntry.ah$a && this.toString == smtaMetadataEntry.toString;
    }

    public int hashCode() {
        return ((Floats.ah$a(this.ah$a) + BR.userTeamVM) * 31) + this.toString;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.ah$a + ", svcTemporalLayerCount=" + this.toString;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.ah$a);
        parcel.writeInt(this.toString);
    }
}
