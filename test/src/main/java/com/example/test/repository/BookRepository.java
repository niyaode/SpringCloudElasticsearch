package com.example.test.repository;

import com.example.test.entity.BookEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by 煮剑焚酒.
 * QQ:1397257618
 * User: sdake
 * Date: 2019/7/8
 * Time: 11:39
 */
public interface BookRepository extends ElasticsearchRepository<BookEntity,Long>
{
}
