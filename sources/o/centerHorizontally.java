package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.app.dream11.model.LeaderTours;
import com.app.dream11.ui.CustomTextView;
import java.util.List;
/* loaded from: classes3.dex */
public class centerHorizontally extends ArrayAdapter<LeaderTours> {
    private Context ah$a;
    private List<LeaderTours> values;

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public centerHorizontally(Context context, List<LeaderTours> list) {
        super(context, 17367048, list);
        this.ah$a = context;
        this.values = list;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.values.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: ag$a */
    public LeaderTours getItem(int i) {
        return this.values.get(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        Context context = this.ah$a;
        CustomTextView customTextView = new CustomTextView(context, context.getResources().getString(com.app.dream11Pro.R.string.res_0x7f12000e));
        customTextView.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        customTextView.setText(this.values.get(i).getTourName());
        return customTextView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        Context context = this.ah$a;
        CustomTextView customTextView = new CustomTextView(context, context.getResources().getString(com.app.dream11Pro.R.string.res_0x7f12000e));
        customTextView.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        customTextView.setTextSize(15.0f);
        customTextView.setPadding(20, 20, 20, 20);
        customTextView.setBackgroundResource(com.app.dream11Pro.R.drawable.white_shadow_top);
        customTextView.setText(this.values.get(i).getTourName());
        return customTextView;
    }
}
