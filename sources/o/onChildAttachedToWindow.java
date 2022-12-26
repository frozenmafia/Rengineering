package o;

import com.google.firebase.database.DatabaseRegistrar;
/* loaded from: classes7.dex */
public final /* synthetic */ class onChildAttachedToWindow implements NestedAdapterWrapper {
    private static final onChildAttachedToWindow ah$a = new onChildAttachedToWindow();

    private onChildAttachedToWindow() {
    }

    public static NestedAdapterWrapper valueOf() {
        return ah$a;
    }

    @Override // o.NestedAdapterWrapper
    public Object toString(removeMessages removemessages) {
        return DatabaseRegistrar.values(removemessages);
    }
}
