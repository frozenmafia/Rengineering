package com.fasterxml.jackson.core.io;

import java.io.Serializable;
import java.util.Arrays;
import o.getSelection;
import o.setUpdateThrottle;
/* loaded from: classes6.dex */
public abstract class CharacterEscapes implements Serializable {
    public static final int ESCAPE_CUSTOM = -2;
    public static final int ESCAPE_NONE = 0;
    public static final int ESCAPE_STANDARD = -1;

    public abstract int[] getEscapeCodesForAscii();

    public abstract setUpdateThrottle getEscapeSequence(int i);

    public static int[] standardAsciiEscapesForJSON() {
        int[] iArr;
        iArr = getSelection.HaptikSDK$c;
        return Arrays.copyOf(iArr, iArr.length);
    }
}
