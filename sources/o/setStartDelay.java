package o;

import android.graphics.Bitmap;
import o.WindowInsetsControllerCompat;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class setStartDelay implements translationXBy {
    private final setStartDelay$ag$a ah$a = new setStartDelay$ag$a();
    private final withLayer<toString, Bitmap> ag$a = new withLayer<>();

    @Override // o.translationXBy
    public void ah$a(Bitmap bitmap) {
        this.ag$a.values(this.ah$a.toString(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // o.translationXBy
    public Bitmap toString(int i, int i2, Bitmap.Config config) {
        return this.ag$a.ag$a((withLayer<toString, Bitmap>) this.ah$a.toString(i, i2, config));
    }

    @Override // o.translationXBy
    public Bitmap ah$a() {
        return this.ag$a.ag$a();
    }

    @Override // o.translationXBy
    public String ag$a(Bitmap bitmap) {
        return values(bitmap);
    }

    @Override // o.translationXBy
    public String valueOf(int i, int i2, Bitmap.Config config) {
        return ag$a(i, i2, config);
    }

    @Override // o.translationXBy
    public int toString(Bitmap bitmap) {
        return WindowInsetsControllerCompat.Impl30.AnonymousClass1.valueOf(bitmap);
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.ag$a;
    }

    private static String values(Bitmap bitmap) {
        return ag$a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    static String ag$a(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class toString implements yBy {
        private int ag$a;
        private int ah$a;
        private final setStartDelay$ag$a valueOf;
        private Bitmap.Config values;

        public toString(setStartDelay$ag$a setstartdelay_ag_a) {
            this.valueOf = setstartdelay_ag_a;
        }

        public void ah$a(int i, int i2, Bitmap.Config config) {
            this.ah$a = i;
            this.ag$a = i2;
            this.values = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof toString) {
                toString tostring = (toString) obj;
                if (this.ah$a == tostring.ah$a && this.ag$a == tostring.ag$a && this.values == tostring.values) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.ah$a;
            int i2 = this.ag$a;
            Bitmap.Config config = this.values;
            return (((i * 31) + i2) * 31) + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return setStartDelay.ag$a(this.ah$a, this.ag$a, this.values);
        }

        @Override // o.yBy
        public void values() {
            this.valueOf.ag$a(this);
        }
    }
}
