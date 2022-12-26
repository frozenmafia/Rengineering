package androidx.fragment.app;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class FragmentManagerKt {
    public static /* synthetic */ void commit$default(FragmentManager fragmentManager, boolean z, Styleable.ChangeBounds changeBounds, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        runAnimators.ag$a(fragmentManager, "$this$commit");
        runAnimators.ag$a(changeBounds, TtmlNode.TAG_BODY);
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        runAnimators.ah$a(beginTransaction, "beginTransaction()");
        changeBounds.invoke(beginTransaction);
        if (z) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    public static final void commit(FragmentManager fragmentManager, boolean z, Styleable.ChangeBounds<? super FragmentTransaction, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(fragmentManager, "$this$commit");
        runAnimators.ag$a(changeBounds, TtmlNode.TAG_BODY);
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        runAnimators.ah$a(beginTransaction, "beginTransaction()");
        changeBounds.invoke(beginTransaction);
        if (z) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    public static /* synthetic */ void commitNow$default(FragmentManager fragmentManager, boolean z, Styleable.ChangeBounds changeBounds, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        runAnimators.ag$a(fragmentManager, "$this$commitNow");
        runAnimators.ag$a(changeBounds, TtmlNode.TAG_BODY);
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        runAnimators.ah$a(beginTransaction, "beginTransaction()");
        changeBounds.invoke(beginTransaction);
        if (z) {
            beginTransaction.commitNowAllowingStateLoss();
        } else {
            beginTransaction.commitNow();
        }
    }

    public static final void commitNow(FragmentManager fragmentManager, boolean z, Styleable.ChangeBounds<? super FragmentTransaction, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(fragmentManager, "$this$commitNow");
        runAnimators.ag$a(changeBounds, TtmlNode.TAG_BODY);
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        runAnimators.ah$a(beginTransaction, "beginTransaction()");
        changeBounds.invoke(beginTransaction);
        if (z) {
            beginTransaction.commitNowAllowingStateLoss();
        } else {
            beginTransaction.commitNow();
        }
    }

    public static /* synthetic */ void transaction$default(FragmentManager fragmentManager, boolean z, boolean z2, Styleable.ChangeBounds changeBounds, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        runAnimators.ag$a(fragmentManager, "$this$transaction");
        runAnimators.ag$a(changeBounds, TtmlNode.TAG_BODY);
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        runAnimators.ah$a(beginTransaction, "beginTransaction()");
        changeBounds.invoke(beginTransaction);
        if (z) {
            if (z2) {
                beginTransaction.commitNowAllowingStateLoss();
            } else {
                beginTransaction.commitNow();
            }
        } else if (z2) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    public static final void transaction(FragmentManager fragmentManager, boolean z, boolean z2, Styleable.ChangeBounds<? super FragmentTransaction, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(fragmentManager, "$this$transaction");
        runAnimators.ag$a(changeBounds, TtmlNode.TAG_BODY);
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        runAnimators.ah$a(beginTransaction, "beginTransaction()");
        changeBounds.invoke(beginTransaction);
        if (z) {
            if (z2) {
                beginTransaction.commitNowAllowingStateLoss();
            } else {
                beginTransaction.commitNow();
            }
        } else if (z2) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }
}
