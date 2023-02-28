package com.project.controller
import com.project.datatransobj.NameDto
import com.project.service.NameService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/name")
class NameController(private val nameService: NameService) {


        @GetMapping
        fun getAll(): List<NameDto> = nameService.getAll()

        @PostMapping
        fun registerMaster(@RequestBody dto: NameDto): Int {
                 return nameService.registerMaster(dto)
        }





        }
