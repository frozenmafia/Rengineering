package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import o.Styleable;
/* loaded from: classes4.dex */
public abstract class onAudioFocusChange extends RecyclerView.ViewHolder {
    public boolean ag$a(Styleable.ArcMotion<setAnimationMatrix> arcMotion) {
        runAnimators.ag$a(arcMotion, "onLoad");
        return false;
    }

    public abstract void toString(Object obj);

    public abstract void values();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onAudioFocusChange(View view) {
        super(view);
        runAnimators.ag$a(view, "itemView");
    }
}
