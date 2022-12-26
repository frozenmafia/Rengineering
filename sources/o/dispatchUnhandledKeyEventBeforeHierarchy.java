package o;

import android.graphics.Rect;
import android.text.style.LineBackgroundSpan;
/* loaded from: classes3.dex */
public final class dispatchUnhandledKeyEventBeforeHierarchy implements LineBackgroundSpan {
    public final Rect ag$a = new Rect();
    public final int ah$a;
    public final int toString;
    public final int valueOf;

    public dispatchUnhandledKeyEventBeforeHierarchy(int i, int i2, int i3) {
        this.valueOf = i;
        this.toString = i2;
        this.ah$a = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    @Override // android.text.style.LineBackgroundSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void drawBackground(android.graphics.Canvas r1, android.graphics.Paint r2, int r3, int r4, int r5, int r6, int r7, java.lang.CharSequence r8, int r9, int r10, int r11) {
        /*
            r0 = this;
            java.lang.String r6 = "canvas"
            o.runAnimators.ag$a(r1, r6)
            java.lang.String r6 = "paint"
            o.runAnimators.ag$a(r2, r6)
            java.lang.String r6 = "text"
            o.runAnimators.ag$a(r8, r6)
            float r6 = r2.measureText(r8, r9, r10)
            int r6 = o.loadTransition.values(r6)
            int r8 = r2.getColor()
            int r9 = r0.toString
            r10 = 1
            if (r9 == r10) goto L68
            r10 = 3
            if (r9 == r10) goto L52
            r10 = 5
            if (r9 == r10) goto L3c
            kotlin.Pair r4 = new kotlin.Pair
            int r9 = r0.ah$a
            int r9 = r3 - r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r3 = r3 + r6
            int r6 = r0.ah$a
            int r3 = r3 + r6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.<init>(r9, r3)
            goto L84
        L3c:
            kotlin.Pair r3 = new kotlin.Pair
            int r6 = r4 - r6
            int r9 = r0.ah$a
            int r6 = r6 - r9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r9 = r0.ah$a
            int r4 = r4 + r9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.<init>(r6, r4)
            goto L83
        L52:
            kotlin.Pair r4 = new kotlin.Pair
            int r9 = r0.ah$a
            int r9 = r3 - r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r3 = r3 + r6
            int r6 = r0.ah$a
            int r3 = r3 + r6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.<init>(r9, r3)
            goto L84
        L68:
            int r4 = r4 - r3
            kotlin.Pair r3 = new kotlin.Pair
            int r9 = r4 - r6
            int r9 = r9 / 2
            int r10 = r0.ah$a
            int r9 = r9 - r10
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r4 = r4 + r6
            int r4 = r4 / 2
            int r6 = r0.ah$a
            int r4 = r4 + r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.<init>(r9, r4)
        L83:
            r4 = r3
        L84:
            java.lang.Object r3 = r4.component1()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Object r4 = r4.component2()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            android.graphics.Rect r6 = r0.ag$a
            if (r11 != 0) goto La1
            int r9 = r0.ah$a
            int r9 = r9 / 2
            goto La5
        La1:
            int r9 = r0.ah$a
            int r9 = r9 / (-2)
        La5:
            int r10 = r0.ah$a
            int r10 = r10 / 2
            int r5 = r5 - r9
            int r7 = r7 + r10
            r6.set(r3, r5, r4, r7)
            int r3 = r0.valueOf
            r2.setColor(r3)
            android.graphics.Rect r3 = r0.ag$a
            r1.drawRect(r3, r2)
            r2.setColor(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dispatchUnhandledKeyEventBeforeHierarchy.drawBackground(android.graphics.Canvas, android.graphics.Paint, int, int, int, int, int, java.lang.CharSequence, int, int, int):void");
    }
}
