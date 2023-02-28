package com.project.service

import com.project.datatransobj.NameDto

interface NameService {

        fun getAll(): List<NameDto>
        fun registerMaster(dto: NameDto) :Int

}