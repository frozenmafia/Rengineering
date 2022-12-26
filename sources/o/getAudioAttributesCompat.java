package o;

import com.giphy.sdk.core.models.enums.MediaType;
/* loaded from: classes7.dex */
public final /* synthetic */ class getAudioAttributesCompat {
    public static final /* synthetic */ int[] ag$a;

    static {
        int[] iArr = new int[MediaType.values().length];
        ag$a = iArr;
        iArr[MediaType.gif.ordinal()] = 1;
        iArr[MediaType.sticker.ordinal()] = 2;
        iArr[MediaType.text.ordinal()] = 3;
        iArr[MediaType.emoji.ordinal()] = 4;
        iArr[MediaType.video.ordinal()] = 5;
    }
}
