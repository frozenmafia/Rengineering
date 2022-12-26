package o;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
/* loaded from: classes7.dex */
public class getPreferenceScreen$ah$a extends RecyclerView.ViewHolder {
    final MaterialCalendarGridView valueOf;
    final TextView values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getPreferenceScreen$ah$a(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(Preference$BaseSavedState$HaptikSDK$c.month_title);
        this.values = textView;
        androidx.core.view.ViewCompat.setAccessibilityHeading(textView, true);
        this.valueOf = (MaterialCalendarGridView) linearLayout.findViewById(Preference$BaseSavedState$HaptikSDK$c.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
