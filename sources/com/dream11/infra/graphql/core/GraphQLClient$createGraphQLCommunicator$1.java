package com.dream11.infra.graphql.core;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.getDrawerViewAbsoluteGravity;
import o.onBackPressed;
import o.onStateChanged;
import o.runAnimators;
/* loaded from: classes4.dex */
public final /* synthetic */ class GraphQLClient$createGraphQLCommunicator$1 extends FunctionReferenceImpl implements Styleable.ChangeBounds<onStateChanged<?, ?, ?>, onBackPressed> {
    public GraphQLClient$createGraphQLCommunicator$1(Object obj) {
        super(1, obj, getDrawerViewAbsoluteGravity.class, "getApolloClient", "getApolloClient(Lcom/apollographql/apollo/api/Operation;)Lcom/apollographql/apollo/ApolloClient;", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public final onBackPressed invoke(onStateChanged<?, ?, ?> onstatechanged) {
        runAnimators.ag$a(onstatechanged, "p0");
        return ((getDrawerViewAbsoluteGravity) this.receiver).ah$a(onstatechanged);
    }
}
