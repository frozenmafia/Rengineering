package o;
/* loaded from: classes.dex */
public class ActivityViewModelLazyKt {
    private float toString;
    private int values;

    public void ag$a(float f) {
        float f2 = this.toString + f;
        this.toString = f2;
        int i = this.values + 1;
        this.values = i;
        if (i == Integer.MAX_VALUE) {
            this.toString = f2 / 2.0f;
            this.values = i / 2;
        }
    }
}
