package com.project.repository

import com.project.entity.NameEntity
import org.springframework.data.repository.CrudRepository


interface NameRepository: CrudRepository<NameEntity, Int>


