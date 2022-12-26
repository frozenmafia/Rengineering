package o;

import o.WindowInsetsControllerCompat;
import o.getScaledHorizontalScrollFactor;
/* loaded from: classes3.dex */
public abstract class getScaledHorizontalScrollFactor<CHILD extends getScaledHorizontalScrollFactor<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    private setSystemBarsBehavior<? super TranscodeType> ag$a = setAppearanceLightStatusBars.valueOf();

    private CHILD valueOf() {
        return this;
    }

    public final CHILD ah$a(setSystemBarsBehavior<? super TranscodeType> setsystembarsbehavior) {
        this.ag$a = (setSystemBarsBehavior) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(setsystembarsbehavior);
        return valueOf();
    }

    /* renamed from: ag$a */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setSystemBarsBehavior<? super TranscodeType> ah$a() {
        return this.ag$a;
    }
}
