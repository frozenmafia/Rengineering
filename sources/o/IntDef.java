package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.stepview.HorizontalStepView;
import com.dream11.androidhelpers.adapters.BaseAdapter$ag$a;
import com.dream11.design.button.D11Button;
/* loaded from: classes.dex */
public class IntDef extends BaseAdapter$ag$a {
    public View HaptikSDK$a;
    public HorizontalStepView HaptikSDK$b;
    public ProgressBar HaptikSDK$c;
    CustomTextView HaptikSDK$d;
    public CustomTextView HaptikSDK$e;
    public CustomTextView HaptikWebView;
    public CustomTextView ag$a;
    public CustomTextView ah$a;
    public CustomTextView ah$b;
    public CustomTextView getSignupData;
    public CustomTextView invoke;
    public ImageView toString;
    public View valueOf;
    public D11Button values;

    public IntDef(ViewGroup viewGroup, int i) {
        super(viewGroup.getContext(), i, viewGroup);
        this.HaptikSDK$a = this.itemView;
        this.ah$a = (CustomTextView) this.itemView.findViewById(com.app.dream11Pro.R.id.tv_recent_transactions_amount);
        this.HaptikWebView = (CustomTextView) this.itemView.findViewById(com.app.dream11Pro.R.id.tv_recent_transactions_request_label);
        this.valueOf = this.itemView.findViewById(com.app.dream11Pro.R.id.rl_recent_transactions_lower_container);
        this.HaptikSDK$b = (HorizontalStepView) this.itemView.findViewById(com.app.dream11Pro.R.id.hsv_recent_transactions_progress);
        this.invoke = (CustomTextView) this.itemView.findViewById(com.app.dream11Pro.R.id.tv_recent_transactions_failed_reason);
        this.ah$b = (CustomTextView) this.itemView.findViewById(com.app.dream11Pro.R.id.tv_recent_transactions_id_value);
        this.ag$a = (CustomTextView) this.itemView.findViewById(com.app.dream11Pro.R.id.tv_recent_transactions_expected_date_value);
        this.HaptikSDK$e = (CustomTextView) this.itemView.findViewById(com.app.dream11Pro.R.id.tv_recent_transactions_team_name_value);
        this.HaptikSDK$d = (CustomTextView) this.itemView.findViewById(com.app.dream11Pro.R.id.tv_recent_transactions_team_name_label);
        this.toString = (ImageView) this.itemView.findViewById(com.app.dream11Pro.R.id.iv_recent_transactions_down_arrow);
        this.getSignupData = (CustomTextView) this.itemView.findViewById(com.app.dream11Pro.R.id.tv_recent_transactions_expected_date_label);
        this.values = (D11Button) this.itemView.findViewById(com.app.dream11Pro.R.id.button_reccent_transactions_email_invoice);
        this.HaptikSDK$c = (ProgressBar) this.itemView.findViewById(com.app.dream11Pro.R.id.downloadingprogress);
    }
}
