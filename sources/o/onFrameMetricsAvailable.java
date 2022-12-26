package o;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.app.dream11.dream11.BaseActivity;
/* loaded from: classes3.dex */
public class onFrameMetricsAvailable extends conditional {
    private valueOf ag$a;
    FrameLayout ah$a;

    /* loaded from: classes3.dex */
    public interface valueOf {
        void ah$a();

        void values();
    }

    public onFrameMetricsAvailable(BaseActivity baseActivity, valueOf valueof) {
        super(baseActivity, com.app.dream11Pro.R.layout.res_0x7f0d01e1);
        this.ag$a = valueof;
    }

    @Override // o.conditional
    protected void values(Bundle bundle) {
        View values = values();
        this.ah$a = (FrameLayout) values.findViewById(com.app.dream11Pro.R.id.imgCancelLayout);
        this.ah$a.setOnClickListener(new View.OnClickListener() { // from class: o.onFrameMetricsAvailable.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (onFrameMetricsAvailable.this.ag$a != null) {
                    onFrameMetricsAvailable.this.ag$a.values();
                }
            }
        });
        ((Button) values.findViewById(com.app.dream11Pro.R.id.btnLogin)).setOnClickListener(new View.OnClickListener() { // from class: o.onFrameMetricsAvailable.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (onFrameMetricsAvailable.this.ag$a != null) {
                    onFrameMetricsAvailable.this.ag$a.ah$a();
                }
            }
        });
    }
}
