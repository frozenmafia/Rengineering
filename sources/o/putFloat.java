package o;
/* loaded from: classes7.dex */
public class putFloat extends isGroupExpandable implements Cloneable {
    private float ag$a;
    private float ah$a;
    private float invoke;
    private float toString;
    private float valueOf;
    private float values = -1.0f;

    public putFloat(float f, float f2, float f3) {
        this.toString = f;
        this.invoke = f2;
        values(f3);
        this.valueOf = 0.0f;
    }

    @Override // o.isGroupExpandable
    public void ag$a(float f, float f2, float f3, areContentsTheSame arecontentsthesame) {
        float f4;
        float f5;
        float f6 = this.ag$a;
        if (f6 == 0.0f) {
            arecontentsthesame.toString(f, 0.0f);
            return;
        }
        float f7 = ((this.toString * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.invoke;
        float f9 = f2 + this.valueOf;
        float f10 = (this.ah$a * f3) + ((1.0f - f3) * f7);
        if (f10 / f7 >= 1.0f) {
            arecontentsthesame.toString(f, 0.0f);
            return;
        }
        float f11 = this.values;
        float f12 = f11 * f3;
        boolean z = f11 == -1.0f || Math.abs((f11 * 2.0f) - f6) < 0.1f;
        if (z) {
            f4 = f10;
            f5 = 0.0f;
        } else {
            f5 = 1.75f;
            f4 = 0.0f;
        }
        float f13 = f7 + f8;
        float f14 = f4 + f8;
        float sqrt = (float) Math.sqrt((f13 * f13) - (f14 * f14));
        float f15 = f9 - sqrt;
        float f16 = f9 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f14));
        float f17 = (90.0f - degrees) + f5;
        arecontentsthesame.toString(f15, 0.0f);
        float f18 = f8 * 2.0f;
        arecontentsthesame.ag$a(f15 - f8, 0.0f, f15 + f8, f18, 270.0f, degrees);
        if (z) {
            arecontentsthesame.ag$a(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f17, (f17 * 2.0f) - 180.0f);
        } else {
            float f19 = this.toString;
            float f20 = f12 * 2.0f;
            float f21 = f9 - f7;
            float f22 = f12 + f19;
            arecontentsthesame.ag$a(f21, -f22, f21 + f19 + f20, f22, 180.0f - f17, ((f17 * 2.0f) - 180.0f) / 2.0f);
            float f23 = f9 + f7;
            float f24 = this.toString;
            arecontentsthesame.toString(f23 - ((f24 / 2.0f) + f12), f24 + f12);
            float f25 = this.toString;
            float f26 = f12 + f25;
            arecontentsthesame.ag$a(f23 - (f20 + f25), -f26, f23, f26, 90.0f, f17 - 90.0f);
        }
        arecontentsthesame.ag$a(f16 - f8, 0.0f, f16 + f8, f18, 270.0f - degrees, degrees);
        arecontentsthesame.toString(f, 0.0f);
    }

    public float HaptikSDK$a() {
        return this.ag$a;
    }

    public void ah$a(float f) {
        this.ag$a = f;
    }

    public void HaptikSDK$b(float f) {
        this.valueOf = f;
    }

    public float HaptikSDK$b() {
        return this.valueOf;
    }

    public float ag$a() {
        return this.ah$a;
    }

    public void values(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.ah$a = f;
    }

    public float valueOf() {
        return this.toString;
    }

    public void ag$a(float f) {
        this.toString = f;
    }

    public float values() {
        return this.invoke;
    }

    public void toString(float f) {
        this.invoke = f;
    }

    public float ah$a() {
        return this.values;
    }

    public void valueOf(float f) {
        this.values = f;
    }
}
