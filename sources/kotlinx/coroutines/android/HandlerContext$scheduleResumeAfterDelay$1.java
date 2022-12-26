package kotlinx.coroutines.android;

import android.os.Handler;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.fromInputStream;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
public final class HandlerContext$scheduleResumeAfterDelay$1 extends Lambda implements Styleable.ChangeBounds<Throwable, setAnimationMatrix> {
    final /* synthetic */ Runnable $block;
    final /* synthetic */ fromInputStream this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerContext$scheduleResumeAfterDelay$1(fromInputStream frominputstream, Runnable runnable) {
        super(1);
        this.this$0 = frominputstream;
        this.$block = runnable;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        invoke2(th);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        Handler handler;
        handler = this.this$0.values;
        handler.removeCallbacks(this.$block);
    }
}
