package androidx.core.view;

import android.view.ViewParent;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
final /* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements Styleable.ChangeBounds<ViewParent, ViewParent> {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public final ViewParent invoke(ViewParent viewParent) {
        runAnimators.ag$a(viewParent, "p0");
        return viewParent.getParent();
    }
}
