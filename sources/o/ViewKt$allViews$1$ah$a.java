package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
final class ViewKt$allViews$1$ah$a implements Iterable<ViewKt$allViews$1$ag$a> {
    private final List<ViewKt$allViews$1$ag$a> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewKt$allViews$1$ah$a() {
        this(new ArrayList(2));
    }

    ViewKt$allViews$1$ah$a(List<ViewKt$allViews$1$ag$a> list) {
        this.values = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a(systemBars systembars, Executor executor) {
        this.values.add(new ViewKt$allViews$1$ag$a(systembars, executor));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a(systemBars systembars) {
        this.values.remove(valueOf(systembars));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean ah$a(systemBars systembars) {
        return this.values.contains(valueOf(systembars));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean valueOf() {
        return this.values.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int ag$a() {
        return this.values.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values() {
        this.values.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewKt$allViews$1$ah$a ah$a() {
        return new ViewKt$allViews$1$ah$a(new ArrayList(this.values));
    }

    private static ViewKt$allViews$1$ag$a valueOf(systemBars systembars) {
        return new ViewKt$allViews$1$ag$a(systembars, WindowInsetsControllerCompat.Impl20.AnonymousClass1.values());
    }

    @Override // java.lang.Iterable
    public Iterator<ViewKt$allViews$1$ag$a> iterator() {
        return this.values.iterator();
    }
}
