package com.giphy.sdk.ui.drawables;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.imagepipeline.producers.DecodeProducer;
import o.runAnimators;
/* loaded from: classes7.dex */
public final class ImageUriInfo implements Parcelable {
    public static final Parcelable.Creator<ImageUriInfo> CREATOR = new toString();
    private final ImageFormat ah$a;
    private final int toString;
    private final Uri valueOf;

    /* loaded from: classes7.dex */
    public static final class toString implements Parcelable.Creator<ImageUriInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public final ImageUriInfo createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            return new ImageUriInfo((Uri) parcel.readParcelable(ImageUriInfo.class.getClassLoader()), parcel.readInt(), (ImageFormat) Enum.valueOf(ImageFormat.class, parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public final ImageUriInfo[] newArray(int i) {
            return new ImageUriInfo[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "parcel");
        parcel.writeParcelable(this.valueOf, i);
        parcel.writeInt(this.toString);
        parcel.writeString(this.ah$a.name());
    }

    public ImageUriInfo(Uri uri, int i, ImageFormat imageFormat) {
        runAnimators.ag$a(uri, "uri");
        runAnimators.ag$a(imageFormat, DecodeProducer.EXTRA_IMAGE_FORMAT_NAME);
        this.valueOf = uri;
        this.toString = i;
        this.ah$a = imageFormat;
    }

    public final Uri ag$a() {
        return this.valueOf;
    }
}
