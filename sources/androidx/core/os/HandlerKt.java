package androidx.core.os;

import android.os.Handler;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class HandlerKt {
    public static /* synthetic */ Runnable postDelayed$default(Handler handler, long j, Object obj, Styleable.ArcMotion arcMotion, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        runAnimators.ag$a(handler, "<this>");
        runAnimators.ag$a(arcMotion, "action");
        HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new HandlerKt$postDelayed$runnable$1(arcMotion);
        if (obj == null) {
            handler.postDelayed(handlerKt$postDelayed$runnable$1, j);
        } else {
            HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j);
        }
        return handlerKt$postDelayed$runnable$1;
    }

    public static final Runnable postDelayed(Handler handler, long j, Object obj, Styleable.ArcMotion<setAnimationMatrix> arcMotion) {
        runAnimators.ag$a(handler, "<this>");
        runAnimators.ag$a(arcMotion, "action");
        HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new HandlerKt$postDelayed$runnable$1(arcMotion);
        if (obj == null) {
            handler.postDelayed(handlerKt$postDelayed$runnable$1, j);
        } else {
            HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j);
        }
        return handlerKt$postDelayed$runnable$1;
    }

    public static /* synthetic */ Runnable postAtTime$default(Handler handler, long j, Object obj, Styleable.ArcMotion arcMotion, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        runAnimators.ag$a(handler, "<this>");
        runAnimators.ag$a(arcMotion, "action");
        HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new HandlerKt$postAtTime$runnable$1(arcMotion);
        handler.postAtTime(handlerKt$postAtTime$runnable$1, obj, j);
        return handlerKt$postAtTime$runnable$1;
    }

    public static final Runnable postAtTime(Handler handler, long j, Object obj, Styleable.ArcMotion<setAnimationMatrix> arcMotion) {
        runAnimators.ag$a(handler, "<this>");
        runAnimators.ag$a(arcMotion, "action");
        HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new HandlerKt$postAtTime$runnable$1(arcMotion);
        handler.postAtTime(handlerKt$postAtTime$runnable$1, obj, j);
        return handlerKt$postAtTime$runnable$1;
    }
}
