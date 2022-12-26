package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public class ConfigurationHelper$ag$a extends RecyclerView.ViewHolder {
    public CustomTextView ag$a;
    ImageView ah$a;
    RelativeLayout valueOf;
    public CustomTextView values;

    public ConfigurationHelper$ag$a(View view) {
        super(view);
        this.ag$a = (CustomTextView) view.findViewById(com.app.dream11Pro.R.id.chkSelected);
        this.values = (CustomTextView) view.findViewById(com.app.dream11Pro.R.id.tick);
        this.ah$a = (ImageView) view.findViewById(com.app.dream11Pro.R.id.teamImage);
        this.valueOf = (RelativeLayout) view.findViewById(com.app.dream11Pro.R.id.rel);
    }
}
