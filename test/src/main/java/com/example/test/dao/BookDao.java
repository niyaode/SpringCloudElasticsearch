package com.example.test.dao;

import com.example.test.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by 煮剑焚酒.
 * QQ:1397257618
 * User: sdake
 * Date: 2019/7/8
 * Time: 17:06
 */
public interface BookDao extends JpaRepository<BookEntity,Long>, JpaSpecificationExecutor<BookEntity> {
}
