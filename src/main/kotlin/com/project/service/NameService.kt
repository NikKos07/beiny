package com.project.service

import com.project.datatransobj.NameDto

interface NameService {


        fun getAll(): List<NameDto>

        fun findById(id:Int): NameDto

        fun search(prefix: String): List<NameDto>
}