package o;

import java.lang.annotation.Annotation;
import java.util.List;
import o.FragmentStateAdapter;
import o.ViewPager2;
/* loaded from: classes8.dex */
final class ViewPager2$Orientation$ag$a implements FragmentStateAdapter.DataSetChangeObserver {
    private final /* synthetic */ FragmentStateAdapter.DataSetChangeObserver ag$a = runAnimators.ag$a(ViewPager2.PageTransformer.ag$a, "elementSerializer").values();
    public static final ViewPager2$Orientation$ag$a values = new ViewPager2$Orientation$ag$a();
    private static final String toString = "kotlinx.serialization.json.JsonArray";

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public int ag$a() {
        return this.ag$a.ag$a();
    }

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public List<Annotation> ag$a(int i) {
        return this.ag$a.ag$a(i);
    }

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public int ah$a(String str) {
        runAnimators.ag$a(str, "name");
        return this.ag$a.ah$a(str);
    }

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public String ah$a(int i) {
        return this.ag$a.ah$a(i);
    }

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public boolean ah$b() {
        return this.ag$a.ah$b();
    }

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public boolean invoke() {
        return this.ag$a.invoke();
    }

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public boolean toString(int i) {
        return this.ag$a.toString(i);
    }

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public List<Annotation> valueOf() {
        return this.ag$a.valueOf();
    }

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public FragmentStateAdapter.DataSetChangeObserver valueOf(int i) {
        return this.ag$a.valueOf(i);
    }

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public FragmentViewHolder values() {
        return this.ag$a.values();
    }

    private ViewPager2$Orientation$ag$a() {
    }

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public String ah$a() {
        return toString;
    }
}
