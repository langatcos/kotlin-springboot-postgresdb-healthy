package com.wellhealth.healthy.dataclasses

import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.annotation.Id
import java.time.Instant
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType

@Table("users")
data class Users (
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val userid:Int?,
    val entityid:Int,
    val firstname:String,
    val surname:String,
    val username:String,
    val dob:String,
    val gender:String,
    var active:String,
    val branch:String,
    val created_at:Instant?,
    val userpwd:String
)