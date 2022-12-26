package o;

import com.giphy.sdk.core.models.enums.MediaType;
import com.giphy.sdk.ui.GPHContentType;
import com.giphy.sdk.ui.themes.GridType;
/* loaded from: classes4.dex */
public final /* synthetic */ class setFocusGain {
    public static final /* synthetic */ int[] ag$a;
    public static final /* synthetic */ int[] ah$a;
    public static final /* synthetic */ int[] toString;
    public static final /* synthetic */ int[] values;

    static {
        int[] iArr = new int[GridType.values().length];
        ah$a = iArr;
        iArr[GridType.waterfall.ordinal()] = 1;
        iArr[GridType.carousel.ordinal()] = 2;
        int[] iArr2 = new int[GPHContentType.values().length];
        ag$a = iArr2;
        iArr2[GPHContentType.emoji.ordinal()] = 1;
        int[] iArr3 = new int[GPHContentType.values().length];
        values = iArr3;
        iArr3[GPHContentType.emoji.ordinal()] = 1;
        int[] iArr4 = new int[MediaType.values().length];
        toString = iArr4;
        iArr4[MediaType.sticker.ordinal()] = 1;
        iArr4[MediaType.text.ordinal()] = 2;
        iArr4[MediaType.video.ordinal()] = 3;
    }
}
