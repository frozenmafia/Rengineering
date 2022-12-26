package com.app.dream11.teamselection;

import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.app.dream11.contest.flowstates.AddEmailBSFlowState;
import com.app.dream11.dream11.AppConstants;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.isBeforeFirst;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class CreateTeamFlowState extends FlowState {
    private static long ag$a = -8989108018809480071L;
    private static int toString = 1;
    private static int valueOf;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ CreateTeamFlowState(java.lang.String r16, int r17, int r18, int r19, int r20, java.lang.String r21, java.lang.String r22, boolean r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, int r27, o.getTargetTypes r28) {
        /*
            r15 = this;
            r0 = r27
            r1 = r0 & 8
            r2 = -1
            if (r1 == 0) goto L9
            r7 = -1
            goto Lb
        L9:
            r7 = r19
        Lb:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L2c
            int r1 = com.app.dream11.teamselection.CreateTeamFlowState.valueOf     // Catch: java.lang.Exception -> L2a
            int r1 = r1 + 61
            int r4 = r1 % 128
            com.app.dream11.teamselection.CreateTeamFlowState.toString = r4     // Catch: java.lang.Exception -> L2a
            int r1 = r1 % 2
            r4 = 4
            if (r1 != 0) goto L1f
            r1 = 4
            goto L21
        L1f:
            r1 = 17
        L21:
            if (r1 == r4) goto L25
        L23:
            r8 = -1
            goto L2e
        L25:
            int r1 = r3.length     // Catch: java.lang.Throwable -> L27
            goto L23
        L27:
            r0 = move-exception
            r1 = r0
            throw r1
        L2a:
            r0 = move-exception
            throw r0
        L2c:
            r8 = r20
        L2e:
            r1 = r0 & 32
            r2 = 75
            if (r1 == 0) goto L37
            r1 = 75
            goto L39
        L37:
            r1 = 76
        L39:
            if (r1 == r2) goto L3e
            r9 = r21
            goto L49
        L3e:
            int r1 = com.app.dream11.teamselection.CreateTeamFlowState.toString
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.app.dream11.teamselection.CreateTeamFlowState.valueOf = r2
            int r1 = r1 % 2
            r9 = r3
        L49:
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 1
            r4 = 0
            if (r1 == 0) goto L51
            r1 = 0
            goto L52
        L51:
            r1 = 1
        L52:
            if (r1 == 0) goto L57
            r11 = r23
            goto L62
        L57:
            int r1 = com.app.dream11.teamselection.CreateTeamFlowState.valueOf
            int r1 = r1 + 35
            int r5 = r1 % 128
            com.app.dream11.teamselection.CreateTeamFlowState.toString = r5
            int r1 = r1 % 2
            r11 = 0
        L62:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L7c
            int r0 = com.app.dream11.teamselection.CreateTeamFlowState.valueOf
            int r0 = r0 + 63
            int r1 = r0 % 128
            com.app.dream11.teamselection.CreateTeamFlowState.toString = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L73
            r2 = 0
        L73:
            if (r2 == 0) goto L77
        L75:
            r12 = r3
            goto L7e
        L77:
            int r0 = r3.length     // Catch: java.lang.Throwable -> L79
            goto L75
        L79:
            r0 = move-exception
            r1 = r0
            throw r1
        L7c:
            r12 = r24
        L7e:
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r10 = r22
            r13 = r25
            r14 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.teamselection.CreateTeamFlowState.<init>(java.lang.String, int, int, int, int, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, int, o.getTargetTypes):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTeamFlowState(String str, int i, int i2, int i3, int i4, String str2, String str3, boolean z, String str4, String str5, String str6) {
        super(!z ? FlowStates.NEW_CREATE_TEAM : FlowStates.NEW_ON_BOARDING_CREATE_TEAM, null, str);
        runAnimators.ag$a(str, FlowState.WLS_SLUG);
        runAnimators.ag$a(str5, ah$a(new char[]{56346, 20513, 50279, 30910, 60671, 24837, 38220, 2461, 48634, 12829, 42554}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 35897).intern());
        runAnimators.ag$a(str6, ah$a(new char[]{56330, 24173, 55546, 23418, 54774, 20603}, View.resolveSize(0, 0) + 33403).intern());
        putExtra(AddEmailBSFlowState.TOUR_ID_KEY, Integer.valueOf(i));
        putExtra(AddEmailBSFlowState.ROUND_ID_KEY, Integer.valueOf(i2));
        if (i3 != -1) {
            putExtra("teamId", Integer.valueOf(i3));
        }
        if ((i4 != -1 ? '7' : 'c') != 'c') {
            int i5 = valueOf + 87;
            toString = i5 % 128;
            int i6 = i5 % 2;
            putExtra("clonedFrom", Integer.valueOf(i4));
            int i7 = valueOf + 97;
            toString = i7 % 128;
            int i8 = i7 % 2;
        }
        if (str2 != null) {
            putExtra("callFrom", str2);
        }
        if (!(str3 == null)) {
            putExtra("isTypeCreateOrEditOrCloned", str3);
        }
        if (str4 != null) {
            String str7 = AppConstants.getInitSettings;
            runAnimators.ah$a(str7, "SHARED_TEAM_SNAPSHOT_ID");
            putExtra(str7, str4);
            int i9 = toString + 25;
            valueOf = i9 % 128;
            int i10 = i9 % 2;
        }
        putExtra(ah$a(new char[]{56346, 20513, 50279, 30910, 60671, 24837, 38220, 2461, 48634, 12829, 42554}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35897).intern(), str5);
        putExtra("is_onboarding", Boolean.valueOf(z));
        putExtra(ah$a(new char[]{56330, 24173, 55546, 23418, 54774, 20603}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 33402).intern(), str6);
    }

    private static String ah$a(char[] cArr, int i) {
        String str;
        synchronized (isBeforeFirst.toString) {
            isBeforeFirst.ah$a = i;
            char[] cArr2 = new char[cArr.length];
            isBeforeFirst.valueOf = 0;
            while (isBeforeFirst.valueOf < cArr.length) {
                cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ ag$a);
                isBeforeFirst.valueOf++;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
