package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes5.dex */
public class setKeyScheme$ah$a extends RecyclerView.ViewHolder {
    ImageView ag$a;
    View ah$a;
    View toString;
    TextView valueOf;
    TextView values;

    public setKeyScheme$ah$a(View view) {
        super(view);
        this.ag$a = (ImageView) view.findViewById(MasterKey$1$ag$a.iv_photo);
        this.values = (TextView) view.findViewById(MasterKey$1$ag$a.folder_title);
        this.valueOf = (TextView) view.findViewById(MasterKey$1$ag$a.folder_count);
        this.ah$a = view.findViewById(MasterKey$1$ag$a.bottomOverlay);
        this.toString = view.findViewById(MasterKey$1$ag$a.transparent_bg);
    }
}
