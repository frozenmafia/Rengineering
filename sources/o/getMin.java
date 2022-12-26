package o;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class getMin extends androidx.fragment.app.FragmentPagerAdapter {
    private final List<String> toString;
    private final androidx.fragment.app.Fragment[] values;

    public getMin(androidx.fragment.app.FragmentManager fragmentManager, int i) {
        super(fragmentManager);
        this.toString = new ArrayList();
        this.values = new androidx.fragment.app.Fragment[i];
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.values.length;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public androidx.fragment.app.Fragment getItem(int i) {
        return this.values[i];
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return this.toString.get(i);
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        this.values[i] = (androidx.fragment.app.Fragment) instantiateItem;
        return instantiateItem;
    }

    public void toString(androidx.fragment.app.Fragment fragment, String str, int i) {
        this.values[i] = fragment;
        this.toString.add(str);
    }
}
