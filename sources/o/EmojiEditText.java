package o;

import android.os.Bundle;
import android.os.Parcelable;
import com.sendbird.android.constant.StringSet;
import java.util.ArrayList;
import o.TranslationAnimationCreator;
/* loaded from: classes4.dex */
public final class EmojiEditText<T extends Parcelable> implements TransitionManager<androidx.fragment.app.Fragment, ArrayList<T>> {
    private final ArrayList<T> ah$a;
    private final String values;

    public EmojiEditText(String str, ArrayList<T> arrayList) {
        runAnimators.ag$a(str, StringSet.key);
        runAnimators.ag$a(arrayList, "defaultValue");
        this.values = str;
        this.ah$a = arrayList;
    }

    @Override // o.TransitionManager
    /* renamed from: ag$a */
    public ArrayList<T> ah$a(androidx.fragment.app.Fragment fragment, TranslationAnimationCreator.TransitionPositionListener<?> transitionPositionListener) {
        runAnimators.ag$a(fragment, "thisRef");
        runAnimators.ag$a(transitionPositionListener, "property");
        Bundle arguments = fragment.getArguments();
        ArrayList<T> parcelableArrayList = arguments == null ? null : arguments.getParcelableArrayList(this.values);
        return parcelableArrayList == null ? this.ah$a : parcelableArrayList;
    }

    @Override // o.TransitionManager
    /* renamed from: ag$a */
    public void toString(androidx.fragment.app.Fragment fragment, TranslationAnimationCreator.TransitionPositionListener<?> transitionPositionListener, ArrayList<T> arrayList) {
        runAnimators.ag$a(fragment, "thisRef");
        runAnimators.ag$a(transitionPositionListener, "property");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            fragment.setArguments(arguments);
        }
        arguments.putParcelableArrayList(this.values, arrayList);
    }
}
