package o;

import android.os.Bundle;
import com.sendbird.android.constant.StringSet;
import java.util.ArrayList;
import o.TranslationAnimationCreator;
/* loaded from: classes4.dex */
public final class setMaxEmojiCount implements TransitionManager<androidx.fragment.app.Fragment, ArrayList<String>> {
    private final ArrayList<String> ah$a;
    private final String values;

    public setMaxEmojiCount(String str, ArrayList<String> arrayList) {
        runAnimators.ag$a(str, StringSet.key);
        runAnimators.ag$a(arrayList, "defaultValue");
        this.values = str;
        this.ah$a = arrayList;
    }

    @Override // o.TransitionManager
    public /* bridge */ /* synthetic */ ArrayList<String> ah$a(androidx.fragment.app.Fragment fragment, TranslationAnimationCreator.TransitionPositionListener transitionPositionListener) {
        return ah$a2(fragment, (TranslationAnimationCreator.TransitionPositionListener<?>) transitionPositionListener);
    }

    /* renamed from: ah$a  reason: avoid collision after fix types in other method */
    public ArrayList<String> ah$a2(androidx.fragment.app.Fragment fragment, TranslationAnimationCreator.TransitionPositionListener<?> transitionPositionListener) {
        runAnimators.ag$a(fragment, "thisRef");
        runAnimators.ag$a(transitionPositionListener, "property");
        Bundle arguments = fragment.getArguments();
        ArrayList<String> stringArrayList = arguments == null ? null : arguments.getStringArrayList(this.values);
        return stringArrayList == null ? this.ah$a : stringArrayList;
    }

    @Override // o.TransitionManager
    /* renamed from: ah$a */
    public void toString(androidx.fragment.app.Fragment fragment, TranslationAnimationCreator.TransitionPositionListener<?> transitionPositionListener, ArrayList<String> arrayList) {
        runAnimators.ag$a(fragment, "thisRef");
        runAnimators.ag$a(transitionPositionListener, "property");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            fragment.setArguments(arguments);
        }
        arguments.putStringArrayList(this.values, arrayList);
    }
}
