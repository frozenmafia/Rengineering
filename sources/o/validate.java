package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.app.dream11.dream11.AppConstants;
import com.app.dream11.newmycontests.model.CardVm;
import java.util.List;
/* loaded from: classes3.dex */
public class validate extends androidx.viewpager.widget.PagerAdapter {
    private final AppConstants.LEAGUE_START_VALUE toString;
    List<CardVm> valueOf;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    public validate(AppConstants.LEAGUE_START_VALUE league_start_value) {
        this.toString = league_start_value;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        List<CardVm> list = this.valueOf;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        androidx.databinding.ViewDataBinding inflate = androidx.databinding.DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), com.app.dream11Pro.R.layout.res_0x7f0d0366, viewGroup, false);
        inflate.setVariable(19, this.valueOf.get(i));
        inflate.setVariable(143, this.valueOf.get(i).getHandler());
        inflate.setVariable(androidx.databinding.library.baseAdapters.BR.sourceType, this.toString);
        inflate.setVariable(316, Integer.valueOf(i));
        View root = inflate.getRoot();
        root.setTag("MyMatchCaroisal" + i);
        viewGroup.addView(root);
        return inflate.getRoot();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == ((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public void valueOf(List<CardVm> list) {
        this.valueOf = list;
        notifyDataSetChanged();
    }
}
