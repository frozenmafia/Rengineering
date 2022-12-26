package o;

import java.util.concurrent.ThreadFactory;
import o.RecyclerView;
/* loaded from: classes5.dex */
public final /* synthetic */ class getAbsoluteAdapterPosition implements ThreadFactory {
    public static final /* synthetic */ getAbsoluteAdapterPosition ag$a = new getAbsoluteAdapterPosition();

    private /* synthetic */ getAbsoluteAdapterPosition() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return RecyclerView.LayoutManager.AnonymousClass2.values(runnable);
    }
}
