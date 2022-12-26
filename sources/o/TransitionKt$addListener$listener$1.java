package o;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;
import o.onTransitionPause;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TransitionKt$addListener$listener$1 {
    private final List<createFromIcon> ag$a;
    private final dirTypeForward[] toString;

    public TransitionKt$addListener$listener$1(List<createFromIcon> list) {
        this.ag$a = list;
        this.toString = new dirTypeForward[list.size()];
    }

    public void ah$a(markBefore markbefore, onTransitionPause.toString tostring) {
        for (int i = 0; i < this.toString.length; i++) {
            tostring.valueOf();
            dirTypeForward ah$a = markbefore.ah$a(tostring.values(), 3);
            createFromIcon createfromicon = this.ag$a.get(i);
            String str = createfromicon.onNavigationEvent;
            boolean z = MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str);
            FingerprintManagerCompat.toString(z, "Invalid closed caption mime type provided: " + str);
            ah$a.ag$a(new createFromIcon$ag$a().ah$a(tostring.ah$a()).invoke(str).getSignupData(createfromicon.onPostMessage).ag$a(createfromicon.onXdkEvent).toString(createfromicon.ag$a).ah$a(createfromicon.ak).valueOf());
            this.toString[i] = ah$a;
        }
    }

    public void ag$a(long j, C$default$setContentDescription c$default$setContentDescription) {
        if (c$default$setContentDescription.ag$a() < 9) {
            return;
        }
        int signupData = c$default$setContentDescription.getSignupData();
        int signupData2 = c$default$setContentDescription.getSignupData();
        int extraCallbackWithResult = c$default$setContentDescription.extraCallbackWithResult();
        if (signupData == 434 && signupData2 == 1195456820 && extraCallbackWithResult == 3) {
            TelephonyManagerCompat.values(j, c$default$setContentDescription, this.toString);
        }
    }
}
