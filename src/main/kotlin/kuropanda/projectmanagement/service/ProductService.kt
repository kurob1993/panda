package kuropanda.projectmanagement.service

import kuropanda.projectmanagement.model.CreateProductRequest
import kuropanda.projectmanagement.model.ProductResponse

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

}