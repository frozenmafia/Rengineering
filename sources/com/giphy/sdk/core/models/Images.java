package com.giphy.sdk.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.giphy.sdk.core.models.enums.RenditionType;
import o.getTargetTypes;
import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class Images implements Parcelable {
    public static final Parcelable.Creator<Images> CREATOR = new Creator();
    private final Image downsized;
    @isFullSpan(valueOf = "downsized_large")
    private final Image downsizedLarge;
    @isFullSpan(valueOf = "downsized_medium")
    private final Image downsizedMedium;
    @isFullSpan(valueOf = "downsized_small")
    private final Image downsizedSmall;
    @isFullSpan(valueOf = "downsized_still")
    private final Image downsizedStill;
    @isFullSpan(valueOf = "fixed_height")
    private final Image fixedHeight;
    @isFullSpan(valueOf = "fixed_height_downsampled")
    private Image fixedHeightDownsampled;
    @isFullSpan(valueOf = "fixed_height_small")
    private Image fixedHeightSmall;
    @isFullSpan(valueOf = "fixed_height_small_still")
    private Image fixedHeightSmallStill;
    @isFullSpan(valueOf = "fixed_height_still")
    private final Image fixedHeightStill;
    @isFullSpan(valueOf = "fixed_width")
    private final Image fixedWidth;
    @isFullSpan(valueOf = "fixed_width_downsampled")
    private Image fixedWidthDownsampled;
    @isFullSpan(valueOf = "fixed_width_small")
    private Image fixedWidthSmall;
    @isFullSpan(valueOf = "fixed_width_small_still")
    private Image fixedWidthSmallStill;
    @isFullSpan(valueOf = "fixed_width_still")
    private final Image fixedWidthStill;
    private final Image looping;
    private String mediaId;
    private Image original;
    @isFullSpan(valueOf = "original_still")
    private final Image originalStill;
    private final Image preview;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Images> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Images createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "in");
            return new Images(parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Images[] newArray(int i) {
            return new Images[i];
        }
    }

    public Images() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "parcel");
        Image image = this.fixedHeight;
        if (image != null) {
            parcel.writeInt(1);
            image.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Image image2 = this.fixedHeightStill;
        if (image2 != null) {
            parcel.writeInt(1);
            image2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Image image3 = this.fixedHeightDownsampled;
        if (image3 != null) {
            parcel.writeInt(1);
            image3.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Image image4 = this.fixedWidth;
        if (image4 != null) {
            parcel.writeInt(1);
            image4.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Image image5 = this.fixedWidthStill;
        if (image5 != null) {
            parcel.writeInt(1);
            image5.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Image image6 = this.fixedWidthDownsampled;
        if (image6 != null) {
            parcel.writeInt(1);
            image6.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Image image7 = this.fixedHeightSmall;
        if (image7 != null) {
            parcel.writeInt(1);
            image7.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Image image8 = this.fixedHeightSmallStill;
        if (image8 != null) {
            parcel.writeInt(1);
            image8.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Image image9 = this.fixedWidthSmall;
        if (image9 != null) {
            parcel.writeInt(1);
            image9.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Image image10 = this.fixedWidthSmallStill;
        if (image10 != null) {
            parcel.writeInt(1);
            image10.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Image image11 = this.downsized;
        if (image11 != null) {
            parcel.writeInt(1);
            image11.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Image image12 = this.downsizedStill;
        if (image12 != null) {
            parcel.writeInt(1);
            image12.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Image image13 = this.downsizedLarge;
        if (image13 != null) {
            parcel.writeInt(1);
            image13.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Image image14 = this.downsizedMedium;
        if (image14 != null) {
            parcel.writeInt(1);
            image14.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Image image15 = this.original;
        if (image15 != null) {
            parcel.writeInt(1);
            image15.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Image image16 = this.originalStill;
        if (image16 != null) {
            parcel.writeInt(1);
            image16.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Image image17 = this.looping;
        if (image17 != null) {
            parcel.writeInt(1);
            image17.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Image image18 = this.preview;
        if (image18 != null) {
            parcel.writeInt(1);
            image18.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Image image19 = this.downsizedSmall;
        if (image19 != null) {
            parcel.writeInt(1);
            image19.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.mediaId);
    }

    public Images(Image image, Image image2, Image image3, Image image4, Image image5, Image image6, Image image7, Image image8, Image image9, Image image10, Image image11, Image image12, Image image13, Image image14, Image image15, Image image16, Image image17, Image image18, Image image19, String str) {
        this.fixedHeight = image;
        this.fixedHeightStill = image2;
        this.fixedHeightDownsampled = image3;
        this.fixedWidth = image4;
        this.fixedWidthStill = image5;
        this.fixedWidthDownsampled = image6;
        this.fixedHeightSmall = image7;
        this.fixedHeightSmallStill = image8;
        this.fixedWidthSmall = image9;
        this.fixedWidthSmallStill = image10;
        this.downsized = image11;
        this.downsizedStill = image12;
        this.downsizedLarge = image13;
        this.downsizedMedium = image14;
        this.original = image15;
        this.originalStill = image16;
        this.looping = image17;
        this.preview = image18;
        this.downsizedSmall = image19;
        this.mediaId = str;
    }

    public /* synthetic */ Images(Image image, Image image2, Image image3, Image image4, Image image5, Image image6, Image image7, Image image8, Image image9, Image image10, Image image11, Image image12, Image image13, Image image14, Image image15, Image image16, Image image17, Image image18, Image image19, String str, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : image, (i & 2) != 0 ? null : image2, (i & 4) != 0 ? null : image3, (i & 8) != 0 ? null : image4, (i & 16) != 0 ? null : image5, (i & 32) != 0 ? null : image6, (i & 64) != 0 ? null : image7, (i & 128) != 0 ? null : image8, (i & 256) != 0 ? null : image9, (i & 512) != 0 ? null : image10, (i & 1024) != 0 ? null : image11, (i & 2048) != 0 ? null : image12, (i & 4096) != 0 ? null : image13, (i & 8192) != 0 ? null : image14, (i & 16384) != 0 ? null : image15, (i & 32768) != 0 ? null : image16, (i & 65536) != 0 ? null : image17, (i & 131072) != 0 ? null : image18, (i & 262144) != 0 ? null : image19, (i & 524288) != 0 ? null : str);
    }

    public final Image getFixedHeight() {
        return this.fixedHeight;
    }

    public final Image getFixedHeightStill() {
        return this.fixedHeightStill;
    }

    public final Image getFixedHeightDownsampled() {
        return this.fixedHeightDownsampled;
    }

    public final void setFixedHeightDownsampled(Image image) {
        this.fixedHeightDownsampled = image;
    }

    public final Image getFixedWidth() {
        return this.fixedWidth;
    }

    public final Image getFixedWidthStill() {
        return this.fixedWidthStill;
    }

    public final Image getFixedWidthDownsampled() {
        return this.fixedWidthDownsampled;
    }

    public final void setFixedWidthDownsampled(Image image) {
        this.fixedWidthDownsampled = image;
    }

    public final Image getFixedHeightSmall() {
        return this.fixedHeightSmall;
    }

    public final void setFixedHeightSmall(Image image) {
        this.fixedHeightSmall = image;
    }

    public final Image getFixedHeightSmallStill() {
        return this.fixedHeightSmallStill;
    }

    public final void setFixedHeightSmallStill(Image image) {
        this.fixedHeightSmallStill = image;
    }

    public final Image getFixedWidthSmall() {
        return this.fixedWidthSmall;
    }

    public final void setFixedWidthSmall(Image image) {
        this.fixedWidthSmall = image;
    }

    public final Image getFixedWidthSmallStill() {
        return this.fixedWidthSmallStill;
    }

    public final void setFixedWidthSmallStill(Image image) {
        this.fixedWidthSmallStill = image;
    }

    public final Image getDownsized() {
        return this.downsized;
    }

    public final Image getDownsizedStill() {
        return this.downsizedStill;
    }

    public final Image getDownsizedLarge() {
        return this.downsizedLarge;
    }

    public final Image getDownsizedMedium() {
        return this.downsizedMedium;
    }

    public final Image getOriginal() {
        return this.original;
    }

    public final void setOriginal(Image image) {
        this.original = image;
    }

    public final Image getOriginalStill() {
        return this.originalStill;
    }

    public final Image getLooping() {
        return this.looping;
    }

    public final Image getPreview() {
        return this.preview;
    }

    public final Image getDownsizedSmall() {
        return this.downsizedSmall;
    }

    public final String getMediaId() {
        return this.mediaId;
    }

    public final void setMediaId(String str) {
        this.mediaId = str;
    }

    public final void postProcess() {
        Image image = this.original;
        if (image != null) {
            runAnimators.toString(image);
            image.setMediaId(this.mediaId);
            Image image2 = this.original;
            runAnimators.toString(image2);
            image2.setRenditionType(RenditionType.original);
        }
        Image image3 = this.originalStill;
        if (image3 != null) {
            image3.setMediaId(this.mediaId);
            this.originalStill.setRenditionType(RenditionType.originalStill);
        }
        Image image4 = this.fixedHeight;
        if (image4 != null) {
            image4.setMediaId(this.mediaId);
            this.fixedHeight.setRenditionType(RenditionType.fixedHeight);
        }
        Image image5 = this.fixedHeightStill;
        if (image5 != null) {
            image5.setMediaId(this.mediaId);
            this.fixedHeightStill.setRenditionType(RenditionType.fixedHeightStill);
        }
        Image image6 = this.fixedHeightDownsampled;
        if (image6 != null) {
            runAnimators.toString(image6);
            image6.setMediaId(this.mediaId);
            Image image7 = this.fixedHeightDownsampled;
            runAnimators.toString(image7);
            image7.setRenditionType(RenditionType.fixedHeightDownsampled);
        }
        Image image8 = this.fixedWidth;
        if (image8 != null) {
            image8.setMediaId(this.mediaId);
            this.fixedWidth.setRenditionType(RenditionType.fixedWidth);
        }
        Image image9 = this.fixedWidthStill;
        if (image9 != null) {
            image9.setMediaId(this.mediaId);
            this.fixedWidthStill.setRenditionType(RenditionType.fixedWidthStill);
        }
        Image image10 = this.fixedWidthDownsampled;
        if (image10 != null) {
            runAnimators.toString(image10);
            image10.setMediaId(this.mediaId);
            Image image11 = this.fixedWidthDownsampled;
            runAnimators.toString(image11);
            image11.setRenditionType(RenditionType.fixedWidthDownsampled);
        }
        Image image12 = this.fixedHeightSmall;
        if (image12 != null) {
            runAnimators.toString(image12);
            image12.setMediaId(this.mediaId);
            Image image13 = this.fixedHeightSmall;
            runAnimators.toString(image13);
            image13.setRenditionType(RenditionType.fixedHeightSmall);
        }
        Image image14 = this.fixedHeightSmallStill;
        if (image14 != null) {
            runAnimators.toString(image14);
            image14.setMediaId(this.mediaId);
            Image image15 = this.fixedHeightSmallStill;
            runAnimators.toString(image15);
            image15.setRenditionType(RenditionType.fixedHeightSmallStill);
        }
        Image image16 = this.fixedWidthSmall;
        if (image16 != null) {
            runAnimators.toString(image16);
            image16.setMediaId(this.mediaId);
            Image image17 = this.fixedWidthSmall;
            runAnimators.toString(image17);
            image17.setRenditionType(RenditionType.fixedWidthSmall);
        }
        Image image18 = this.fixedWidthSmallStill;
        if (image18 != null) {
            runAnimators.toString(image18);
            image18.setMediaId(this.mediaId);
            Image image19 = this.fixedWidthSmallStill;
            runAnimators.toString(image19);
            image19.setRenditionType(RenditionType.fixedWidthSmallStill);
        }
        Image image20 = this.downsized;
        if (image20 != null) {
            image20.setMediaId(this.mediaId);
            this.downsized.setRenditionType(RenditionType.downsized);
        }
        Image image21 = this.downsizedStill;
        if (image21 != null) {
            image21.setMediaId(this.mediaId);
            this.downsizedStill.setRenditionType(RenditionType.downsizedStill);
        }
        Image image22 = this.downsizedLarge;
        if (image22 != null) {
            image22.setMediaId(this.mediaId);
            this.downsizedLarge.setRenditionType(RenditionType.downsizedLarge);
        }
        Image image23 = this.downsizedMedium;
        if (image23 != null) {
            image23.setMediaId(this.mediaId);
            this.downsizedMedium.setRenditionType(RenditionType.downsizedMedium);
        }
        Image image24 = this.looping;
        if (image24 != null) {
            image24.setMediaId(this.mediaId);
            this.looping.setRenditionType(RenditionType.looping);
        }
        Image image25 = this.preview;
        if (image25 != null) {
            image25.setMediaId(this.mediaId);
            this.preview.setRenditionType(RenditionType.preview);
        }
        Image image26 = this.downsizedSmall;
        if (image26 != null) {
            image26.setMediaId(this.mediaId);
            this.downsizedSmall.setRenditionType(RenditionType.downsizedSmall);
        }
    }
}
