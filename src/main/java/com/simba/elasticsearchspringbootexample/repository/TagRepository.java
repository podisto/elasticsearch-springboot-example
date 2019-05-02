package com.simba.elasticsearchspringbootexample.repository;

import com.simba.elasticsearchspringbootexample.domain.Tag;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author <a href="mailto:ElHadjiOmar.DIONE@orange-sonatel.com">podisto</a>
 * @since 2019-05-01
 */
public interface TagRepository extends ElasticsearchRepository<Tag, String> {
}
