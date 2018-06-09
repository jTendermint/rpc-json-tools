package com.github.jtendermint.rpc.requests;

import com.github.jtendermint.rpc.TmRpcMethod;

public class DumpConsensusStateRequest extends TendermintRequest {

    protected DumpConsensusStateRequest(RequestBuilder builder) {
        super(builder);
    }

    public static RequestBuilder builder() {
        RequestBuilder builder = new RequestBuilder();
        builder.withMethod(TmRpcMethod.DUMP_CONSENSUS_STATE);
        return builder;
    }
}
