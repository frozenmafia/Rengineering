package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;
/* loaded from: classes6.dex */
public class SidePropagation extends VisibilityPropagation {
    private float mPropagationSpeed = 3.0f;
    private int mSide = 80;

    public void setSide(int i) {
        this.mSide = i;
    }

    public void setPropagationSpeed(float f) {
        if (f == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.mPropagationSpeed = f;
    }

    @Override // androidx.transition.TransitionPropagation
    public long getStartDelay(ViewGroup viewGroup, Transition transition, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i;
        int i2;
        int i3;
        TransitionValues transitionValues3 = transitionValues;
        if (transitionValues3 == null && transitionValues2 == null) {
            return 0L;
        }
        Rect epicenter = transition.getEpicenter();
        if (transitionValues2 == null || getViewVisibility(transitionValues3) == 0) {
            i = -1;
        } else {
            transitionValues3 = transitionValues2;
            i = 1;
        }
        int viewX = getViewX(transitionValues3);
        int viewY = getViewY(transitionValues3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = round + viewGroup.getWidth();
        int height = round2 + viewGroup.getHeight();
        if (epicenter != null) {
            i2 = epicenter.centerX();
            i3 = epicenter.centerY();
        } else {
            i2 = (round + width) / 2;
            i3 = (round2 + height) / 2;
        }
        float distance = distance(viewGroup, viewX, viewY, i2, i3, round, round2, width, height) / getMaxDistance(viewGroup);
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round((((float) (duration * i)) / this.mPropagationSpeed) * distance);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
        if ((androidx.core.view.ViewCompat.getLayoutDirection(r7) == 1) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
        r0 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
        if ((androidx.core.view.ViewCompat.getLayoutDirection(r7) == 1) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int distance(android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            r6 = this;
            int r0 = r6.mSide
            r1 = 5
            r2 = 3
            r3 = 0
            r4 = 1
            r5 = 8388611(0x800003, float:1.1754948E-38)
            if (r0 != r5) goto L16
            int r7 = androidx.core.view.ViewCompat.getLayoutDirection(r7)
            if (r7 != r4) goto L12
            goto L13
        L12:
            r4 = 0
        L13:
            if (r4 == 0) goto L25
            goto L27
        L16:
            r5 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r5) goto L28
            int r7 = androidx.core.view.ViewCompat.getLayoutDirection(r7)
            if (r7 != r4) goto L22
            goto L23
        L22:
            r4 = 0
        L23:
            if (r4 == 0) goto L27
        L25:
            r0 = 3
            goto L28
        L27:
            r0 = 5
        L28:
            if (r0 == r2) goto L50
            if (r0 == r1) goto L47
            r7 = 48
            if (r0 == r7) goto L3e
            r7 = 80
            if (r0 == r7) goto L35
            goto L58
        L35:
            int r9 = r9 - r13
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r9 + r7
            goto L58
        L3e:
            int r15 = r15 - r9
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r15 + r7
            goto L58
        L47:
            int r8 = r8 - r12
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r8 + r7
            goto L58
        L50:
            int r14 = r14 - r8
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r14 + r7
        L58:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.SidePropagation.distance(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    private int getMaxDistance(ViewGroup viewGroup) {
        int i = this.mSide;
        if (i == 3 || i == 5 || i == 8388611 || i == 8388613) {
            return viewGroup.getWidth();
        }
        return viewGroup.getHeight();
    }
}
