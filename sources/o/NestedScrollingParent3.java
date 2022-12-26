package o;

import android.graphics.Typeface;
/* loaded from: classes3.dex */
public final class NestedScrollingParent3 {
    private Typeface HaptikSDK$b;
    private int ag$a;
    private Integer ah$a;
    private Integer ah$b;
    private kotlin.Pair<Integer, Integer> invoke;
    private int toString;
    private boolean valueOf;
    private Integer values;

    public NestedScrollingParent3() {
        this(false, null, null, null, null, null, 0, 0, 255, null);
    }

    public NestedScrollingParent3(boolean z, Typeface typeface, kotlin.Pair<Integer, Integer> pair, Integer num, Integer num2, Integer num3, int i, int i2) {
        runAnimators.ag$a(typeface, "typeface");
        runAnimators.ag$a(pair, "textSize");
        this.valueOf = z;
        this.HaptikSDK$b = typeface;
        this.invoke = pair;
        this.ah$b = num;
        this.values = num2;
        this.ah$a = num3;
        this.toString = i;
        this.ag$a = i2;
    }

    public final boolean HaptikSDK$a() {
        return this.valueOf;
    }

    public final Typeface HaptikSDK$b() {
        return this.HaptikSDK$b;
    }

    public final Integer HaptikSDK$c() {
        return this.ah$b;
    }

    public final int ag$a() {
        return this.toString;
    }

    public final void ag$a(Typeface typeface) {
        runAnimators.ag$a(typeface, "<set-?>");
        this.HaptikSDK$b = typeface;
    }

    public final int ah$a() {
        return this.ag$a;
    }

    public final void ah$a(boolean z) {
        this.valueOf = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NestedScrollingParent3) {
            NestedScrollingParent3 nestedScrollingParent3 = (NestedScrollingParent3) obj;
            return this.valueOf == nestedScrollingParent3.valueOf && runAnimators.values(this.HaptikSDK$b, nestedScrollingParent3.HaptikSDK$b) && runAnimators.values(this.invoke, nestedScrollingParent3.invoke) && runAnimators.values(this.ah$b, nestedScrollingParent3.ah$b) && runAnimators.values(this.values, nestedScrollingParent3.values) && runAnimators.values(this.ah$a, nestedScrollingParent3.ah$a) && this.toString == nestedScrollingParent3.toString && this.ag$a == nestedScrollingParent3.ag$a;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    public int hashCode() {
        boolean z = this.valueOf;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = this.HaptikSDK$b.hashCode();
        int hashCode2 = this.invoke.hashCode();
        Integer num = this.ah$b;
        int hashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.values;
        int hashCode4 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.ah$a;
        return (((((((((((((r0 * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (num3 != null ? num3.hashCode() : 0)) * 31) + this.toString) * 31) + this.ag$a;
    }

    public final kotlin.Pair<Integer, Integer> invoke() {
        return this.invoke;
    }

    public String toString() {
        return "StoryGroupTextStyling(isVisible=" + this.valueOf + ", typeface=" + this.HaptikSDK$b + ", textSize=" + this.invoke + ", minLines=" + this.ah$b + ", maxLines=" + this.values + ", lines=" + this.ah$a + ", colorSeen=" + this.toString + ", colorNotSeen=" + this.ag$a + ')';
    }

    public final void toString(int i) {
        this.ag$a = i;
    }

    public final void toString(Integer num) {
        this.ah$a = num;
    }

    public final Integer valueOf() {
        return this.values;
    }

    public final void valueOf(Integer num) {
        this.values = num;
    }

    public final void valueOf(kotlin.Pair<Integer, Integer> pair) {
        runAnimators.ag$a(pair, "<set-?>");
        this.invoke = pair;
    }

    public final Integer values() {
        return this.ah$a;
    }

    public final void values(int i) {
        this.toString = i;
    }

    public final void values(Integer num) {
        this.ah$b = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ NestedScrollingParent3(boolean r10, android.graphics.Typeface r11, kotlin.Pair r12, java.lang.Integer r13, java.lang.Integer r14, java.lang.Integer r15, int r16, int r17, int r18, o.getTargetTypes r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = r10
        L9:
            r2 = r0 & 2
            if (r2 == 0) goto L15
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            java.lang.String r3 = "DEFAULT"
            o.runAnimators.ah$a(r2, r3)
            goto L16
        L15:
            r2 = r11
        L16:
            r3 = r0 & 4
            r4 = 0
            if (r3 == 0) goto L26
            kotlin.Pair r3 = new kotlin.Pair
            r5 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.<init>(r5, r4)
            goto L27
        L26:
            r3 = r12
        L27:
            r5 = r0 & 8
            if (r5 == 0) goto L2d
            r5 = r4
            goto L2e
        L2d:
            r5 = r13
        L2e:
            r6 = r0 & 16
            if (r6 == 0) goto L34
            r6 = r4
            goto L35
        L34:
            r6 = r14
        L35:
            r7 = r0 & 32
            if (r7 == 0) goto L3a
            goto L3b
        L3a:
            r4 = r15
        L3b:
            r7 = r0 & 64
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r7 == 0) goto L44
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L46
        L44:
            r7 = r16
        L46:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L4b
            goto L4d
        L4b:
            r8 = r17
        L4d:
            r10 = r9
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r5
            r15 = r6
            r16 = r4
            r17 = r7
            r18 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.NestedScrollingParent3.<init>(boolean, android.graphics.Typeface, kotlin.Pair, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, int, int, o.getTargetTypes):void");
    }
}
