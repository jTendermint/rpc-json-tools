package com.github.jtendermint.rpc.responses;

import com.github.jtendermint.rpc.mapper.CouldNotReadJsonException;
import com.github.jtendermint.rpc.mapper.IMapper;

public abstract class ResponseHelper {

    protected final IMapper mapper;

    public ResponseHelper(IMapper mapper) {
        this.mapper = mapper;
    }

    public Long getIdAsLong(String json) throws CouldNotReadJsonException {
        String rawId = getRawId(json);
        return Long.parseLong(rawId.substring(rawId.indexOf('.') + 1, rawId.length()));
    }

    public String getRawId(String json) throws CouldNotReadJsonException {
        return mapper.getFieldAsString(json, "id");
    }


}
