package com.project.controller

import com.project.datatransobj.NameDataTransObj
import com.project.service.NameService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/name")
class NameController(
        private val NameService: NameService
) {

        @GetMapping
        fun gerAll(): List<NameDataTransObj> = NameService.getAll()

        }
