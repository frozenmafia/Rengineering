package butterknife;

import butterknife.internal.ListenerClass;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ListenerClass
/* loaded from: classes.dex */
public @interface OnPageChange {

    /* loaded from: classes6.dex */
    public enum Callback {
        PAGE_SELECTED,
        PAGE_SCROLLED,
        PAGE_SCROLL_STATE_CHANGED
    }
}
