package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.app.dream11.model.States;
import com.app.dream11.ui.CustomTextView;
import java.util.List;
/* loaded from: classes3.dex */
public class AnimatorKt$doOnEnd$$inlined$addListener$default$1 extends ArrayAdapter<States> {
    private List<States> toString;
    private Context values;

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public AnimatorKt$doOnEnd$$inlined$addListener$default$1(Context context, int i, List<States> list) {
        super(context, i, list);
        this.values = context;
        States states = new States();
        states.setId(0);
        states.setName(context.getString(com.app.dream11Pro.R.string.res_0x7f120b5a));
        list.add(0, states);
        this.toString = list;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.toString.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: valueOf */
    public States getItem(int i) {
        return this.toString.get(i);
    }

    public int toString(int i) {
        for (int i2 = 0; i2 < this.toString.size(); i2++) {
            if (this.toString.get(i2).getId() == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        Context context = this.values;
        CustomTextView customTextView = new CustomTextView(context, context.getResources().getString(com.app.dream11Pro.R.string.res_0x7f12000e));
        customTextView.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        customTextView.setText(this.toString.get(i).getName());
        return customTextView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        Context context = this.values;
        CustomTextView customTextView = new CustomTextView(context, context.getResources().getString(com.app.dream11Pro.R.string.res_0x7f12000e));
        customTextView.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        customTextView.setTextSize(17.0f);
        customTextView.setPadding(10, 10, 10, 10);
        customTextView.setBackgroundResource(com.app.dream11Pro.R.drawable.white_shadow_top);
        customTextView.setText(this.toString.get(i).getName());
        return customTextView;
    }
}
