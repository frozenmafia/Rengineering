package o;
/* loaded from: classes7.dex */
public final class PagerTitleStrip {
    public static final fakeDragBy toString = new fakeDragBy("NULL");
    public static final fakeDragBy ag$a = new fakeDragBy("UNINITIALIZED");
    public static final fakeDragBy ah$a = new fakeDragBy("DONE");

    /* loaded from: classes7.dex */
    public final class SingleLineAllCapsTransform {
        private static final fakeDragBy ag$a = new fakeDragBy("CLOSED");

        public static final /* synthetic */ fakeDragBy ah$a() {
            return ag$a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public final class PageListener<T> implements setPatternPath<T>, Scene {
        private final setPatternPath<T> ag$a;
        private final PropertyValuesHolderUtils ah$a;

        @Override // o.Scene
        public StackTraceElement getStackTraceElement() {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PageListener(setPatternPath<? super T> setpatternpath, PropertyValuesHolderUtils propertyValuesHolderUtils) {
            this.ag$a = setpatternpath;
            this.ah$a = propertyValuesHolderUtils;
        }

        @Override // o.setPatternPath
        public PropertyValuesHolderUtils getContext() {
            return this.ah$a;
        }

        @Override // o.Scene
        public Scene getCallerFrame() {
            setPatternPath<T> setpatternpath = this.ag$a;
            if (setpatternpath instanceof Scene) {
                return (Scene) setpatternpath;
            }
            return null;
        }

        @Override // o.setPatternPath
        public void resumeWith(Object obj) {
            this.ag$a.resumeWith(obj);
        }
    }
}
