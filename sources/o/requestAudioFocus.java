package o;

import com.giphy.sdk.core.models.enums.RenditionType;
import com.giphy.sdk.ui.drawables.ImageFormat;
/* loaded from: classes4.dex */
public final /* synthetic */ class requestAudioFocus {
    public static final /* synthetic */ int[] toString;
    public static final /* synthetic */ int[] values;

    static {
        int[] iArr = new int[ImageFormat.values().length];
        toString = iArr;
        iArr[ImageFormat.WEBP.ordinal()] = 1;
        iArr[ImageFormat.MP4.ordinal()] = 2;
        iArr[ImageFormat.GIF.ordinal()] = 3;
        int[] iArr2 = new int[RenditionType.values().length];
        values = iArr2;
        iArr2[RenditionType.original.ordinal()] = 1;
        iArr2[RenditionType.downsized.ordinal()] = 2;
        iArr2[RenditionType.downsizedMedium.ordinal()] = 3;
        iArr2[RenditionType.downsizedLarge.ordinal()] = 4;
        iArr2[RenditionType.fixedWidth.ordinal()] = 5;
        iArr2[RenditionType.fixedWidthSmall.ordinal()] = 6;
        iArr2[RenditionType.fixedWidthDownsampled.ordinal()] = 7;
        iArr2[RenditionType.fixedWidthStill.ordinal()] = 8;
        iArr2[RenditionType.looping.ordinal()] = 9;
        iArr2[RenditionType.fixedHeight.ordinal()] = 10;
        iArr2[RenditionType.originalStill.ordinal()] = 11;
        iArr2[RenditionType.preview.ordinal()] = 12;
        iArr2[RenditionType.fixedHeightStill.ordinal()] = 13;
        iArr2[RenditionType.fixedHeightDownsampled.ordinal()] = 14;
        iArr2[RenditionType.fixedHeightSmall.ordinal()] = 15;
        iArr2[RenditionType.fixedHeightSmallStill.ordinal()] = 16;
        iArr2[RenditionType.fixedWidthSmallStill.ordinal()] = 17;
        iArr2[RenditionType.downsizedSmall.ordinal()] = 18;
        iArr2[RenditionType.downsizedStill.ordinal()] = 19;
    }
}
