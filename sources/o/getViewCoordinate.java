package o;

import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class getViewCoordinate {
    public static final <T> void toString(Appendable appendable, T t, Styleable.ChangeBounds<? super T, ? extends CharSequence> changeBounds) {
        runAnimators.ag$a(appendable, "<this>");
        if (changeBounds != null) {
            appendable.append(changeBounds.invoke(t));
            return;
        }
        if (t == null ? true : t instanceof CharSequence) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
