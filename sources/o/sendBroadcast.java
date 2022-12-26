package o;

import com.giphy.sdk.ui.GPHContentType;
/* loaded from: classes6.dex */
public final /* synthetic */ class sendBroadcast {
    public static final /* synthetic */ int[] toString;

    static {
        int[] iArr = new int[GPHContentType.values().length];
        toString = iArr;
        iArr[GPHContentType.clips.ordinal()] = 1;
        iArr[GPHContentType.gif.ordinal()] = 2;
        iArr[GPHContentType.sticker.ordinal()] = 3;
        iArr[GPHContentType.text.ordinal()] = 4;
        iArr[GPHContentType.emoji.ordinal()] = 5;
        iArr[GPHContentType.recents.ordinal()] = 6;
    }
}
