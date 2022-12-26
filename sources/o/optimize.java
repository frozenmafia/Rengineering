package o;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.app.dream11.dream11.BaseActivity;
/* loaded from: classes3.dex */
public class optimize extends conditional {
    private getMetrics ag$a;
    FrameLayout valueOf;

    public optimize(BaseActivity baseActivity, getMetrics getmetrics) {
        super(baseActivity, com.app.dream11Pro.R.layout.res_0x7f0d037e);
        this.ag$a = getmetrics;
    }

    @Override // o.conditional
    protected void values(Bundle bundle) {
        View values = values();
        this.valueOf = (FrameLayout) values.findViewById(com.app.dream11Pro.R.id.imgCancelLayout);
        String charSequence = valueOf().getText(com.app.dream11Pro.R.string.res_0x7f120de4).toString();
        ((TextView) values.findViewById(com.app.dream11Pro.R.id.tvDialogText1)).setText(String.format(charSequence, new attachCompleter().getSignupData() + ""));
        this.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.addConstraint
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                optimize.this.ag$a(view);
            }
        });
        ((TextView) values.findViewById(com.app.dream11Pro.R.id.tvDialogText2)).setOnClickListener(new View.OnClickListener() { // from class: o.releaseRows
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                optimize.this.valueOf(view);
            }
        });
    }

    public /* synthetic */ void ag$a(View view) {
        getMetrics getmetrics = this.ag$a;
        if (getmetrics != null) {
            getmetrics.asBinder();
        }
    }

    public /* synthetic */ void valueOf(View view) {
        getMetrics getmetrics = this.ag$a;
        if (getmetrics != null) {
            getmetrics.getInterfaceDescriptor();
        }
    }
}
