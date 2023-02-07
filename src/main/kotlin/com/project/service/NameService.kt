package com.project.service

import com.project.datatransobj.NameDataTransObj

interface NameService {

        fun getAll(): List<NameDataTransObj>
}