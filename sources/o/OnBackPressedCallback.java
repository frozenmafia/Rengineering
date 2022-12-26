package o;

import java.io.IOException;
import o.ComponentActivity;
import o.OnBackPressedCallback;
import o.Styleable;
/* loaded from: classes.dex */
public interface OnBackPressedCallback {

    /* loaded from: classes.dex */
    public interface toString {
        public static final OnBackPressedCallback$toString$ah$a valueOf = OnBackPressedCallback$toString$ah$a.valueOf;

        void write(values valuesVar) throws IOException;
    }

    /* loaded from: classes.dex */
    public interface values {
        void ag$a(remove removeVar) throws IOException;

        void toString(Integer num) throws IOException;

        void values(String str) throws IOException;

        void values(ComponentActivity.NonConfigurationInstances nonConfigurationInstances, Object obj) throws IOException;
    }

    void ag$a(String str, Integer num) throws IOException;

    void ag$a(String str, toString tostring) throws IOException;

    void ag$a(String str, remove removeVar) throws IOException;

    void ah$a(String str, String str2) throws IOException;

    void ah$a(String str, ComponentActivity.NonConfigurationInstances nonConfigurationInstances, Object obj) throws IOException;

    void ah$a(String str, Styleable.ChangeBounds<? super values, setAnimationMatrix> changeBounds);

    void toString(String str, Double d) throws IOException;

    void valueOf(String str, Boolean bool) throws IOException;

    /* loaded from: classes.dex */
    public static final class valueOf {
        public static void values(OnBackPressedCallback onBackPressedCallback, String str, final Styleable.ChangeBounds<? super values, setAnimationMatrix> changeBounds) {
            runAnimators.valueOf(str, "fieldName");
            runAnimators.valueOf(changeBounds, "block");
            onBackPressedCallback.ag$a(str, new toString() { // from class: o.OnBackPressedCallback$valueOf$ah$a
                @Override // o.OnBackPressedCallback.toString
                public void write(OnBackPressedCallback.values valuesVar) {
                    runAnimators.valueOf(valuesVar, "listItemWriter");
                    Styleable.ChangeBounds.this.invoke(valuesVar);
                }
            });
        }
    }
}
