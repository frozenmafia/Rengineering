package o;

import com.giphy.sdk.ui.GPHContentType;
/* loaded from: classes4.dex */
public final /* synthetic */ class isValidFocusGain {
    public static final /* synthetic */ int[] ag$a;

    static {
        int[] iArr = new int[GPHContentType.values().length];
        ag$a = iArr;
        iArr[GPHContentType.sticker.ordinal()] = 1;
        iArr[GPHContentType.emoji.ordinal()] = 2;
        iArr[GPHContentType.text.ordinal()] = 3;
        iArr[GPHContentType.recents.ordinal()] = 4;
    }
}
