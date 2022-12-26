package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
import o.translateActivityIntentPredicates$ag$a;
/* loaded from: classes5.dex */
public final class DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1 extends Lambda implements Styleable.ChangeBounds<IOException, setAnimationMatrix> {
    final /* synthetic */ int $index$inlined;
    final /* synthetic */ translateActivityIntentPredicates$ag$a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1(translateActivityIntentPredicates$ag$a translateactivityintentpredicates_ag_a, int i) {
        super(1);
        this.this$0 = translateactivityintentpredicates_ag_a;
        this.$index$inlined = i;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(IOException iOException) {
        invoke2(iOException);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(IOException iOException) {
        runAnimators.ag$a(iOException, "it");
        synchronized (this.this$0.valueOf) {
            this.this$0.values();
            setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
        }
    }
}
