package o;

import android.os.Bundle;
import com.sendbird.android.constant.StringSet;
import o.TranslationAnimationCreator;
/* loaded from: classes4.dex */
public final class EmojiAppCompatTextView<T> implements TransitionManager<androidx.fragment.app.Fragment, T> {
    private final String ah$a;
    private final T valueOf;

    public EmojiAppCompatTextView(String str, T t) {
        runAnimators.ag$a(str, StringSet.key);
        runAnimators.ag$a(t, "defaultValue");
        this.ah$a = str;
        this.valueOf = t;
    }

    @Override // o.TransitionManager
    /* renamed from: ag$a */
    public T ah$a(androidx.fragment.app.Fragment fragment, TranslationAnimationCreator.TransitionPositionListener<?> transitionPositionListener) {
        runAnimators.ag$a(fragment, "thisRef");
        runAnimators.ag$a(transitionPositionListener, "property");
        Bundle arguments = fragment.getArguments();
        T t = null;
        Object obj = arguments == null ? null : arguments.get(this.ah$a);
        if (obj != null) {
            t = (T) obj;
        }
        return t == null ? this.valueOf : t;
    }

    @Override // o.TransitionManager
    /* renamed from: ag$a */
    public void toString(androidx.fragment.app.Fragment fragment, TranslationAnimationCreator.TransitionPositionListener<?> transitionPositionListener, T t) {
        runAnimators.ag$a(fragment, "thisRef");
        runAnimators.ag$a(transitionPositionListener, "property");
        runAnimators.ag$a(t, "value");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            fragment.setArguments(arguments);
        }
        setFilters.ag$a(arguments, this.ah$a, t);
    }
}
