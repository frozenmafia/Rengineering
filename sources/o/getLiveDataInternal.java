package o;

import android.content.Context;
import android.util.TypedValue;
/* loaded from: classes4.dex */
public final class getLiveDataInternal {
    public static final getLiveDataInternal ah$a = new getLiveDataInternal();

    private getLiveDataInternal() {
    }

    public final int toString(int i, Context context) {
        runAnimators.ag$a(context, "context");
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }
}
