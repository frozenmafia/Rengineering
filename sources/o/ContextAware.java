package o;

import o.R;
import o.R.styleable;
/* loaded from: classes.dex */
public abstract class ContextAware<T extends R.styleable> {
    private ContextAware<? extends R.styleable> ah$a;

    public abstract T toString(clearAvailableContext clearavailablecontext);

    public final R.styleable valueOf(clearAvailableContext clearavailablecontext) {
        runAnimators.valueOf(clearavailablecontext, "recordFieldAdapter");
        ContextAware<? extends R.styleable> contextAware = this.ah$a;
        if (contextAware != null) {
            return toString(clearavailablecontext).toString(contextAware.valueOf(clearavailablecontext));
        }
        return toString(clearavailablecontext);
    }
}
