package o;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import o.getUpperBound;
import o.invokeSuspend;
/* loaded from: classes3.dex */
public class buildAnimationMask<Model> implements getUpperBound<Model, Model> {
    private static final buildAnimationMask<?> values = new buildAnimationMask<>();

    @Override // o.getUpperBound
    public boolean toString(Model model) {
        return true;
    }

    public static <T> buildAnimationMask<T> values() {
        return (buildAnimationMask<T>) values;
    }

    @Override // o.getUpperBound
    public getUpperBound.valueOf<Model> ah$a(Model model, int i, int i2, setMargins setmargins) {
        return new getUpperBound.valueOf<>(new hideForType(model), new values(model));
    }

    /* loaded from: classes3.dex */
    static class values<Model> implements invokeSuspend<Model> {
        private final Model valueOf;

        @Override // o.invokeSuspend
        public void valueOf() {
        }

        @Override // o.invokeSuspend
        public void values() {
        }

        values(Model model) {
            this.valueOf = model;
        }

        @Override // o.invokeSuspend
        public void valueOf(Priority priority, invokeSuspend.toString<? super Model> tostring) {
            tostring.values((invokeSuspend.toString<? super Model>) ((Model) this.valueOf));
        }

        @Override // o.invokeSuspend
        public Class<Model> ag$a() {
            return (Class<Model>) this.valueOf.getClass();
        }

        @Override // o.invokeSuspend
        public DataSource ah$a() {
            return DataSource.LOCAL;
        }
    }
}
