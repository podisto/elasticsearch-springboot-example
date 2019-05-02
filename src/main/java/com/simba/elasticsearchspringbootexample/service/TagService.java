package com.simba.elasticsearchspringbootexample.service;

import com.simba.elasticsearchspringbootexample.domain.Tag;

import java.util.stream.Stream;

/**
 * @author <a href="mailto:ElHadjiOmar.DIONE@orange-sonatel.com">podisto</a>
 * @since 2019-05-01
 */
public interface TagService {
    Stream<Tag> getAll();
}
