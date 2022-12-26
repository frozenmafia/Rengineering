package o;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import o.PreferenceGroup;
/* loaded from: classes5.dex */
public class getOldListSize {
    private final areContentsTheSame[] values = new areContentsTheSame[4];
    private final Matrix[] valueOf = new Matrix[4];
    private final Matrix[] HaptikSDK$a = new Matrix[4];
    private final PointF ah$b = new PointF();
    private final Path invoke = new Path();
    private final Path toString = new Path();
    private final areContentsTheSame HaptikSDK$d = new areContentsTheSame();
    private final float[] HaptikSDK$b = new float[2];
    private final float[] getInitSettings = new float[2];
    private final Path HaptikSDK$c = new Path();
    private final Path ah$a = new Path();
    private boolean ag$a = true;

    /* loaded from: classes5.dex */
    public interface toString {
        void toString(areContentsTheSame arecontentsthesame, Matrix matrix, int i);

        void values(areContentsTheSame arecontentsthesame, Matrix matrix, int i);
    }

    private float valueOf(int i) {
        return (i + 1) * 90;
    }

    public getOldListSize() {
        for (int i = 0; i < 4; i++) {
            this.values[i] = new areContentsTheSame();
            this.valueOf[i] = new Matrix();
            this.HaptikSDK$a[i] = new Matrix();
        }
    }

    public void ag$a(areItemsTheSame areitemsthesame, float f, RectF rectF, Path path) {
        ah$a(areitemsthesame, f, rectF, null, path);
    }

    public void ah$a(areItemsTheSame areitemsthesame, float f, RectF rectF, toString tostring, Path path) {
        path.rewind();
        this.invoke.rewind();
        this.toString.rewind();
        this.toString.addRect(rectF, Path.Direction.CW);
        values valuesVar = new values(areitemsthesame, f, rectF, tostring, path);
        for (int i = 0; i < 4; i++) {
            toString(valuesVar, i);
            ag$a(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            values(valuesVar, i2);
            ah$a(valuesVar, i2);
        }
        path.close();
        this.invoke.close();
        if (Build.VERSION.SDK_INT < 19 || this.invoke.isEmpty()) {
            return;
        }
        path.op(this.invoke, Path.Op.UNION);
    }

    private void toString(values valuesVar, int i) {
        toString(i, valuesVar.toString).toString(this.values[i], 90.0f, valuesVar.values, valuesVar.ag$a, valueOf(i, valuesVar.toString));
        float valueOf = valueOf(i);
        this.valueOf[i].reset();
        valueOf(i, valuesVar.ag$a, this.ah$b);
        this.valueOf[i].setTranslate(this.ah$b.x, this.ah$b.y);
        this.valueOf[i].preRotate(valueOf);
    }

    private void ag$a(int i) {
        this.HaptikSDK$b[0] = this.values[i].valueOf();
        this.HaptikSDK$b[1] = this.values[i].values();
        this.valueOf[i].mapPoints(this.HaptikSDK$b);
        float valueOf = valueOf(i);
        this.HaptikSDK$a[i].reset();
        Matrix matrix = this.HaptikSDK$a[i];
        float[] fArr = this.HaptikSDK$b;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.HaptikSDK$a[i].preRotate(valueOf);
    }

    private void values(values valuesVar, int i) {
        this.HaptikSDK$b[0] = this.values[i].ag$a();
        this.HaptikSDK$b[1] = this.values[i].HaptikSDK$c();
        this.valueOf[i].mapPoints(this.HaptikSDK$b);
        if (i == 0) {
            Path path = valuesVar.ah$a;
            float[] fArr = this.HaptikSDK$b;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = valuesVar.ah$a;
            float[] fArr2 = this.HaptikSDK$b;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.values[i].values(this.valueOf[i], valuesVar.ah$a);
        if (valuesVar.valueOf != null) {
            valuesVar.valueOf.values(this.values[i], this.valueOf[i], i);
        }
    }

    private void ah$a(values valuesVar, int i) {
        int i2 = (i + 1) % 4;
        this.HaptikSDK$b[0] = this.values[i].valueOf();
        this.HaptikSDK$b[1] = this.values[i].values();
        this.valueOf[i].mapPoints(this.HaptikSDK$b);
        this.getInitSettings[0] = this.values[i2].ag$a();
        this.getInitSettings[1] = this.values[i2].HaptikSDK$c();
        this.valueOf[i2].mapPoints(this.getInitSettings);
        float[] fArr = this.HaptikSDK$b;
        float f = fArr[0];
        float[] fArr2 = this.getInitSettings;
        float max = Math.max(((float) Math.hypot(f - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float valueOf = valueOf(valuesVar.ag$a, i);
        this.HaptikSDK$d.ah$a(0.0f, 0.0f);
        isGroupExpandable values2 = values(i, valuesVar.toString);
        values2.ag$a(max, valueOf, valuesVar.values, this.HaptikSDK$d);
        this.HaptikSDK$c.reset();
        this.HaptikSDK$d.values(this.HaptikSDK$a[i], this.HaptikSDK$c);
        if (this.ag$a && Build.VERSION.SDK_INT >= 19 && (values2.HaptikSDK$c() || valueOf(this.HaptikSDK$c, i) || valueOf(this.HaptikSDK$c, i2))) {
            Path path = this.HaptikSDK$c;
            path.op(path, this.toString, Path.Op.DIFFERENCE);
            this.HaptikSDK$b[0] = this.HaptikSDK$d.ag$a();
            this.HaptikSDK$b[1] = this.HaptikSDK$d.HaptikSDK$c();
            this.HaptikSDK$a[i].mapPoints(this.HaptikSDK$b);
            Path path2 = this.invoke;
            float[] fArr3 = this.HaptikSDK$b;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.HaptikSDK$d.values(this.HaptikSDK$a[i], this.invoke);
        } else {
            this.HaptikSDK$d.values(this.HaptikSDK$a[i], valuesVar.ah$a);
        }
        if (valuesVar.valueOf != null) {
            valuesVar.valueOf.toString(this.HaptikSDK$d, this.HaptikSDK$a[i], i);
        }
    }

    private boolean valueOf(Path path, int i) {
        this.ah$a.reset();
        this.values[i].values(this.valueOf[i], this.ah$a);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.ah$a.computeBounds(rectF, true);
        path.op(this.ah$a, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private float valueOf(RectF rectF, int i) {
        this.HaptikSDK$b[0] = this.values[i].values;
        this.HaptikSDK$b[1] = this.values[i].ah$a;
        this.valueOf[i].mapPoints(this.HaptikSDK$b);
        if (i == 1 || i == 3) {
            return Math.abs(rectF.centerX() - this.HaptikSDK$b[0]);
        }
        return Math.abs(rectF.centerY() - this.HaptikSDK$b[1]);
    }

    private createExpandButton toString(int i, areItemsTheSame areitemsthesame) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return areitemsthesame.HaptikSDK$d();
                }
                return areitemsthesame.HaptikWebView();
            }
            return areitemsthesame.ag$a();
        }
        return areitemsthesame.invoke();
    }

    private PreferenceGroup.SavedState.AnonymousClass1 valueOf(int i, areItemsTheSame areitemsthesame) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return areitemsthesame.getInitSettings();
                }
                return areitemsthesame.HaptikSDK$e();
            }
            return areitemsthesame.valueOf();
        }
        return areitemsthesame.ah$b();
    }

    private isGroupExpandable values(int i, areItemsTheSame areitemsthesame) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return areitemsthesame.HaptikSDK$a();
                }
                return areitemsthesame.HaptikSDK$b();
            }
            return areitemsthesame.HaptikSDK$c();
        }
        return areitemsthesame.ah$a();
    }

    private void valueOf(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i == 3) {
            pointF.set(rectF.left, rectF.top);
        } else {
            pointF.set(rectF.right, rectF.top);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class values {
        public final RectF ag$a;
        public final Path ah$a;
        public final areItemsTheSame toString;
        public final toString valueOf;
        public final float values;

        values(areItemsTheSame areitemsthesame, float f, RectF rectF, toString tostring, Path path) {
            this.valueOf = tostring;
            this.toString = areitemsthesame;
            this.values = f;
            this.ag$a = rectF;
            this.ah$a = path;
        }
    }
}
