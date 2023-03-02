package com.project.entity

import jakarta.persistence.*


@Entity
@Table(name ="master")
class NameEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    val lastname: String = "",
    val firstname: String = "",
    val email: String = "",
    val age: Int = 0,
    val passw: String = "",
    val profession: String = "",
    val phone:Long = 7
)