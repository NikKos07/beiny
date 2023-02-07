package com.project.service.impl

import com.project.datatransobj.NameDataTransObj
import com.project.service.NameService
import org.springframework.stereotype.Service

@Service
class NameServiceImpl : NameService {


    override fun getAll(): List<NameDataTransObj> {
        return listOf(
            NameDataTransObj(1, "Иван", 35),
            NameDataTransObj(2, "Вася", 15),
        )
    }
}