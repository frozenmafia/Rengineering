package o;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import o.FragmentStateAdapter;
import o.ViewPager2;
/* loaded from: classes5.dex */
public final class onLmInitializeAccessibilityNodeInfo implements FragmentStateAdapter.DataSetChangeObserver, addTransformer {
    private final Set<String> ag$a;
    private final FragmentStateAdapter.DataSetChangeObserver toString;
    private final String values;

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public int ag$a() {
        return this.toString.ag$a();
    }

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public List<Annotation> ag$a(int i) {
        return this.toString.ag$a(i);
    }

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public int ah$a(String str) {
        runAnimators.ag$a(str, "name");
        return this.toString.ah$a(str);
    }

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public String ah$a(int i) {
        return this.toString.ah$a(i);
    }

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public boolean ah$b() {
        return true;
    }

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public boolean invoke() {
        return this.toString.invoke();
    }

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public boolean toString(int i) {
        return this.toString.toString(i);
    }

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public List<Annotation> valueOf() {
        return this.toString.valueOf();
    }

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public FragmentStateAdapter.DataSetChangeObserver valueOf(int i) {
        return this.toString.valueOf(i);
    }

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public FragmentViewHolder values() {
        return this.toString.values();
    }

    public onLmInitializeAccessibilityNodeInfo(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver) {
        runAnimators.ag$a(dataSetChangeObserver, "original");
        this.toString = dataSetChangeObserver;
        this.values = runAnimators.values(dataSetChangeObserver.ah$a(), (Object) "?");
        this.ag$a = ViewPager2.AnonymousClass3.toString(dataSetChangeObserver);
    }

    public final FragmentStateAdapter.DataSetChangeObserver HaptikSDK$c() {
        return this.toString;
    }

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public String ah$a() {
        return this.values;
    }

    @Override // o.addTransformer
    public Set<String> HaptikSDK$b() {
        return this.ag$a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onLmInitializeAccessibilityNodeInfo) && runAnimators.values(this.toString, ((onLmInitializeAccessibilityNodeInfo) obj).toString);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.toString);
        sb.append('?');
        return sb.toString();
    }

    public int hashCode() {
        return this.toString.hashCode() * 31;
    }
}
