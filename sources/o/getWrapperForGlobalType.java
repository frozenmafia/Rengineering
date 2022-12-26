package o;

import com.google.protobuf.GeneratedMessageLite;
/* loaded from: classes5.dex */
final class getWrapperForGlobalType implements createViewTypeWrapper {
    @Override // o.createViewTypeWrapper
    public Object values(Object obj) {
        return ((GeneratedMessageLite) obj).toString(GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }
}
