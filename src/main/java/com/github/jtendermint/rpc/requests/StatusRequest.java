package com.github.jtendermint.rpc.requests;

import com.github.jtendermint.rpc.TmRpcMethod;

public class StatusRequest extends TendermintRequest {

    protected StatusRequest(RequestBuilder builder) {
        super(builder);
    }

    public static RequestBuilder builder() {
        RequestBuilder builder = new RequestBuilder();
        builder.withMethod(TmRpcMethod.STATUS);
        return builder;
    }
}
