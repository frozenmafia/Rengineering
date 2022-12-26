package com.app.dream11.social.profilerecommendation.allrecommendedprofile;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.getTargetTypes;
import o.move;
import o.runAnimators;
import org.apache.http.message.TokenParser;
/* loaded from: classes3.dex */
public final class AllRecommendedProfileFlowState extends FlowState {
    public static final valueOf Companion;
    public static final String SHOULD_SHOW_MESSAGE_CTA = "shouldShowMessageCTA";
    private static final String SOURCE;
    public static final String TITLE = "title";
    private static int ag$a = 1;
    private static int ah$a;
    private static char[] toString;
    private static long valueOf;

    public AllRecommendedProfileFlowState() {
        this(null, null, false, 7, null);
    }

    static void ah$a() {
        valueOf = 3769405574624693686L;
        toString = new char[]{8728, 61362, 47474, 19259, 5328, 9856, 40442, 20561, 1686, 62656, 43827};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllRecommendedProfileFlowState(String str, String str2, boolean z) {
        super(FlowStates.ALL_RECOMMENDED_PROFILE, null, 2, null);
        runAnimators.ag$a(str, values((Process.myPid() >> 22) + 6, 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (8811 - ExpandableListView.getPackedPositionType(0L))).intern());
        runAnimators.ag$a(str2, values((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 4, 6 - Color.red(0), (char) (40335 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern());
        putExtra(SOURCE, str);
        putExtra(values((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5, 6 - (ViewConfiguration.getTapTimeout() >> 16), (char) (40334 - ((Process.getThreadPriority(0) + 20) >> 6))).intern(), str2);
        putExtra(SHOULD_SHOW_MESSAGE_CTA, Boolean.valueOf(z));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AllRecommendedProfileFlowState(java.lang.String r4, java.lang.String r5, boolean r6, int r7, o.getTargetTypes r8) {
        /*
            r3 = this;
            r8 = r7 & 1
            java.lang.String r0 = ""
            if (r8 == 0) goto L11
            int r4 = com.app.dream11.social.profilerecommendation.allrecommendedprofile.AllRecommendedProfileFlowState.ag$a
            int r4 = r4 + 79
            int r8 = r4 % 128
            com.app.dream11.social.profilerecommendation.allrecommendedprofile.AllRecommendedProfileFlowState.ah$a = r8
            int r4 = r4 % 2
            r4 = r0
        L11:
            r8 = r7 & 2
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L19
            r8 = 1
            goto L1a
        L19:
            r8 = 0
        L1a:
            if (r8 == r2) goto L1d
            goto L28
        L1d:
            int r5 = com.app.dream11.social.profilerecommendation.allrecommendedprofile.AllRecommendedProfileFlowState.ah$a
            int r5 = r5 + 75
            int r8 = r5 % 128
            com.app.dream11.social.profilerecommendation.allrecommendedprofile.AllRecommendedProfileFlowState.ag$a = r8
            int r5 = r5 % 2
            r5 = r0
        L28:
            r7 = r7 & 4
            if (r7 == 0) goto L2e
            r7 = 0
            goto L30
        L2e:
            r7 = 70
        L30:
            if (r7 == 0) goto L33
            goto L48
        L33:
            int r6 = com.app.dream11.social.profilerecommendation.allrecommendedprofile.AllRecommendedProfileFlowState.ah$a     // Catch: java.lang.Exception -> L4c
            int r6 = r6 + 37
            int r7 = r6 % 128
            com.app.dream11.social.profilerecommendation.allrecommendedprofile.AllRecommendedProfileFlowState.ag$a = r7     // Catch: java.lang.Exception -> L4c
            int r6 = r6 % 2
            int r6 = com.app.dream11.social.profilerecommendation.allrecommendedprofile.AllRecommendedProfileFlowState.ag$a
            int r6 = r6 + 41
            int r7 = r6 % 128
            com.app.dream11.social.profilerecommendation.allrecommendedprofile.AllRecommendedProfileFlowState.ah$a = r7
            int r6 = r6 % 2
            r6 = 0
        L48:
            r3.<init>(r4, r5, r6)
            return
        L4c:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.social.profilerecommendation.allrecommendedprofile.AllRecommendedProfileFlowState.<init>(java.lang.String, java.lang.String, boolean, int, o.getTargetTypes):void");
    }

    public final String getSource() {
        int i = ag$a + 21;
        ah$a = i % 128;
        int i2 = i % 2;
        String string = getString(SOURCE, "");
        int i3 = ah$a + 77;
        ag$a = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 30 : TokenParser.CR) != 30) {
            return string;
        }
        Object obj = null;
        super.hashCode();
        return string;
    }

    public final boolean shouldShowMessageCTA() {
        try {
            int i = ag$a + 83;
            ah$a = i % 128;
            if (i % 2 != 0) {
            }
            return getBoolean(SHOULD_SHOW_MESSAGE_CTA, false);
        } catch (Exception e) {
            throw e;
        }
    }

    /* loaded from: classes3.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }
    }

    static {
        try {
            ah$a();
            try {
                Companion = new valueOf(null);
                SOURCE = values(6 - (KeyEvent.getMaxKeyCode() >> 16), Color.argb(0, 0, 0, 0), (char) (8810 - ((byte) KeyEvent.getModifierMetaStateMask()))).intern();
                int i = ah$a + 81;
                ag$a = i % 128;
                int i2 = i % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String values(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((toString[move.values + i2] ^ (move.values * valueOf)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
