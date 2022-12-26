package o;

import android.view.View;
import android.widget.TextView;
import com.dream11.androidhelpers.adapters.BaseAdapter$ag$a;
/* loaded from: classes3.dex */
public class getDiffY extends resolveRightShadow {
    private final double ag$a;
    private final int toString;

    public getDiffY(int i, double d) {
        super(com.app.dream11Pro.R.layout.res_0x7f0d049b);
        this.toString = i;
        this.ag$a = d;
    }

    @Override // o.resolveRightShadow, com.dream11.androidhelpers.adapters.BaseAdapter
    public void values(BaseAdapter$ag$a baseAdapter$ag$a, int i) {
        super.values(baseAdapter$ag$a, i);
        baseAdapter$ag$a.ag$a().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.getDiff
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return getDiffY.this.values(view);
            }
        });
        TextView textView = (TextView) baseAdapter$ag$a.toString(com.app.dream11Pro.R.id.total_winning);
        textView.setText(textView.getContext().getString(com.app.dream11Pro.R.string.res_0x7f12002d, loadFont.toString(this.ag$a)));
    }

    public /* synthetic */ boolean values(View view) {
        new setPivotY().valueOf(String.valueOf(this.toString));
        return true;
    }
}
