package com.simba.elasticsearchspringbootexample.service;

import com.simba.elasticsearchspringbootexample.domain.Tag;
import com.simba.elasticsearchspringbootexample.repository.TagRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * @author <a href="mailto:ElHadjiOmar.DIONE@orange-sonatel.com">podisto</a>
 * @since 2019-05-01
 */
@Service
@Slf4j
public class TagServiceImpl implements TagService {
    private final TagRepository tagRepository;

    public TagServiceImpl(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    @Override
    public Stream<Tag> getAll() {
        Stream<Tag> stream = StreamSupport.stream(tagRepository.findAll().spliterator(), false);
        log.info("result size {} ", stream.collect(Collectors.toList()));
        return Stream.empty();
    }
}
