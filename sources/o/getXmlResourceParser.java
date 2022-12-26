package o;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.List;
/* loaded from: classes3.dex */
public abstract class getXmlResourceParser<T> extends androidx.viewpager.widget.PagerAdapter {
    private List<? extends T> ag$a;
    private boolean toString;
    private SparseArray<androidx.databinding.ViewDataBinding> valueOf;

    private final int ah$a(int i) {
        return 0;
    }

    protected abstract androidx.databinding.ViewDataBinding ah$a(int i, ViewGroup viewGroup, int i2);

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        runAnimators.ag$a(obj, "object");
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        runAnimators.ag$a(view, Promotion.ACTION_VIEW);
        runAnimators.ag$a(obj, "object");
        return view == obj;
    }

    protected abstract void valueOf(androidx.databinding.ViewDataBinding viewDataBinding, int i, int i2);

    public getXmlResourceParser(List<? extends T> list) {
        runAnimators.ag$a(list, "itemList");
        this.valueOf = new SparseArray<>();
        this.toString = true;
        ah$a(list);
    }

    public final int ag$a() {
        List<? extends T> list = this.ag$a;
        if (list == null) {
            runAnimators.valueOf("itemList");
            list = null;
        }
        return list.size();
    }

    public final void ah$a(List<? extends T> list) {
        runAnimators.ag$a(list, "itemList");
        this.valueOf = new SparseArray<>();
        this.ag$a = list;
        this.toString = list.size() > 1;
        notifyDataSetChanged();
    }

    public final List<T> valueOf() {
        List list = (List<? extends T>) this.ag$a;
        if (list == null) {
            runAnimators.valueOf("itemList");
            return null;
        }
        return list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        androidx.databinding.ViewDataBinding viewDataBinding;
        View root;
        runAnimators.ag$a(viewGroup, TtmlNode.RUBY_CONTAINER);
        if (this.toString) {
            i = valueOf(i);
        }
        int ah$a = ah$a(i);
        if (this.valueOf.get(ah$a, null) == null) {
            viewDataBinding = ah$a(ah$a, viewGroup, i);
            root = viewDataBinding.getRoot();
            runAnimators.ah$a(root, "binding.root");
        } else {
            androidx.databinding.ViewDataBinding viewDataBinding2 = this.valueOf.get(ah$a);
            runAnimators.ah$a(viewDataBinding2, "viewCache.get(viewType)");
            viewDataBinding = viewDataBinding2;
            root = viewDataBinding.getRoot();
            runAnimators.ah$a(root, "binding.root");
            this.valueOf.remove(ah$a);
        }
        valueOf(viewDataBinding, i, ah$a);
        viewGroup.addView(root);
        return root;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        runAnimators.ag$a(viewGroup, TtmlNode.RUBY_CONTAINER);
        runAnimators.ag$a(obj, "object");
        if (this.toString) {
            i = valueOf(i);
        }
        View view = (View) obj;
        viewGroup.removeView(view);
        this.valueOf.put(ah$a(i), androidx.databinding.DataBindingUtil.getBinding(view));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        List<? extends T> list = this.ag$a;
        if (list == null) {
            runAnimators.valueOf("itemList");
            list = null;
        }
        int size = list.size();
        return this.toString ? size + 2 : size;
    }

    private final int valueOf(int i) {
        if (this.toString) {
            List<? extends T> list = null;
            if (i == 0) {
                List<? extends T> list2 = this.ag$a;
                if (list2 == null) {
                    runAnimators.valueOf("itemList");
                } else {
                    list = list2;
                }
                i = list.size();
            } else {
                List<? extends T> list3 = this.ag$a;
                if (list3 == null) {
                    runAnimators.valueOf("itemList");
                } else {
                    list = list3;
                }
                if (i > list.size()) {
                    return 0;
                }
            }
            return i - 1;
        }
        return i;
    }
}
