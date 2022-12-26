package o;

import android.view.View;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.lang.ref.WeakReference;
/* loaded from: classes4.dex */
public final class getFragmentManager$ah$a implements View.OnClickListener {
    private EventBinding ag$a;
    private boolean ah$a;
    private WeakReference<View> toString;
    private WeakReference<View> valueOf;
    private View.OnClickListener values;

    public getFragmentManager$ah$a(EventBinding eventBinding, View view, View view2) {
        runAnimators.ag$a(eventBinding, "mapping");
        runAnimators.ag$a(view, "rootView");
        runAnimators.ag$a(view2, "hostView");
        this.ag$a = eventBinding;
        this.toString = new WeakReference<>(view2);
        this.valueOf = new WeakReference<>(view);
        getSharedElementTargetNames getsharedelementtargetnames = getSharedElementTargetNames.valueOf;
        this.values = getSharedElementTargetNames.values(view2);
        this.ah$a = true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isStateAtLeast.values(this)) {
            return;
        }
        try {
            if (isStateAtLeast.values(this)) {
                return;
            }
            runAnimators.ag$a(view, Promotion.ACTION_VIEW);
            View.OnClickListener onClickListener = this.values;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            View view2 = this.valueOf.get();
            View view3 = this.toString.get();
            if (view2 == null || view3 == null) {
                return;
            }
            getFragmentManager getfragmentmanager = getFragmentManager.valueOf;
            getFragmentManager.ag$a(this.ag$a, view2, view3);
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
        }
    }

    public final boolean ah$a() {
        return this.ah$a;
    }
}
