package com.app.dream11.social.flowstates;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import o.FontResourcesParserCompat;
import o.getShort;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class FullImageFlowState extends FlowState {
    private static final String CAPTION = "caption";
    public static final valueOf Companion;
    private static final String IMAGE_URL = "image_url";
    private static final String SUBTITLE = "subtitle";
    private static final String TITLE = "title";
    private static int ag$a = 0;
    private static int ah$a = 1;
    private static long toString;
    private static int valueOf;
    private static char values;

    static {
        try {
            ah$a();
            Object[] objArr = null;
            Companion = new valueOf(null);
            int i = ag$a + 123;
            ah$a = i % 128;
            if (!(i % 2 == 0)) {
                return;
            }
            int length = objArr.length;
        } catch (Exception e) {
            throw e;
        }
    }

    static void ah$a() {
        valueOf = 2088115973;
        toString = 0L;
        values = (char) 0;
    }

    public FullImageFlowState() {
        super(FlowStates.FULL_SCREEN_IMAGE, null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullImageFlowState(String str, String str2, String str3, String str4) {
        this();
        runAnimators.ag$a(str, "imageUrl");
        putExtra(IMAGE_URL, str);
        putExtra(valueOf((-181857330) - (Process.myPid() >> 22), new char[]{52829, 10515, 14837, 10523}, new char[]{0, 0, 0, 0}, (char) (6969 - Drawable.resolveOpacity(0, 0)), new char[]{53183, 48188, 43756, 44010, 38839}).intern(), str2);
        putExtra(SUBTITLE, str3);
        putExtra(CAPTION, str4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ FullImageFlowState(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, o.getTargetTypes r9) {
        /*
            r3 = this;
            r9 = r8 & 1
            r0 = 59
            if (r9 == 0) goto L9
            r9 = 94
            goto Lb
        L9:
            r9 = 59
        Lb:
            java.lang.String r1 = ""
            r2 = 0
            if (r9 == r0) goto L24
            int r4 = com.app.dream11.social.flowstates.FullImageFlowState.ag$a     // Catch: java.lang.Exception -> L22
            int r4 = r4 + 61
            int r9 = r4 % 128
            com.app.dream11.social.flowstates.FullImageFlowState.ah$a = r9     // Catch: java.lang.Exception -> L22
            int r4 = r4 % 2
            if (r4 != 0) goto L20
            int r4 = r2.length     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r4 = move-exception
            throw r4
        L20:
            r4 = r1
            goto L24
        L22:
            r4 = move-exception
            throw r4
        L24:
            r9 = r8 & 2
            r0 = 0
            r1 = 1
            if (r9 == 0) goto L2c
            r9 = 0
            goto L2d
        L2c:
            r9 = 1
        L2d:
            if (r9 == r1) goto L30
            r5 = r2
        L30:
            r9 = r8 & 4
            if (r9 == 0) goto L36
            r9 = 0
            goto L37
        L36:
            r9 = 1
        L37:
            if (r9 == r1) goto L4c
            int r6 = com.app.dream11.social.flowstates.FullImageFlowState.ah$a
            int r6 = r6 + 69
            int r9 = r6 % 128
            com.app.dream11.social.flowstates.FullImageFlowState.ag$a = r9
            int r6 = r6 % 2
            if (r6 == 0) goto L4b
            super.hashCode()     // Catch: java.lang.Throwable -> L49
            goto L4b
        L49:
            r4 = move-exception
            throw r4
        L4b:
            r6 = r2
        L4c:
            r8 = r8 & 8
            if (r8 == 0) goto L63
            int r7 = com.app.dream11.social.flowstates.FullImageFlowState.ah$a
            int r7 = r7 + 75
            int r8 = r7 % 128
            com.app.dream11.social.flowstates.FullImageFlowState.ag$a = r8
            int r7 = r7 % 2
            if (r7 == 0) goto L62
            r7 = 66
            int r7 = r7 / r0
            goto L62
        L60:
            r4 = move-exception
            throw r4
        L62:
            r7 = r2
        L63:
            r3.<init>(r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.social.flowstates.FullImageFlowState.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, o.getTargetTypes):void");
    }

    /* loaded from: classes3.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }
    }

    public final String getImageUrl() {
        String str;
        int i = ag$a + 81;
        ah$a = i % 128;
        if (i % 2 == 0) {
            Serializable extra = getExtra(IMAGE_URL);
            Objects.requireNonNull(extra, "null cannot be cast to non-null type kotlin.String");
            str = (String) extra;
            Object obj = null;
            super.hashCode();
        } else {
            Serializable extra2 = getExtra(IMAGE_URL);
            Objects.requireNonNull(extra2, "null cannot be cast to non-null type kotlin.String");
            str = (String) extra2;
        }
        int i2 = ah$a + 119;
        ag$a = i2 % 128;
        if (!(i2 % 2 == 0)) {
            int i3 = 46 / 0;
            return str;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
        if ((r0 instanceof java.lang.String) != true) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0080, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0082, code lost:
        r0 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
        if ((r0 instanceof java.lang.String) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getTitle() {
        /*
            r7 = this;
            int r0 = com.app.dream11.social.flowstates.FullImageFlowState.ah$a
            int r0 = r0 + 15
            int r1 = r0 % 128
            com.app.dream11.social.flowstates.FullImageFlowState.ag$a = r1
            int r0 = r0 % 2
            r1 = 95
            if (r0 == 0) goto L11
            r0 = 36
            goto L13
        L11:
            r0 = 95
        L13:
            r2 = 5
            r3 = -181857330(0xfffffffff52913ce, float:-2.1433102E32)
            r4 = 4
            r5 = 1
            r6 = 0
            if (r0 == r1) goto L4e
            int r0 = android.os.Process.getThreadPriority(r5)
            int r0 = r0 + (-13)
            int r0 = r0 >> 3
            int r0 = r0 * r3
            char[] r1 = new char[r4]
            r1 = {x0090: FILL_ARRAY_DATA  , data: [-12707, 10515, 14837, 10523} // fill-array
            char[] r3 = new char[r4]
            r3 = {x0098: FILL_ARRAY_DATA  , data: [0, 0, 0, 0} // fill-array
            r4 = 27627(0x6beb, float:3.8714E-41)
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r6)
            int r4 = r4 / r5
            char r4 = (char) r4
            char[] r2 = new char[r2]
            r2 = {x00a0: FILL_ARRAY_DATA  , data: [-12353, -17348, -21780, -21526, -26697} // fill-array
            java.lang.String r0 = valueOf(r0, r1, r3, r4, r2)
            java.lang.String r0 = r0.intern()
            java.io.Serializable r0 = r7.getExtra(r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L80
            goto L82
        L4e:
            int r0 = android.os.Process.getThreadPriority(r6)
            int r0 = r0 + 20
            int r0 = r0 >> 6
            int r3 = r3 - r0
            char[] r0 = new char[r4]
            r0 = {x00aa: FILL_ARRAY_DATA  , data: [-12707, 10515, 14837, 10523} // fill-array
            char[] r1 = new char[r4]
            r1 = {x00b2: FILL_ARRAY_DATA  , data: [0, 0, 0, 0} // fill-array
            int r4 = android.view.Gravity.getAbsoluteGravity(r6, r6)
            int r4 = 6969 - r4
            char r4 = (char) r4
            char[] r2 = new char[r2]
            r2 = {x00ba: FILL_ARRAY_DATA  , data: [-12353, -17348, -21780, -21526, -26697} // fill-array
            java.lang.String r0 = valueOf(r3, r0, r1, r4, r2)
            java.lang.String r0 = r0.intern()
            java.io.Serializable r0 = r7.getExtra(r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L7e
            r6 = 1
        L7e:
            if (r6 == r5) goto L82
        L80:
            r0 = 0
            goto L84
        L82:
            java.lang.String r0 = (java.lang.String) r0
        L84:
            int r1 = com.app.dream11.social.flowstates.FullImageFlowState.ag$a
            int r1 = r1 + 87
            int r2 = r1 % 128
            com.app.dream11.social.flowstates.FullImageFlowState.ah$a = r2
            int r1 = r1 % 2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.social.flowstates.FullImageFlowState.getTitle():java.lang.String");
    }

    public final String getSubTitle() {
        String str;
        int i = ag$a + 65;
        ah$a = i % 128;
        int i2 = i % 2;
        Serializable extra = getExtra(SUBTITLE);
        if (!(!(extra instanceof String))) {
            try {
                int i3 = ag$a + 15;
                ah$a = i3 % 128;
                int i4 = i3 % 2;
                str = (String) extra;
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = null;
        }
        int i5 = ah$a + 107;
        ag$a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCaption() {
        Serializable extra = getExtra(CAPTION);
        if ((extra instanceof String ? 'V' : (char) 3) != 'V') {
            return null;
        }
        int i = ag$a + 117;
        ah$a = i % 128;
        int i2 = i % 2;
        String str = (String) extra;
        try {
            int i3 = ag$a + 75;
            try {
                ah$a = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.app.dream11.model.FlowState
    public void putAllExtras(Map<String, Serializable> map) {
        int i = ag$a + 15;
        ah$a = i % 128;
        int i2 = i % 2;
        runAnimators.ag$a(map, "args");
        FullImageFlowState fullImageFlowState = this;
        fullImageFlowState.putExtra(IMAGE_URL, FontResourcesParserCompat.ProviderResourceEntry.valueOf(map.get("url"), ""));
        Object[] objArr = null;
        fullImageFlowState.putExtra(valueOf(((byte) KeyEvent.getModifierMetaStateMask()) - 181857329, new char[]{52829, 10515, 14837, 10523}, new char[]{0, 0, 0, 0}, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 6970), new char[]{53183, 48188, 43756, 44010, 38839}).intern(), FontResourcesParserCompat.ProviderResourceEntry.valueOf(map.get(valueOf((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 181857331, new char[]{52829, 10515, 14837, 10523}, new char[]{0, 0, 0, 0}, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 6969), new char[]{53183, 48188, 43756, 44010, 38839}).intern()), null));
        fullImageFlowState.putExtra(SUBTITLE, FontResourcesParserCompat.ProviderResourceEntry.valueOf(map.get("description"), null));
        fullImageFlowState.putExtra(CAPTION, FontResourcesParserCompat.ProviderResourceEntry.valueOf(map.get(CAPTION), null));
        int i3 = ag$a + 17;
        ah$a = i3 % 128;
        if ((i3 % 2 == 0 ? '4' : ',') != '4') {
            return;
        }
        int length = objArr.length;
    }

    private static String valueOf(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
        String str;
        synchronized (getShort.toString) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            getShort.valueOf = 0;
            while (getShort.valueOf < length) {
                int i2 = (getShort.valueOf + 2) % 4;
                int i3 = (getShort.valueOf + 3) % 4;
                getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = getShort.values;
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ toString) ^ valueOf) ^ values);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
