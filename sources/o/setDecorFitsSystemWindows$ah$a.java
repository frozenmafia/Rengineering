package o;

import java.io.File;
import o.WindowInsetsAnimationCompat;
import o.setDecorFitsSystemWindows;
/* loaded from: classes3.dex */
public class setDecorFitsSystemWindows$ah$a<Data> implements toBounds<File, Data> {
    private final setDecorFitsSystemWindows.toString<Data> ag$a;

    @Override // o.toBounds
    public final void ag$a() {
    }

    public setDecorFitsSystemWindows$ah$a(setDecorFitsSystemWindows.toString<Data> tostring) {
        this.ag$a = tostring;
    }

    @Override // o.toBounds
    public final getUpperBound<File, Data> ag$a(WindowInsetsAnimationCompat.Impl impl) {
        return new setDecorFitsSystemWindows(this.ag$a);
    }
}
