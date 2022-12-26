package o;
/* loaded from: classes7.dex */
public class lambda$setVersion$1 {
    private final float ah$a;
    private final float values;

    public final boolean equals(Object obj) {
        if (obj instanceof lambda$setVersion$1) {
            lambda$setVersion$1 lambda_setversion_1 = (lambda$setVersion$1) obj;
            return this.values == lambda_setversion_1.values && this.ah$a == lambda_setversion_1.ah$a;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.values) * 31) + Float.floatToIntBits(this.ah$a);
    }

    public final String toString() {
        return "(" + this.values + ',' + this.ah$a + ')';
    }
}
