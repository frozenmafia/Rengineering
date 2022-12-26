package o;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.app.dream11.core.layoutmanagers.Dream11NPALinearLayoutManager;
import com.google.android.flexbox.FlexboxLayoutManager;
import o.onWindowFocusChanged;
/* loaded from: classes2.dex */
public final class onWindowFocusChanged$ah$a {
    public /* synthetic */ onWindowFocusChanged$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private onWindowFocusChanged$ah$a() {
    }

    /* loaded from: classes2.dex */
    public static final class toString implements onWindowFocusChanged.valueOf {
        toString() {
        }

        @Override // o.onWindowFocusChanged.valueOf
        public RecyclerView.LayoutManager ag$a(androidx.recyclerview.widget.RecyclerView recyclerView) {
            runAnimators.ag$a(recyclerView, "recyclerView");
            return new Dream11NPALinearLayoutManager(recyclerView.getContext());
        }
    }

    public final onWindowFocusChanged.valueOf ah$a() {
        return new toString();
    }

    /* loaded from: classes2.dex */
    public static final class valueOf implements onWindowFocusChanged.valueOf {
        final /* synthetic */ int ah$a;
        final /* synthetic */ boolean toString;

        valueOf(int i, boolean z) {
            this.ah$a = i;
            this.toString = z;
        }

        @Override // o.onWindowFocusChanged.valueOf
        public RecyclerView.LayoutManager ag$a(androidx.recyclerview.widget.RecyclerView recyclerView) {
            runAnimators.ag$a(recyclerView, "recyclerView");
            return new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext(), this.ah$a, this.toString);
        }
    }

    public final onWindowFocusChanged.valueOf valueOf(int i, boolean z) {
        return new valueOf(i, z);
    }

    public final onWindowFocusChanged.valueOf ah$a(final Drawable drawable) {
        return new onWindowFocusChanged.valueOf() { // from class: o.onWindowFocusChanged$ah$a$ag$a
            @Override // o.onWindowFocusChanged.valueOf
            public RecyclerView.LayoutManager ag$a(androidx.recyclerview.widget.RecyclerView recyclerView) {
                runAnimators.ag$a(recyclerView, "recyclerView");
                Drawable drawable2 = drawable;
                if (drawable2 != null) {
                    wasDetached wasdetached = new wasDetached(recyclerView.getContext());
                    wasdetached.valueOf(drawable2);
                    wasdetached.ah$a(3);
                    recyclerView.addItemDecoration(wasdetached);
                }
                FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getContext());
                flexboxLayoutManager.values(0);
                return flexboxLayoutManager;
            }
        };
    }
}
