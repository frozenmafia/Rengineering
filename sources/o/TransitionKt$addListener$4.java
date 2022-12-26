package o;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;
import o.onTransitionPause;
/* loaded from: classes3.dex */
public final class TransitionKt$addListener$4 {
    private final List<createFromIcon> ah$a;
    private final dirTypeForward[] valueOf;

    public TransitionKt$addListener$4(List<createFromIcon> list) {
        this.ah$a = list;
        this.valueOf = new dirTypeForward[list.size()];
    }

    public void toString(markBefore markbefore, onTransitionPause.toString tostring) {
        for (int i = 0; i < this.valueOf.length; i++) {
            tostring.valueOf();
            dirTypeForward ah$a = markbefore.ah$a(tostring.values(), 3);
            createFromIcon createfromicon = this.ah$a.get(i);
            String str = createfromicon.onNavigationEvent;
            boolean z = MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str);
            FingerprintManagerCompat.toString(z, "Invalid closed caption mime type provided: " + str);
            ah$a.ag$a(new createFromIcon$ag$a().ah$a(createfromicon.HaptikWebView != null ? createfromicon.HaptikWebView : tostring.ah$a()).invoke(str).getSignupData(createfromicon.onPostMessage).ag$a(createfromicon.onXdkEvent).toString(createfromicon.ag$a).ah$a(createfromicon.ak).valueOf());
            this.valueOf[i] = ah$a;
        }
    }

    public void values(long j, C$default$setContentDescription c$default$setContentDescription) {
        TelephonyManagerCompat.valueOf(j, c$default$setContentDescription, this.valueOf);
    }
}
