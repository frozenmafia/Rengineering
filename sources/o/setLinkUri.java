package o;

import android.content.Context;
import com.appsamurai.storyly.styling.StoryGroupView;
/* loaded from: classes3.dex */
public final class setLinkUri extends OnReceiveContentListener {
    public final Context ag$a;
    public final OnReceiveContentViewBehavior ah$a;

    public setLinkUri(Context context, OnReceiveContentViewBehavior onReceiveContentViewBehavior) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(onReceiveContentViewBehavior, "storylyTheme");
        this.ag$a = context;
        this.ah$a = onReceiveContentViewBehavior;
    }

    @Override // o.OnReceiveContentListener
    public StoryGroupView values() {
        return new com.appsamurai.storyly.storylylist.a(this.ag$a, this.ah$a);
    }
}
