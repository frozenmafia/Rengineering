package o;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.webkit.WebView;
/* loaded from: classes4.dex */
public class getColumnCount extends WebView {
    private int ag$a;
    private int ah$a;
    private int toString;
    public final Point valueOf;
    private int values;

    public getColumnCount(Context context, int i, int i2, int i3, int i4) {
        super(context);
        this.valueOf = new Point();
        this.toString = i;
        this.values = i2;
        this.ah$a = i3;
        this.ag$a = i4;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        setVerticalFadingEdgeEnabled(false);
        setOverScrollMode(2);
        setBackgroundColor(0);
        setId(188293);
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        values();
        setMeasuredDimension(this.valueOf.x, this.valueOf.y);
    }

    public void values() {
        int i = this.toString;
        if (i != 0) {
            this.valueOf.x = (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
        } else {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            this.valueOf.x = (int) ((displayMetrics.widthPixels * this.ah$a) / 100.0f);
        }
        int i2 = this.values;
        if (i2 != 0) {
            this.valueOf.y = (int) TypedValue.applyDimension(1, i2, getResources().getDisplayMetrics());
            return;
        }
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        this.valueOf.y = (int) ((displayMetrics2.heightPixels * this.ag$a) / 100.0f);
    }
}
