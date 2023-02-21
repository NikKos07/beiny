package com.project.controller

import com.project.datatransobj.NameDto
import com.project.service.NameService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/name")
class NameController(private val nameService: NameService,) {


        @GetMapping
        fun getAll(): List<NameDto> = nameService.getAll()

//Для запроса пишем путь .../"любой id". Строчка кода ниже.
        @GetMapping("/{id}")
        fun getById(@PathVariable("id") id: Int): NameDto =
                nameService.getById(id)


        @GetMapping("/search")
        fun searchName(@RequestParam("prefix") prefix: String): List<NameDto> =
                nameService.search(prefix)

        }
