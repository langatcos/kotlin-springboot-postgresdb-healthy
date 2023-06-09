package com.wellhealth.healthy.repositories

import com.wellhealth.healthy.dataclasses.ClaimsCategories
import io.swagger.annotations.ApiOperation
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface ClaimsCategoriesRepository: CrudRepository<ClaimsCategories,String> {
    @Query("select * from claimscategoies where beneficiaryid=:beneficiaryid")
    fun findAllCategoriesbybeneficiaryid(beneficiaryid:Int):List<ClaimsCategories>

}