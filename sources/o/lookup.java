package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.dream11.androidhelpers.adapters.BaseAdapter$ag$a;
/* loaded from: classes.dex */
public class lookup extends BaseAdapter$ag$a {
    setPoint valueOf;

    public lookup(Context context, int i, ViewGroup viewGroup) {
        super(context, i, viewGroup);
        ag$a().findViewById(com.app.dream11Pro.R.id.invite_league).setOnClickListener(new View.OnClickListener() { // from class: o.lookup.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (lookup.this.valueOf != null) {
                    lookup.this.valueOf.values();
                }
            }
        });
        ag$a().findViewById(com.app.dream11Pro.R.id.private_league).setOnClickListener(new View.OnClickListener() { // from class: o.lookup.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (lookup.this.valueOf != null) {
                    lookup.this.valueOf.ag$a();
                }
            }
        });
    }
}
