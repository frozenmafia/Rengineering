package com.appsamurai.storyly;

import com.sendbird.android.constant.StringSet;
import o.isClosed;
import org.apache.http.message.TokenParser;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PlayMode {
    private static final /* synthetic */ PlayMode[] $VALUES;
    public static final PlayMode$ah$a Companion;
    public static final PlayMode Default;
    public static final PlayMode Story;
    public static final PlayMode StoryGroup;
    private static int ag$a = 0;
    private static int valueOf = 1;
    private static char[] values;
    private final String value;

    private static final /* synthetic */ PlayMode[] $values() {
        int i = ag$a + 49;
        valueOf = i % 128;
        int i2 = i % 2;
        PlayMode[] playModeArr = {Default, StoryGroup, Story};
        int i3 = ag$a + 31;
        valueOf = i3 % 128;
        int i4 = i3 % 2;
        return playModeArr;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.appsamurai.storyly.PlayMode$ah$a] */
    static {
        ag$a();
        Default = new PlayMode("Default", 0, valueOf(false, new int[]{0, 7, 26, 5}, new byte[]{0, 1, 0, 1, 0, 0, 1}).intern());
        StoryGroup = new PlayMode("StoryGroup", 1, "sg");
        Story = new PlayMode("Story", 2, StringSet.s);
        $VALUES = $values();
        Companion = new Object() { // from class: com.appsamurai.storyly.PlayMode$ah$a
        };
        int i = valueOf + 99;
        ag$a = i % 128;
        int i2 = i % 2;
    }

    private PlayMode(String str, int i, String str2) {
        try {
            this.value = str2;
        } catch (Exception e) {
            throw e;
        }
    }

    static void ag$a() {
        values = new char[]{'@', '}', 133, 138, 138, 134, '~'};
    }

    public static PlayMode valueOf(String str) {
        int i = ag$a + 81;
        valueOf = i % 128;
        int i2 = i % 2;
        PlayMode playMode = (PlayMode) Enum.valueOf(PlayMode.class, str);
        try {
            int i3 = valueOf + 101;
            ag$a = i3 % 128;
            if (!(i3 % 2 == 0)) {
                Object[] objArr = null;
                int length = objArr.length;
                return playMode;
            }
            return playMode;
        } catch (Exception e) {
            throw e;
        }
    }

    public static PlayMode[] values() {
        PlayMode[] playModeArr;
        int i = ag$a + 93;
        valueOf = i % 128;
        if ((i % 2 == 0 ? (char) 31 : TokenParser.CR) != 31) {
            playModeArr = (PlayMode[]) $VALUES.clone();
        } else {
            playModeArr = (PlayMode[]) $VALUES.clone();
            int i2 = 50 / 0;
        }
        int i3 = valueOf + 83;
        ag$a = i3 % 128;
        int i4 = i3 % 2;
        return playModeArr;
    }

    public final String getValue() {
        try {
            int i = ag$a + 79;
            valueOf = i % 128;
            int i2 = i % 2;
            String str = this.value;
            int i3 = ag$a + 61;
            try {
                valueOf = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String valueOf(boolean z, int[] iArr, byte[] bArr) {
        String str;
        synchronized (isClosed.ah$a) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(values, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                isClosed.ag$a = 0;
                char c = 0;
                while (isClosed.ag$a < i2) {
                    if (bArr[isClosed.ag$a] == 1) {
                        cArr2[isClosed.ag$a] = (char) (((cArr[isClosed.ag$a] << 1) + 1) - c);
                    } else {
                        cArr2[isClosed.ag$a] = (char) ((cArr[isClosed.ag$a] << 1) - c);
                    }
                    c = cArr2[isClosed.ag$a];
                    isClosed.ag$a++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr4[isClosed.ag$a] = cArr[(i2 - isClosed.ag$a) - 1];
                    isClosed.ag$a++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr[isClosed.ag$a] = (char) (cArr[isClosed.ag$a] - iArr[2]);
                    isClosed.ag$a++;
                }
            }
            str = new String(cArr);
        }
        return str;
    }
}
