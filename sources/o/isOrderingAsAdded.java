package o;

import android.animation.Animator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
/* loaded from: classes7.dex */
public abstract class isOrderingAsAdded<T extends Animator> {
    protected final int[] ah$a;
    protected isOnSameScreenAsChildren valueOf;
    protected final float[] values;

    public abstract void HaptikSDK$c();

    public abstract void ag$a();

    public abstract void ah$a();

    public abstract void ah$b();

    /* JADX INFO: Access modifiers changed from: protected */
    public float valueOf(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void valueOf();

    public abstract void valueOf(Animatable2Compat.AnimationCallback animationCallback);

    /* JADX INFO: Access modifiers changed from: protected */
    public isOrderingAsAdded(int i) {
        this.values = new float[i * 2];
        this.ah$a = new int[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ah$a(isOnSameScreenAsChildren isonsamescreenaschildren) {
        this.valueOf = isonsamescreenaschildren;
    }
}
