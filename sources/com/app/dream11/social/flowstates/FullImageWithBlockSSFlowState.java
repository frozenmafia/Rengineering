package com.app.dream11.social.flowstates;

import android.os.Process;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import java.util.Objects;
import o.moveToLast;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class FullImageWithBlockSSFlowState extends FlowState {
    private static int HaptikSDK$a = 0;
    private static int HaptikSDK$c = 1;
    private static int ag$a = -455631796;
    private static short[] ah$a = null;
    private static byte[] toString = {-10, -7, -8, 11, -11};
    private static int valueOf = 15;
    private static int values = -1834013796;
    private final String CAPTION;
    private final String IMAGE_URL;
    private final String SUBTITLE;
    private final String TITLE;

    public FullImageWithBlockSSFlowState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullImageWithBlockSSFlowState(String str, String str2, String str3, String str4) {
        super(FlowStates.FULL_SCREEN_IMAGE_WITH_BLOCK_SS, null, 2, null);
        runAnimators.ag$a(str, "imageUrl");
        this.IMAGE_URL = "image_url";
        this.TITLE = ah$a((byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-16) - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1834013912, (short) ExpandableListView.getPackedPositionGroup(0L), 455631796 - View.MeasureSpec.getSize(0)).intern();
        this.SUBTITLE = "subtitle";
        this.CAPTION = "caption";
        putExtra("image_url", str);
        putExtra(ah$a((byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), ((Process.getThreadPriority(0) + 20) >> 6) - 16, 1834013912 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (short) View.getDefaultSize(0, 0), 455631796 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), str2);
        putExtra("subtitle", str3);
        putExtra("caption", str4);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:7:0x0011
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public /* synthetic */ FullImageWithBlockSSFlowState(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, o.getTargetTypes r8) {
        /*
            r2 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L13
            int r3 = com.app.dream11.social.flowstates.FullImageWithBlockSSFlowState.HaptikSDK$a
            int r3 = r3 + 23
            int r8 = r3 % 128
            com.app.dream11.social.flowstates.FullImageWithBlockSSFlowState.HaptikSDK$c = r8
            int r3 = r3 % 2
            java.lang.String r3 = ""
            goto L13
        L11:
            r3 = move-exception
            throw r3
        L13:
            r8 = r7 & 2
            r0 = 13
            if (r8 == 0) goto L1c
            r8 = 13
            goto L1e
        L1c:
            r8 = 95
        L1e:
            r1 = 0
            if (r8 == r0) goto L22
            goto L2d
        L22:
            int r4 = com.app.dream11.social.flowstates.FullImageWithBlockSSFlowState.HaptikSDK$a
            int r4 = r4 + 37
            int r8 = r4 % 128
            com.app.dream11.social.flowstates.FullImageWithBlockSSFlowState.HaptikSDK$c = r8
            int r4 = r4 % 2
            r4 = r1
        L2d:
            r8 = r7 & 4
            if (r8 == 0) goto L33
            r8 = 0
            goto L34
        L33:
            r8 = 1
        L34:
            if (r8 == 0) goto L37
            goto L38
        L37:
            r5 = r1
        L38:
            r7 = r7 & 8
            r8 = 18
            if (r7 == 0) goto L41
            r7 = 41
            goto L43
        L41:
            r7 = 18
        L43:
            if (r7 == r8) goto L65
            int r6 = com.app.dream11.social.flowstates.FullImageWithBlockSSFlowState.HaptikSDK$a     // Catch: java.lang.Exception -> L63
            int r6 = r6 + 93
            int r7 = r6 % 128
            com.app.dream11.social.flowstates.FullImageWithBlockSSFlowState.HaptikSDK$c = r7     // Catch: java.lang.Exception -> L63
            int r6 = r6 % 2
            if (r6 != 0) goto L57
            super.hashCode()     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r3 = move-exception
            throw r3
        L57:
            int r6 = com.app.dream11.social.flowstates.FullImageWithBlockSSFlowState.HaptikSDK$a
            int r6 = r6 + 47
            int r7 = r6 % 128
            com.app.dream11.social.flowstates.FullImageWithBlockSSFlowState.HaptikSDK$c = r7
            int r6 = r6 % 2
            r6 = r1
            goto L65
        L63:
            r3 = move-exception
            throw r3
        L65:
            r2.<init>(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.social.flowstates.FullImageWithBlockSSFlowState.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, o.getTargetTypes):void");
    }

    public final String getImageUrl() {
        try {
            int i = HaptikSDK$c + 77;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
            Serializable extra = getExtra(this.IMAGE_URL);
            Objects.requireNonNull(extra, "null cannot be cast to non-null type kotlin.String");
            String str = (String) extra;
            int i3 = HaptikSDK$c + 13;
            HaptikSDK$a = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getTitle() {
        int i = HaptikSDK$c + 87;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        Serializable extra = getExtra(this.TITLE);
        if ((extra instanceof String ? (char) 3 : (char) 24) != 3) {
            return null;
        }
        String str = (String) extra;
        int i3 = HaptikSDK$c + 47;
        HaptikSDK$a = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final String getSubTitle() {
        String str;
        Serializable extra = getExtra(this.SUBTITLE);
        if (!(extra instanceof String)) {
            str = null;
            int i = HaptikSDK$a + 49;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
        } else {
            str = (String) extra;
        }
        int i3 = HaptikSDK$c + 17;
        HaptikSDK$a = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final String getCaption() {
        String str;
        int i = HaptikSDK$c + 43;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        Serializable extra = getExtra(this.CAPTION);
        if (!(extra instanceof String)) {
            str = null;
        } else {
            try {
                int i3 = HaptikSDK$a + 117;
                try {
                    HaptikSDK$c = i3 % 128;
                    int i4 = i3 % 2;
                    str = (String) extra;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        int i5 = HaptikSDK$c + 7;
        HaptikSDK$a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static String ah$a(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + valueOf;
            boolean z = i4 == -1;
            if (z) {
                if (toString != null) {
                    i4 = (byte) (toString[ag$a + i3] + valueOf);
                } else {
                    i4 = (short) (ah$a[ag$a + i3] + valueOf);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + ag$a + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + values);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (toString != null) {
                        byte[] bArr = toString;
                        int i5 = moveToLast.values;
                        moveToLast.values = i5 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                    } else {
                        short[] sArr = ah$a;
                        int i6 = moveToLast.values;
                        moveToLast.values = i6 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((short) (sArr[i6] + s)) ^ b2));
                    }
                    sb.append(moveToLast.ag$a);
                    moveToLast.toString = moveToLast.ag$a;
                    moveToLast.valueOf++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
