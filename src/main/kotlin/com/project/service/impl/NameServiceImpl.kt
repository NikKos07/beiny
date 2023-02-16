package com.project.service.impl

import com.project.datatransobj.NameDataTransObj
import com.project.entity.NameEntity
import com.project.repository.NameRepository
import com.project.service.NameService
import org.springframework.stereotype.Service

@Service
class NameServiceImpl(
    private val nameRepository: NameRepository
    ) : NameService {

    override fun getAll(): List<NameDataTransObj> {
        return nameRepository.findAll()
            .map { NameDataTransObj(
                id = it.id,
                firstname = it.firstname,
                age = it.age,
                email = it.email,
                passw = it.passw,
                lastname = it.lastname,
                profession = it.profession,
            )
            }

    }

    private fun NameEntity.toDataTransObj(): NameDataTransObj =
        NameDataTransObj(
            id = this.id,
            age = this.age,
            firstname = this.firstname,
            email = this.email,
            passw = this.passw,
            lastname = this.lastname,
            profession = this.profession,
        )
}