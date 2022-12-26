package com.appsamurai.storyly.exoplayer2.extractor.metadata.vorbis;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes3.dex */
public final class VorbisComment extends com.appsamurai.storyly.exoplayer2.extractor.metadata.flac.VorbisComment {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new Parcelable.Creator<VorbisComment>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.vorbis.VorbisComment.5
        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public VorbisComment[] newArray(int i) {
            return new VorbisComment[i];
        }
    };

    public VorbisComment(String str, String str2) {
        super(str, str2);
    }

    VorbisComment(Parcel parcel) {
        super(parcel);
    }
}
