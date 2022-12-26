package o;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
/* loaded from: classes7.dex */
public class requirePreferenceManager extends BaseAdapter {
    private static final int ah$a;
    private final Calendar toString;
    private final int valueOf;
    private final int values;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    static {
        ah$a = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public requirePreferenceManager() {
        Calendar values = onCreateLayoutManager.values();
        this.toString = values;
        this.valueOf = values.getMaximum(7);
        this.values = values.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* renamed from: ah$a */
    public Integer getItem(int i) {
        if (i >= this.valueOf) {
            return null;
        }
        return Integer.valueOf(toString(i));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.valueOf;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(Preference$BaseSavedState$HaptikSDK$b.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.toString.set(7, toString(i));
        textView.setText(this.toString.getDisplayName(7, ah$a, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(Preference$BaseSavedState$HaptikSDK$a.mtrl_picker_day_of_week_column_header), this.toString.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    private int toString(int i) {
        int i2 = i + this.values;
        int i3 = this.valueOf;
        return i2 > i3 ? i2 - i3 : i2;
    }
}
