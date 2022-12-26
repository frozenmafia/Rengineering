package o;

import com.apollographql.apollo.api.ResponseField;
import java.util.List;
/* loaded from: classes.dex */
public interface hasEnabledCallbacks {

    /* loaded from: classes.dex */
    public interface valueOf {
        void ag$a(Integer num);

        <T> void ag$a(List<? extends T> list, Transition<? super List<? extends T>, ? super valueOf, setAnimationMatrix> transition);

        void valueOf(String str);

        <T> void values(List<? extends T> list, hasEnabledCallbacks$ah$a<T> hasenabledcallbacks_ah_a);

        void values(addCallback addcallback);
    }

    void ah$a(ResponseField responseField, Integer num);

    <T> void ah$a(ResponseField responseField, List<? extends T> list, hasEnabledCallbacks$ah$a<T> hasenabledcallbacks_ah_a);

    void toString(ResponseField.valueOf valueof, Object obj);

    void toString(ResponseField responseField, Boolean bool);

    void toString(addCallback addcallback);

    void valueOf(ResponseField responseField, Double d);

    void values(ResponseField responseField, String str);

    <T> void values(ResponseField responseField, List<? extends T> list, Transition<? super List<? extends T>, ? super valueOf, setAnimationMatrix> transition);

    void values(ResponseField responseField, addCallback addcallback);
}
