package com.app.dream11.verificationnew.common.event;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getN;
import o.move;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class VerificationEventHelperKt$trackVerifyPageAPISuccess$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    private static int ag$a = 1;
    private static char[] ah$a = {'s', 1608, 3131, 4615, 6399, 7846};
    private static int toString = 0;
    private static long values = -389686806888118745L;
    final /* synthetic */ String $errorMessage;
    final /* synthetic */ String $selection;
    final /* synthetic */ String $source;
    final /* synthetic */ boolean $successFlag;
    final /* synthetic */ getN $this_trackVerifyPageAPISuccess;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationEventHelperKt$trackVerifyPageAPISuccess$1(String str, String str2, boolean z, String str3, getN getn) {
        super(0);
        this.$source = str;
        this.$selection = str2;
        this.$successFlag = z;
        this.$errorMessage = str3;
        this.$this_trackVerifyPageAPISuccess = getn;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        int i = toString + 57;
        ag$a = i % 128;
        int i2 = i % 2;
        invoke2();
        setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
        int i3 = toString + 73;
        ag$a = i3 % 128;
        int i4 = i3 % 2;
        return setanimationmatrix;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:14:0x0068
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        /*
            r9 = this;
            com.app.dream11.model.NewEvents r0 = new com.app.dream11.model.NewEvents
            java.lang.String r1 = "VerifyPageAPISuccess"
            r0.<init>(r1)
            int r1 = android.os.Process.myTid()     // Catch: java.lang.Exception -> L66
            int r1 = r1 >> 22
            int r1 = 6 - r1
            r2 = 0
            double r3 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(r2)     // Catch: java.lang.Exception -> L66
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> L66
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r8 = r8 + (-1)
            char r3 = (char) r8     // Catch: java.lang.Exception -> L66
            java.lang.String r1 = ah$a(r1, r7, r3)     // Catch: java.lang.Exception -> L66
            java.lang.String r1 = r1.intern()     // Catch: java.lang.Exception -> L66
            java.lang.String r3 = r9.$source     // Catch: java.lang.Exception -> L66
            java.io.Serializable r3 = (java.io.Serializable) r3     // Catch: java.lang.Exception -> L66
            r0.addProperty(r1, r3)     // Catch: java.lang.Exception -> L66
            java.lang.String r1 = "selection"
            java.lang.String r3 = r9.$selection     // Catch: java.lang.Exception -> L66
            java.io.Serializable r3 = (java.io.Serializable) r3     // Catch: java.lang.Exception -> L66
            r0.addProperty(r1, r3)     // Catch: java.lang.Exception -> L66
            java.lang.String r1 = "successFlag"
            boolean r3 = r9.$successFlag     // Catch: java.lang.Exception -> L66
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L66
            java.io.Serializable r3 = (java.io.Serializable) r3     // Catch: java.lang.Exception -> L66
            r0.addProperty(r1, r3)     // Catch: java.lang.Exception -> L66
            java.lang.String r1 = r9.$errorMessage     // Catch: java.lang.Exception -> L66
            if (r1 != 0) goto L4d
            goto L5e
        L4d:
            java.io.Serializable r1 = (java.io.Serializable) r1
            java.lang.String r3 = "errorMessage"
            r0.addProperty(r3, r1)
            int r1 = com.app.dream11.verificationnew.common.event.VerificationEventHelperKt$trackVerifyPageAPISuccess$1.ag$a     // Catch: java.lang.Exception -> L66
            int r1 = r1 + 45
            int r3 = r1 % 128
            com.app.dream11.verificationnew.common.event.VerificationEventHelperKt$trackVerifyPageAPISuccess$1.toString = r3     // Catch: java.lang.Exception -> L66
            int r1 = r1 % 2
        L5e:
            o.getN r1 = r9.$this_trackVerifyPageAPISuccess
            com.app.dream11.integration.EventTracker[] r2 = new com.app.dream11.integration.EventTracker[r2]
            r1.trackEvent(r0, r2)
            return
        L66:
            r0 = move-exception
            throw r0
        L68:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.verificationnew.common.event.VerificationEventHelperKt$trackVerifyPageAPISuccess$1.invoke2():void");
    }

    private static String ah$a(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((ah$a[move.values + i2] ^ (move.values * values)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
