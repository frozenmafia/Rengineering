package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o.PreferenceGroup;
/* loaded from: classes5.dex */
public class areContentsTheSame {
    private boolean HaptikSDK$a;
    @Deprecated
    public float ag$a;
    @Deprecated
    public float ah$a;
    @Deprecated
    public float invoke;
    @Deprecated
    public float toString;
    @Deprecated
    public float valueOf;
    @Deprecated
    public float values;
    private final List<values> ah$b = new ArrayList();
    private final List<invoke> HaptikSDK$b = new ArrayList();

    /* loaded from: classes5.dex */
    public static abstract class values {
        protected final Matrix HaptikSDK$c = new Matrix();

        public abstract void values(Matrix matrix, Path path);
    }

    public areContentsTheSame() {
        ah$a(0.0f, 0.0f);
    }

    public void ah$a(float f, float f2) {
        toString(f, f2, 270.0f, 0.0f);
    }

    public void toString(float f, float f2, float f3, float f4) {
        ah$b(f);
        HaptikSDK$b(f2);
        toString(f);
        ah$a(f2);
        ag$a(f3);
        values((f3 + f4) % 360.0f);
        this.ah$b.clear();
        this.HaptikSDK$b.clear();
        this.HaptikSDK$a = false;
    }

    public void toString(float f, float f2) {
        valueOf valueof = new valueOf();
        valueof.values = f;
        valueof.toString = f2;
        this.ah$b.add(valueof);
        toString tostring = new toString(valueof, valueOf(), values());
        values(tostring, tostring.valueOf() + 270.0f, tostring.valueOf() + 270.0f);
        toString(f);
        ah$a(f2);
    }

    public void ag$a(float f, float f2, float f3, float f4, float f5, float f6) {
        areContentsTheSame$ag$a arecontentsthesame_ag_a = new areContentsTheSame$ag$a(f, f2, f3, f4);
        arecontentsthesame_ag_a.toString(f5);
        arecontentsthesame_ag_a.ag$a(f6);
        this.ah$b.add(arecontentsthesame_ag_a);
        areContentsTheSame$ah$a arecontentsthesame_ah_a = new areContentsTheSame$ah$a(arecontentsthesame_ag_a);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        values(arecontentsthesame_ah_a, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = f7;
        toString(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        ah$a(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    public void values(Matrix matrix, Path path) {
        int size = this.ah$b.size();
        for (int i = 0; i < size; i++) {
            this.ah$b.get(i).values(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public invoke values(Matrix matrix) {
        valueOf(ah$b());
        final Matrix matrix2 = new Matrix(matrix);
        final ArrayList arrayList = new ArrayList(this.HaptikSDK$b);
        return new invoke() { // from class: o.areContentsTheSame.4
            @Override // o.areContentsTheSame.invoke
            public void ag$a(Matrix matrix3, PreferenceGroup.OnExpandButtonClickListener onExpandButtonClickListener, int i, Canvas canvas) {
                for (invoke invokeVar : arrayList) {
                    invokeVar.ag$a(matrix2, onExpandButtonClickListener, i, canvas);
                }
            }
        };
    }

    private void values(invoke invokeVar, float f, float f2) {
        valueOf(f);
        this.HaptikSDK$b.add(invokeVar);
        ag$a(f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean ah$a() {
        return this.HaptikSDK$a;
    }

    private void valueOf(float f) {
        if (HaptikSDK$a() == f) {
            return;
        }
        float HaptikSDK$a = ((f - HaptikSDK$a()) + 360.0f) % 360.0f;
        if (HaptikSDK$a > 180.0f) {
            return;
        }
        areContentsTheSame$ag$a arecontentsthesame_ag_a = new areContentsTheSame$ag$a(valueOf(), values(), valueOf(), values());
        arecontentsthesame_ag_a.toString(HaptikSDK$a());
        arecontentsthesame_ag_a.ag$a(HaptikSDK$a);
        this.HaptikSDK$b.add(new areContentsTheSame$ah$a(arecontentsthesame_ag_a));
        ag$a(f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float ag$a() {
        return this.ag$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float HaptikSDK$c() {
        return this.invoke;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float valueOf() {
        return this.values;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float values() {
        return this.ah$a;
    }

    private float HaptikSDK$a() {
        return this.valueOf;
    }

    private float ah$b() {
        return this.toString;
    }

    private void ah$b(float f) {
        this.ag$a = f;
    }

    private void HaptikSDK$b(float f) {
        this.invoke = f;
    }

    private void toString(float f) {
        this.values = f;
    }

    private void ah$a(float f) {
        this.ah$a = f;
    }

    private void ag$a(float f) {
        this.valueOf = f;
    }

    private void values(float f) {
        this.toString = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static abstract class invoke {
        static final Matrix valueOf = new Matrix();

        public abstract void ag$a(Matrix matrix, PreferenceGroup.OnExpandButtonClickListener onExpandButtonClickListener, int i, Canvas canvas);

        public final void toString(PreferenceGroup.OnExpandButtonClickListener onExpandButtonClickListener, int i, Canvas canvas) {
            ag$a(valueOf, onExpandButtonClickListener, i, canvas);
        }
    }

    /* loaded from: classes5.dex */
    static class toString extends invoke {
        private final valueOf ag$a;
        private final float ah$a;
        private final float values;

        public toString(valueOf valueof, float f, float f2) {
            this.ag$a = valueof;
            this.ah$a = f;
            this.values = f2;
        }

        @Override // o.areContentsTheSame.invoke
        public void ag$a(Matrix matrix, PreferenceGroup.OnExpandButtonClickListener onExpandButtonClickListener, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.ag$a.toString - this.values, this.ag$a.values - this.ah$a), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.ah$a, this.values);
            matrix2.preRotate(valueOf());
            onExpandButtonClickListener.values(canvas, matrix2, rectF, i);
        }

        float valueOf() {
            return (float) Math.toDegrees(Math.atan((this.ag$a.toString - this.values) / (this.ag$a.values - this.ah$a)));
        }
    }

    /* loaded from: classes5.dex */
    public static class valueOf extends values {
        private float toString;
        private float values;

        @Override // o.areContentsTheSame.values
        public void values(Matrix matrix, Path path) {
            Matrix matrix2 = this.HaptikSDK$c;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.values, this.toString);
            path.transform(matrix);
        }
    }
}
