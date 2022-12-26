package o;

import android.view.View;
/* loaded from: classes6.dex */
public abstract class dispatchMediaButtonEvent implements View.OnClickListener {
    static boolean ah$a = true;
    private static final Runnable toString = getSession2Token.toString;

    public abstract void ag$a(View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (ah$a) {
            ah$a = false;
            view.post(toString);
            ag$a(view);
        }
    }
}
