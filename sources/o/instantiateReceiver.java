package o;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
/* loaded from: classes.dex */
public class instantiateReceiver extends addDurationItem {
    ImageView ag$a;
    TextView toString;

    public instantiateReceiver(Context context, int i, ViewGroup viewGroup) {
        super(context, i, viewGroup);
        this.toString = (TextView) this.itemView.findViewById(com.app.dream11Pro.R.id.tvPersonName);
        this.ag$a = (ImageView) this.itemView.findViewById(com.app.dream11Pro.R.id.imgPerson);
    }
}
