package o;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.Writer;
import java.io.IOException;
import java.util.Map;
import o.ItemTouchHelper;
import o.getSelectedDxDy$ah$a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public abstract class checkHorizontalSwipe<T extends getSelectedDxDy$ah$a<T>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void ag$a(ByteString byteString, Object obj, ItemTouchHelper itemTouchHelper, getSelectedDxDy<T> getselecteddxdy) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void ag$a(Writer writer, Map.Entry<?, ?> entry) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int ah$a(Map.Entry<?, ?> entry);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <UT, UB> UB ah$a(chooseDropTarget choosedroptarget, Object obj, ItemTouchHelper itemTouchHelper, getSelectedDxDy<T> getselecteddxdy, UB ub, getSwipeEscapeVelocity<UT, UB> getswipeescapevelocity) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract getSelectedDxDy<T> toString(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object valueOf(ItemTouchHelper itemTouchHelper, ItemTouchHelper.AnonymousClass3 anonymousClass3, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void valueOf(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean valueOf(ItemTouchHelper.AnonymousClass3 anonymousClass3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract getSelectedDxDy<T> values(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void values(chooseDropTarget choosedroptarget, Object obj, ItemTouchHelper itemTouchHelper, getSelectedDxDy<T> getselecteddxdy) throws IOException;
}
