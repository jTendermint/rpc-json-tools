package com.github.jtendermint.rpc.mapper.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jtendermint.rpc.mapper.AbstractMapperFactory;

public final class SimpleJacksonMapperFactory extends AbstractMapperFactory<SimpleJacksonMapper> {

    @Override
    public SimpleJacksonMapper createMapper() {
        return new SimpleJacksonMapper(new ObjectMapper());
    }
}
