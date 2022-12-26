package o;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
/* loaded from: classes.dex */
public abstract class FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1 extends ReplacementSpan implements FragmentViewLifecycleOwner {
    public abstract void HaptikSDK$a();

    public abstract int ag$a();

    public abstract void ah$a();

    public abstract void invoke();

    public abstract Drawable valueOf();

    public abstract void valueOf(TextView textView);

    public abstract void values();

    public static void values(Spannable spannable, TextView textView) {
        FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1[] fragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1Arr;
        for (FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1 fragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1 : (FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1[]) spannable.getSpans(0, spannable.length(), FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1.class)) {
            fragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1.ah$a();
            fragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1.valueOf(textView);
        }
    }
}
