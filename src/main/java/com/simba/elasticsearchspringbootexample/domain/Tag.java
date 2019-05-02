package com.simba.elasticsearchspringbootexample.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author <a href="mailto:ElHadjiOmar.DIONE@orange-sonatel.com">podisto</a>
 * @since 2019-05-01
 */
@Document(indexName = "tags", type = "doc")
@Getter
@Setter
public class Tag {
    @Id
    private String id;
    private String userId;
    private String movieId;
    private String tag;

    @Override
    public String toString() {
        return "Tag{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", movieId='" + movieId + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}
