package o;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* loaded from: classes.dex */
public class instantiateReceiverCompat extends addDurationItem {
    TextView HaptikSDK$a;
    TextView HaptikSDK$b;
    TextView ag$a;
    ImageView ah$a;
    ProgressBar toString;
    TextView valueOf;
    RelativeLayout values;

    public instantiateReceiverCompat(Context context, int i, ViewGroup viewGroup) {
        super(context, i, viewGroup);
        this.HaptikSDK$a = (TextView) this.itemView.findViewById(com.app.dream11Pro.R.id.tvPersonName);
        this.HaptikSDK$b = (TextView) this.itemView.findViewById(com.app.dream11Pro.R.id.tvTotalAmount);
        this.valueOf = (TextView) this.itemView.findViewById(com.app.dream11Pro.R.id.tvEarnedAmount);
        this.toString = (ProgressBar) this.itemView.findViewById(com.app.dream11Pro.R.id.progressBar);
        this.ah$a = (ImageView) this.itemView.findViewById(com.app.dream11Pro.R.id.imgPerson);
        this.values = (RelativeLayout) this.itemView.findViewById(com.app.dream11Pro.R.id.blockRel);
        this.ag$a = (TextView) this.itemView.findViewById(com.app.dream11Pro.R.id.knowMore);
    }
}
