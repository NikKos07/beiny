package com.project.service.impl

import com.project.datatransobj.NameDto
import com.project.entity.NameEntity
import com.project.repository.NameRepository
import com.project.service.NameService
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class NameServiceImpl(
    private val nameRepository: NameRepository,
) : NameService {

    override fun getAll(): List<NameDto> {
        return nameRepository.findAll()
            .map {it.toDto()
            }

    }

    override fun findById(id: Int): NameDto {
        return nameRepository.findByIdOrNull(id)
            ?.toDto()
            //Если запись не найден, выводится нот фаунд. Код ниже.
            ?: throw RuntimeException("Имя не найдено")
    }

    override fun getById(id: Int): NameDto {
        return nameRepository.findByIdOrNull(id)
            ?.toDto()
            ?: throw RuntimeException("Имя не найдено")
    }


    override fun search(prefix: String): List<NameDto> =
        nameRepository.findByNameStartsWithIgnoreCaseOrderByName(prefix)
    .map { it.toDto() }

    private fun NameEntity.toDto(): NameDto =
        NameDto(
            id = this.id,
            firstname = this.firstname,
            lastname = this.lastname,
            email = this.email,
            age = this.age,
            passw = this.passw,
            profession = this.profession,
        )
}

