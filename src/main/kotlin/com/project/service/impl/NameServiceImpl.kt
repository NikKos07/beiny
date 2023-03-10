package com.project.service.impl

import com.project.datatransobj.NameDto
import com.project.entity.NameEntity
import com.project.repository.NameRepository
import com.project.service.NameService
import org.springframework.stereotype.Service


@Service
class NameServiceImpl(private val nameRepository: NameRepository ) : NameService{

    override fun getAll(): List<NameDto> {
        return nameRepository.findAll()
            .map {it.toDataTransObj()
            }

    }

    override fun registerMaster(dto: NameDto): Int {
        return nameRepository.save(dto.toEntity()).id
    }




    private fun NameEntity.toDataTransObj(): NameDto =
        NameDto(
            id = this.id,
            firstname = this.firstname,
            lastname = this.lastname,
            email = this.email,
            age = this.age,
            passw = this.passw,
            profession = this.profession,
            phone = this.phone
        )

    private fun NameDto.toEntity(): NameEntity =
        NameEntity(
            id= 0,
            firstname = this.firstname,
            lastname = this.lastname,
            email = this.email,
            age = this.age,
            passw = this.passw,
            profession = this.profession,
            phone = this.phone
        )
}