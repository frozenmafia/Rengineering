package com.appsamurai.storyly.exoplayer2.extractor.metadata.scte35;

import com.appsamurai.storyly.exoplayer2.common.metadata.Metadata;
import o.createFromIcon;
import o.getResId;
import o.updateDstRect;
/* loaded from: classes3.dex */
public abstract class SpliceCommand implements Metadata.Entry {
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

    public String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
