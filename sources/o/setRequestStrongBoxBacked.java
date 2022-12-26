package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public class setRequestStrongBoxBacked extends androidx.fragment.app.FragmentPagerAdapter {
    private final List<androidx.fragment.app.Fragment> ag$a;
    private final List<String> ah$a;

    public setRequestStrongBoxBacked(androidx.fragment.app.FragmentManager fragmentManager) {
        super(fragmentManager);
        this.ag$a = new ArrayList();
        this.ah$a = new ArrayList();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public androidx.fragment.app.Fragment getItem(int i) {
        return this.ag$a.get(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.ag$a.size();
    }

    public void ah$a(androidx.fragment.app.Fragment fragment, String str) {
        this.ag$a.add(fragment);
        this.ah$a.add(str);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return this.ah$a.get(i);
    }
}
